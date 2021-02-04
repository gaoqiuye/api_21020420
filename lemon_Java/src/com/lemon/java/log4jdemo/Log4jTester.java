package com.lemon.java.log4jdemo;

import org.apache.log4j.Logger;

public class Log4jTester {
	public   Logger logger=Logger.getLogger(Log4jTester.class);
	
	public static void main(String[] args) {
		Log4jTester log4jTester=new Log4jTester();
		log4jTester.test();
	}
	
	public   void test() {
		//记录debug级别额日志
		logger.debug("这是我的debug级别的日志");
		logger.info("这是我的info级别的日志");
		logger.warn("这是我的warn级别的日志");
		//记录error级别额日志
		logger.error("这是我的error级别的日志");
	}
}
