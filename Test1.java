package SeleniumTest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Test1 {

	public static void main(String[] args) {
		//System.setProperty("webdriver.firefox.marionette","G:\\Selenium\\Firefox driver\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver","G:\\Selenium\\Firefox driver\\geckodriver.exe");
		//System.setProperty("webdriver.firefox.marionette","D:\\Software\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver","D:\\Software\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver","d://geckodriver.exe");
		
		WebDriver wd1 = new FirefoxDriver();
		
				
				WebDriver wd = new FirefoxDriver();
				
				wd1.close();
}
	
}
