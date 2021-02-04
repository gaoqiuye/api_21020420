package com.lemon.api.auto;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//区别于1：这个采用数据提供者的方法
/*
 * 完成注册接口的测试
 * 
 */
public class RegisterCase2_v2 {
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
	
	@DataProvider
	public Object[][] datas(){
		Object[][]datas= {
				{"19111111111",""},
				{"","123456"},
				{"19111111111",""},
		};
		return datas;
	}
}
