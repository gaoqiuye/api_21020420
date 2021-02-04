package com.lemon.api.auto;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//区别于3：这个从表格中读取数据连续的行数，且把文件，行数用变量的形式表现出来
/*
 * 完成注册接口的测试
 * 
 */
public class RegisterCase2_v4 {
	/*mobilephone:"19111111111",pword:""
	 * mobilephone:"",pword:"123456"
	 * mobilephone:"19111111111",pword:"123456"
	 * 
	 * 
	 */

	@Test(dataProvider="datas")
	public void test1(String mobilephone,String pword) {
		String url="https://test9.zhixueyun.com/oauth/api/v1/auth";
		Map<String, String> params=new HashMap<String, String>();
		params.put("mobilephone", mobilephone);
		params.put("pword", pword);
		HttpUtil.doPost(url, params);
	}
	
	//数据存放在表格中POI
	@DataProvider
	public Object[][] datas(){
		Object[][]datas= ExcelUtil_v4.datas("src/test/resources/case_v1.xls",2,7,6,7);//行号，列号范围
		return datas;
	}
}













