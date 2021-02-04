package com.lemon.api.auto;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class GetDemo {
	public static void main(String[] args) throws ClientProtocolException, IOException {
		//填写接口地址
		String url="https://test9.zhixueyun.com/oauth/api/v1/auth";
		//准备测试数据
		String mobilephone="18911111111";
		String pword="123456";
		url+=("?mobilephone="+mobilephone+"&pword="+pword);
		System.out.println(url);
		//指定接口提交的方式
		HttpGet get=new HttpGet(url);
		//发送请求，拿到响应数据
		HttpClient httpClient=HttpClients.createDefault();
		HttpResponse httpResponse=httpClient.execute(get);
		int code=httpResponse.getStatusLine().getStatusCode();
		String result=EntityUtils.toString(httpResponse.getEntity());
		System.out.println(result);
	}
}
