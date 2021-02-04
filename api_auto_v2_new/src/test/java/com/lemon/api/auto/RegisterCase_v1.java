package com.lemon.api.auto;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

/*
 * 完成注册接口的测试
 * 
 */
public class RegisterCase_v1 {
	/*mobilephone:"19111111111",pword:""
	 * mobilephone:"",pword:"123456"
	 * mobilephone:"19111111111",pword:"123456"
	 * 
	 */

	@Test
	public void test1() {
		String url="https://test9.zhixueyun.com/oauth/api/v1/auth";
		Map<String, String> params=new HashMap<String, String>();
		params.put("mobilephone", "19111111111");
		params.put("pword", "");
		HttpUtil.doPost(url, params);
	}
	@Test
	public void test2() {
		String url="https://test9.zhixueyun.com/oauth/api/v1/auth";
		Map<String, String> params=new HashMap<String, String>();
		params.put("mobilephone", "");
		params.put("pword", "123456");
		HttpUtil.doPost(url, params);
	}
	@Test
	public void test3() {
		String url="https://test9.zhixueyun.com/oauth/api/v1/auth";
		Map<String, String> params=new HashMap<String, String>();
		params.put("mobilephone", "19111111111");
		params.put("pword", "123456");
		HttpUtil.doPost(url, params);
	}
}
