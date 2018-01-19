//oskar: File recorded in Selenium IDE (Firefox plugin) and exported as Java JUnit4 WebDriver.

package newpackage;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumIDEExportJUnit4Webdriver2 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
  	//Firefox WebDriver
//  System.setProperty("webdriver.gecko.driver","C:\\test_SW\\selenium-java-3.8.1\\WebDrivers\\geckodriver.exe");
//  driver = new FirefoxDriver();
		
  	//Chrome WebDriver
//	System.setProperty("webdriver.chrome.driver","C:\\test_SW\\selenium-java-3.8.1\\WebDrivers\\chromedriver.exe");
//	driver = new ChromeDriver();
		
	//Edge WebDriver
	System.setProperty("webdriver.edge.driver", "C:\\test_SW\\selenium-java-3.8.1\\WebDrivers\\MicrosoftWebDriver.exe");
	driver = new EdgeDriver();
	

    baseUrl = "https://demo.klarna.se"; //oskar: removed trailing '/'
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSeleniumIDEExportJUnit4Webdriver2() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("kp")).click();
    driver.findElement(By.cssSelector("img[alt=\"Park Avenue Pleat Front Trousers\"]")).click();
    driver.findElement(By.cssSelector("div.add-to-cart-buttons > button.button.btn-cart")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    driver.findElement(By.id("onepage-guest-register-button")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
