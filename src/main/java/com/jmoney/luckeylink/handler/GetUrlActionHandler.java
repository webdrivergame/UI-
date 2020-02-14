package com.jmoney.luckeylink.handler;

import java.util.concurrent.TimeUnit;

import com.jmoney.luckeylink.base.TestStep;

public class GetUrlActionHandler {
	
	/**
	 * <br>Web端打开网站链接操作</br>
	 * 
	 * @param step
	 * @throws Exception 
	 */
	public void webGeturl(TestStep step) throws Exception {
		System.out.println("『正常测试』开始执行: " + "<" +step.getDesc() + ">");
		step.getWebDriver().get(step.getValue());
		System.out.println("输入Url地址ok");
		//step.getWebDriver().manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
	}
	
	/**
	 * <br>Android端打开网站链接操作</br>
	 * 
	 * @param step
	 * @throws Exception 
	 */
	public void androidGeturl(TestStep step) throws Exception {
		System.out.println("『正常测试』开始执行: " + "<" +step.getDesc() + ">");
		step.getAndroidDriver().get(step.getValue());	
		step.getAndroidDriver().manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
	}
}
