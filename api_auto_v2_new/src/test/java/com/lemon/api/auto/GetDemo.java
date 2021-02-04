package com.lemon.api.auto;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
//login-post:https://test9.zhixueyun.com/oauth/api/v1/auth
public class GetDemo {
	public static void main(String[] args) throws ClientProtocolException, IOException {
		//填写接口地址
		String url="https://test9.zhixueyun.com/oauth/api/v1/auth";
		//准备测试数据
		String mobilephone="18611111111";
		String pword="123456";
		Map<String, String> params=new HashMap<String, String>();
		params.put("mobilephone", mobilephone);
		params.put("pword", pword);
		System.out.println(doGet(url,params));
		//System.out.println(HttpUtil.doGet(url, params));
	}
	
	public static String doGet(String url,Map<String, String> params) {
		Set<String> keys=params.keySet();
		//定义一个标志位
		int mark=1;
		for (String name:keys) {
			if(mark==1) {
				url+=("?"+name+"="+params.get(name));
			}else {
				url+=("&"+name+"="+params.get(name));
			}
			mark++;
		}
		System.out.println("url="+url);
		//填写接口地址
				//String url="https://test9.zhixueyun.com/oauth/api/v1/auth";
				//准备测试数据
				//String mobilephone="18911111111";
				//String pword="123456";
				//url+=("?mobilephone=1111&pword=123456");
				//System.out.println(url);
				//指定接口提交的方式
				HttpGet get=new HttpGet(url);
				//发送请求，拿到响应数据
				HttpClient httpClient=HttpClients.createDefault();
				HttpResponse httpResponse;
				String result="";
				try {
					httpResponse = httpClient.execute(get);
					int code=httpResponse.getStatusLine().getStatusCode();
					result=EntityUtils.toString(httpResponse.getEntity());
				} catch (Exception e) {
				
					e.printStackTrace();
				}
				return result;
		
	}
}
