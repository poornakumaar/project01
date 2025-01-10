package selenium.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Employee {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\Student1\\JavaProject\\Driver\\chromedriver.exe");
		
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://qavbox.github.io/demo/webtable/");
	 
	 WebElement table = driver.findElement(By.id("table01"));
	 List<WebElement> head = table.findElements(By.tagName("thead"));
	 for(WebElement h : head) {
		 String text = h.getText();
		 System.out.println(text);
	 }
	  
	 
     List<WebElement> row = table.findElements(By.cssSelector("tbody tr"));
    for(WebElement r : row) {
    	String text = r.getText();
    	System.out.println(text);
    }
    int size = row.size();
    System.out.println(size);
    
    for(int i =0;i<size;i++) {
    	List<WebElement> a = row.get(i).findElements(By.tagName("td"));
    	WebElement b = a.get(2);
    	String text = b.getText();
    	System.out.println(text);
    }
    
    		
}
}