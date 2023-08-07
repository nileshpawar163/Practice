import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("driver.chrome.driver","C:\\Users\\Mayur Pimple\\Downloads\\chromedriver_win32");
  driver=new ChromeDriver();
  driver.get("https://www.visualcrossing.com");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
