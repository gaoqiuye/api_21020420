package com.lemon.api.auto;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class PostDemo {
	public static void main(String[] args) throws ClientProtocolException, IOException {
		//填写接口地址
		String url="http://119.23.241.154:8080/futureloan/mvc/api/member/register";
		//指定接口请求方式:post
		HttpPost post= new HttpPost(url);
		//准备测试数据
		String username="18665922158";
		String pword="123456";
		Map<String, String> params=new HashMap<String, String>();
		params.put("username", username);
		params.put("pword", pword);
		//System.out.println(doPost(url,params));
		System.out.println(HttpUtil.doPost(url, params));
		
		
	}
	/*
	public static  String doPost(String url,Map<String, String> params) {
		//填写接口地址
				//String url="https://test9.zhixueyun.com/oauth/api/v1/auth";
				//指定接口请求方式:post
				HttpPost post= new HttpPost(url);
				//准备测试数据
				//String username="AYtklRXReTwQQQTGVHtvGw==";
				//String pword="0GrD6MYSpX0BOZW15fev2w==";
				//基本键值对
				List<BasicNameValuePair> parameters=new ArrayList<BasicNameValuePair>();
				//取出map中所有的参数名
				Set<String> keys=params.keySet();
				//通过循环将参数保存在list集合
				for(String name:keys) {
					String value=params.get(name);
					parameters.add(new BasicNameValuePair(name,value));
				}
//				parameters.add(new BasicNameValuePair("username", username));
//				parameters.add(new BasicNameValuePair("pword", pword));
				String result="";
				//setEntity 设置消息
				try {
					post.setEntity(new UrlEncodedFormEntity(parameters, "utf-8"));
					//准备请求头数据（如果有需要，比如cookie，content-type）
					//发起请求，获取接口响应信息（状态码，响应报文或某些特殊的响应头数据）
					HttpClient client=HttpClients.createDefault();
					HttpResponse httpResponse=client.execute(post);
					//状态码
					int code =httpResponse.getStatusLine().getStatusCode();
					System.out.println(code);
					//从响应对象中获取返回数据
					httpResponse.getEntity();// json格式
					//System.out.println(httpResponse.getEntity());
					result=EntityUtils.toString(httpResponse.getEntity());//json格式转换成字符串格式
				
				} catch ( Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return result;
	}

*/

}