package fitpeo;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationTester {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fitpeo.com/home");
		driver.get("https://www.fitpeo.com/revenue-calculator");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		WebElement slider=driver.findElement(By.cssSelector(".MuiSlider-thumb "));
		Actions ac =new Actions(driver);
		ac.dragAndDropBy(slider, 94, 0).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='number']")).sendKeys("560");
        JavascriptExecutor jn=(JavascriptExecutor)driver;
			jn.executeScript("window.scrollBy(0,300)");
			Thread.sleep(2000);
	     driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
	     driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
	     driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
	     String totalReimbursement = driver.findElement(By.cssSelector("p:nth-child(4) p:nth-child(1)")).getText();
	        if (totalReimbursement.equals("$110700")) {
	            System.out.println("Total Recurring Reimbursement is correct: $110700");
	        } else {
	            System.out.println("Total Recurring Reimbursement is incorrect");
	        }

	        driver.quit();
		
		}

}
