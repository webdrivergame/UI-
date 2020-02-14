package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.jmoney.luckeylink.base.TestUnit;
import com.jmoney.luckeylink.service.RunUnitService;
import com.jmoney.luckeylink.service.WebXmlParseService;

public class SearchProcess {
	
	private static RunUnitService runService;
	private static WebDriver driver;
	
	@BeforeTest
	private void before() {
		TestUnit testunit = WebXmlParseService.parse("谷歌浏览器", "SearchProcess.xml");
		runService = new RunUnitService(testunit);



	}
	
//	@Test
//	public void Precondition() throws Exception{
//		runService.runCase("前置条件");
//	}
	
	@Test
	public void case1() throws Exception{
		runService.runCase("case1");

	}
	
	@Test
	public void case2() throws Exception{
		runService.runCase("case2");
	}
	
	@AfterTest
	public void TearDown(){
		runService.closeBrowser();
	}
}
