package com.abc.magentomain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.magentoobjects.Home;
import com.abc.magentoobjects.Login;
import com.abc.magentoobjects.Welcome;

public class MagentoTest {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.magento.com");
		Welcome w=new Welcome(driver);
		w.clickonMyAccount();
		
		Login l=new Login(driver);
		l.typeEmail("sabika231998@gmail.com");
		l.typePassword("SABEEKA@123");
		l.clickonlogin();
		
		Home h=new Home(driver);
		h.clickonlogout();
		driver.quit();

	}

}
