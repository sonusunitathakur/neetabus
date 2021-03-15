package neetabus;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Neetabus {

	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver d=new ChromeDriver(opt);
		
		d.get("http:\\www.neetabus.in");
		String s=d.getTitle();
        System.out.println("The title of " +s);
       d.manage().window().maximize();
       
      Thread.sleep(3000);
      
       WebElement cross=d.findElement(By.id("ctl00_sitecontent_ImageButton1" ));
       cross.click();
       
       
       
       
       WebElement listbox=d.findElement(By.id("ctl00_sitecontent_txtFromCity"));
	listbox.sendKeys("Mumbai");
       listbox.sendKeys(Keys.DOWN);
       listbox.sendKeys(Keys.ENTER);
     
     
       WebElement listbox1=d.findElement(By.xpath("//*[@id='ctl00_sitecontent_txtToCity']"));
       listbox1.sendKeys("Pune");
       listbox1.sendKeys(Keys.DOWN);
       listbox1.sendKeys(Keys.ENTER);
       
       
      WebElement dep=d.findElement(By.xpath("//*[@id='ctl00_sitecontent_txtFromDate']"));
      dep.click();
      
       List<WebElement> dat=d.findElements(By.tagName("td"));
       String str="30";
       for(int i=0;i<dat.size()-1;i++)
       {
    	   WebElement owe=dat.get(i);
    	   String dt=owe.getText();
    	   if(dt.equals(str))
    	   {
    		   owe.click();
    		   break;
    	   }
       }
      
       WebElement ret=d.findElement(By.xpath("//*[@id='ctl00_sitecontent_txtReturnDate']"));
       ret.click();
      
      WebElement next=d.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span"));
      next.click();
      
      List<WebElement> dat1=d.findElements(By.tagName("td"));
      String str1="1";
      for(int i=0;i<dat1.size()-1;i++)
      {
   	   WebElement owe=dat1.get(i);
   	   String dt=owe.getText();
   	   if(dt.equals(str1))
   	   {
   		   owe.click();
   		   break;
   	   }
      }
      
      
      WebElement About=d.findElement(By.xpath("//*[@id='rt-showcase']/div/div/div[1]/div/ul/li[2]/a"));
      About.click();
      WebElement Us=d.findElement(By.xpath("//*[@id='rt-showcase']/div/div/div[1]/div/ul/li[2]/div/div/ul/li[1]/a/i"));
      Us.click();
      
      
     // WebElement search=d.findElement(By.xpath("//*[@id='ctl00_sitecontent_imgjsbutton']"));
      //search.click();
      
      
       
       
       
       }  
       
       
	}
	

	


