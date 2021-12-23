package squr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.calculator.net");
		
		wd.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		
		wd.findElement(By.xpath("//span[contains(text(),'×')]")).click();
		
		wd.findElement(By.xpath("//span[contains(text(),'5')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'5')]")).click();
		
		String Mul =  wd.findElement(By.xpath("//div[@id='sciInPut']")).getText();
		System.out.println(Mul);
		
		String Total =  wd.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
		System.out.println("Multiplication is   :" +Total);
		
		Thread.sleep(3000);  
		wd.findElement(By.xpath("//span[contains(text(),'AC')]")).click();
		
		wd.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		wd.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		wd.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		wd.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		
		wd.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[4]")).click();
		
		wd.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		wd.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		wd.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		
		
		String Div =  wd.findElement(By.xpath("//div[@id='sciInPut']")).getText();
		System.out.println(Div);
		
		String Total1 =  wd.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
		System.out.println("Division is   :" +Total1);
		
		Thread.sleep(3000);  
		wd.findElement(By.xpath("//span[contains(text(),'AC')]")).click();
		
		wd.findElement(By.xpath("//span[contains(text(),'–')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		
		wd.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[1]/span[4]")).click();
		
		wd.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'5')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'5')]")).click();
		
		String Add =  wd.findElement(By.xpath("//div[@id='sciInPut']")).getText();
		System.out.println(Add);
		
		String Total2 =  wd.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
		System.out.println("Addition is   :" +Total2);
		
		Thread.sleep(3000);  
		
		wd.findElement(By.xpath("//span[contains(text(),'AC')]")).click();
		
		wd.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'8')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		
		wd.findElement(By.xpath("//span[contains(text(),'–')]")).click();
		
		wd.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		wd.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'9')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'8')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		wd.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		
		String Sub =  wd.findElement(By.xpath("//div[@id='sciInPut']")).getText();
		System.out.println(Sub);
		
		String Total3 =  wd.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
		System.out.println("Subtraction is   :" +Total3);
		
		Thread.sleep(3000); 
		wd.close();
		
		
		
		
		
	}
}
