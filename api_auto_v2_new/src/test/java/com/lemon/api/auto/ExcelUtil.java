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

public class ExcelUtil {
	public  static Object[][] datas() {
		String excelPath="src/test/resources/case_v1.xls";
		Object[][] datas=null;
		//获取workbook对象
		try {
			Workbook workbook=WorkbookFactory.create(new File(excelPath));
			//获取sheet对象
			Sheet sheet=workbook.getSheet("用例");
			//获取行
			//sheet.getRow(1); //从第二行开始取，一共取6行
			
			datas=new Object[6][2]; //6行2列 （几组数据，每组数据里有几个值）
			for (int i=1;i<=6;i++) {
				Row row=sheet.getRow(i);
				//获取到每一行后 再获取该行的列，手机号和密码分别在第五列和第六列
				//Cell cell=row.getCell(5);  从第五列开始，取到第六列
				for(int j=5;j<=6;j++) {
					Cell cell=row.getCell(j,MissingCellPolicy.CREATE_NULL_AS_BLANK); //通过每一行取出每一列,j后面加的这个后，如果参数值为空则返回空而不是null
					//将列设置为字符串类型
					cell.setCellType(CellType.STRING);
					//取出每列的值
					String value=cell.getStringCellValue();
					datas[i-1][j-5]=value;  //第一组数据是datas[0][0]
					
				}
				
			}
			
			//获取列
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		return datas;
	}
	
	public static void main(String[] args) {
		Object[][] datas=datas();//二维数据
		for(Object[] objects:datas) { //通过第一次循环取出每一组
			for(Object object:objects) {//通过第二次循环取出每一组里面的数据
				System.out.println("【"+object+"】");//+所有结果在一行显示+
				//System.out.println("object");
			}
			System.out.println(); //每一组换行显示
		}
	}
	
}
















