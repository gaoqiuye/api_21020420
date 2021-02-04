package com.lemon.api.auto;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
		String url="https://test9.zhixueyun.com/oauth/api/v1/auth";
		//指定接口请求方式:post
		HttpPost post= new HttpPost(url);
		//准备测试数据
		String username="AYtklRXReTwQQQTGVHtvGw==";
		String pword="0GrD6MYSpX0BOZW15fev2w==";
		String key="oZImo5zozQggF2BymfTc090trJ3N6xyWfo18/8Lp7jTh8l2v5iCDg5phuOMsAthCWpnEJqsiMBtxMaMJ+1oBvaY4o9ONCHnNuQ636V9wYD1Pxx2LmlcwBT1q22qsgUy3RvVeifSftrJ7gHAUg1HZSQlduECrSlKyVdhOhwrPqzN/Hg66IvzxQzsmJBNLfNtZId0EjAI5s4K5uPj1iZhTz9GhWF1WR9xFzb/EY7FhB1U=";
		String organization_id="4oBa32nbo82JqlYlhOLupBp5MagU51AmMUoxRpCV25VNZzpQ+62WxzM5qrBO0uGP";
		String login_method="JZNm+1f9txtGtiE0oRMJ1g==";
		//基本键值对
		List<BasicNameValuePair> parameters=new ArrayList<BasicNameValuePair>();
		
		parameters.add(new BasicNameValuePair("key", key));
		parameters.add(new BasicNameValuePair("organization_id", organization_id));
		parameters.add(new BasicNameValuePair("login_method", login_method));
		parameters.add(new BasicNameValuePair("username", username));//参数名，参数值
		parameters.add(new BasicNameValuePair("pword", pword));
		//setEntity 设置消息
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
		String result=EntityUtils.toString(httpResponse.getEntity());//json格式转换成字符串格式
		System.out.println(result);
		
	}
}
