package packege1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1_practical {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://devuser8652.traceablelive.com/auth/login");
		Thread.sleep(5000);
		String FirstTab = driver.getWindowHandle();
		driver.findElement(By.id ("kt_login_signup")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"kt_form\"]/div[1]/div/div/div[1]/div[1]/div/input")).sendKeys("DEV");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"kt_form\"]/div[1]/div/div/div[1]/div[2]/div/input")).sendKeys("DEMO");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"kt_form\"]/div[1]/div/div/div[1]/div[3]/div/input")).sendKeys("dev.demo120801@mailinator.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"kt_form\"]/div[1]/div/div/div[2]/div[1]/div/input")).sendKeys("*aA123123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"kt_form\"]/div[1]/div/div/div[2]/div[2]/div/input")).sendKeys("*aA123123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"kt_form\"]/div[6]/div[2]/button")).click();
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
		driver.get("https://www.mailinator.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("search")).sendKeys("dev.demo120801@mailinator.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"site-header\"]/div[1]/div/div/div[1]/div/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"row_dev.demo120801-1754980408-013891042013\"]/td[2]")).click();
		Thread.sleep(2000);          
		String otp = driver.findElement(By.id("lblCode")).getText();
		System.out.println("OTP: " + otp);
		Thread.sleep(5000);
		driver.switchTo().window(FirstTab);
		Thread.sleep(2000);
		driver.findElement(By.id("otp")).sendKeys(otp);
		
		
		
		
		

	}

}
