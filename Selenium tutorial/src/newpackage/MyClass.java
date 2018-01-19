//package newpackage;
//
//public class MyClass {
//
//}
package newpackage;
import org.openqa.selenium.WebDriver;

//import WebDrivers
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MyClass {


    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	
    	//Firefox WebDriver
    	System.setProperty("webdriver.gecko.driver","C:\\test_SW\\selenium-java-3.8.1\\WebDrivers\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
		
    	//Chrome WebDriver
//		System.setProperty("webdriver.chrome.driver","C:\\test_SW\\selenium-java-3.8.1\\WebDrivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		//Edge WebDriver
//		System.setProperty("webdriver.edge.driver", "C:\\test_SW\\selenium-java-3.8.1\\WebDrivers\\MicrosoftWebDriver.exe");
//		WebDriver driver = new EdgeDriver();
		
    	
        String baseUrl = "http://demo.guru99.com/selenium/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Fire fox
        //driver.close();
       
    }

}