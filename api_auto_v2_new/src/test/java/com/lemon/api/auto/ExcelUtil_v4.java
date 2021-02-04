package com.lemon.api.auto;


import java.io.File;
//import java.io.IOException;
//
//import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.omg.CORBA.OBJ_ADAPTER;
//import org.testng.reporters.jq.Main;

/*
 * excelPath:用例文件路径
 * startRow:行号 而不是行索引
 * startCell：列号
 * 
 * rows:行号数组
 * cells:列号数组
 */

public class ExcelUtil_v4 {
	public  static Object[][] datas(String excelPath,int startRow,int endRow,int startCell,int endCell) { 
		//这个只适用于连续的行号，列号，如果取某行某列可以写成  int[3,5,8]rows,int[5,8,9]cells
		//String excelPath="src/test/resources/case_v1.xls";
		Object[][] datas=null;
		//获取workbook对象
		try {
			Workbook workbook=WorkbookFactory.create(new File(excelPath));
			//获取sheet对象
			Sheet sheet=workbook.getSheet("用例");
			//获取行
			//sheet.getRow(1); //从第二行开始取，一共取6行
			
			//datas=new Object[6][2]; //6行2列 （几组数据，每组数据里有几个值）
			datas=new Object[endRow-startRow+1][endCell-startCell+1];
			for (int i=startRow;i<=endRow;i++) {
				Row row=sheet.getRow(i-1);
				//获取到每一行后 再获取该行的列，手机号和密码分别在第五列和第六列
				//Cell cell=row.getCell(5);  从第五列开始，取到第六列
				for(int j=startCell;j<=endCell;j++) {
					Cell cell=row.getCell(j-1,MissingCellPolicy.CREATE_NULL_AS_BLANK); //通过每一行取出每一列,j后面加的这个后，如果参数值为空则返回空而不是null
					//将列设置为字符串类型
					cell.setCellType(CellType.STRING);
					//取出每列的值
					String value=cell.getStringCellValue();
					datas[i-startRow][j-startCell]=value;  //第一组数据是datas[0][0]
					
				}
				
			}
			
			//获取列
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		return datas;
	}

	

	
}
















