import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test 
  public void f() {
	  String driverpath="C:\\Users\\dvk\\eclipse-workspace\\travelguide\\drivers\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", driverpath);
	  WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/");
  }
}
