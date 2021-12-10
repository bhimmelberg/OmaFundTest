package omafund.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;

public class TestOmaFund {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  JavascriptExecutor js;
  @Before
  public void setUp() throws Exception {
      System.setProperty("webdriver.chrome.driver", //
    		  "lib\\win\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  
 
  
  @Test
  public void testMyProjects() throws Exception {
    driver.get("http://ec2-3-135-240-102.us-east-2.compute.amazonaws.com:8080/OmaFund/home.html?");
    driver.findElement(By.xpath("//input[@value='Log In']")).click();
    driver.findElement(By.name("userName")).click();
    driver.findElement(By.name("userName")).clear();
    driver.findElement(By.name("userName")).sendKeys("bh");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("1234");
    driver.findElement(By.xpath("//input[@value='Submit']")).click();
    driver.findElement(By.xpath("//input[@value='Your Projects']")).click();
  }
  
  @Test
  public void testLogInFail() throws Exception {
    driver.get("http://ec2-3-135-240-102.us-east-2.compute.amazonaws.com:8080/OmaFund/home.html?");
    driver.findElement(By.xpath("//input[@value='Log In']")).click();
    driver.findElement(By.name("userName")).click();
    driver.findElement(By.name("userName")).clear();
    driver.findElement(By.name("userName")).sendKeys("invalid");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("123");
    driver.findElement(By.xpath("//input[@value='Submit']")).click();
    driver.findElement(By.linkText("Log In")).click();
  }


  @Test
  public void testLogIn() throws Exception {
    driver.get("http://ec2-3-135-240-102.us-east-2.compute.amazonaws.com:8080/OmaFund/home.html?");
    driver.findElement(By.xpath("//input[@value='Log In']")).click();
    driver.findElement(By.name("userName")).click();
    driver.findElement(By.name("userName")).clear();
    driver.findElement(By.name("userName")).sendKeys("bh");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("1234");
    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
  }
  
  @Test
  public void viewMap() throws Exception {
    driver.get("http://ec2-3-135-240-102.us-east-2.compute.amazonaws.com:8080/OmaFund/home.html?");
    driver.findElement(By.xpath("//input[@value='Log In']")).click();
    driver.findElement(By.name("userName")).click();
    driver.findElement(By.name("userName")).clear();
    driver.findElement(By.name("userName")).sendKeys("bh");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("1234");
    driver.findElement(By.xpath("//input[@value='Submit']")).click();
    driver.findElement(By.xpath("//input[@value='View Map']")).click();
  }
  
  @Test
  public void createProject() throws Exception {
    driver.get("http://ec2-3-135-240-102.us-east-2.compute.amazonaws.com:8080/OmaFund/home.html?");
    driver.findElement(By.xpath("//input[@value='Log In']")).click();
    driver.findElement(By.name("userName")).click();
    driver.findElement(By.name("userName")).clear();
    driver.findElement(By.name("userName")).sendKeys("bh");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("1234");
    driver.findElement(By.xpath("//input[@value='Submit']")).click();
    driver.findElement(By.xpath("//input[@value='Create Project']")).click();
    driver.findElement(By.name("title")).click();
    driver.findElement(By.name("title")).clear();
    driver.findElement(By.name("title")).sendKeys("Community Swimming Pool");
    driver.findElement(By.name("description")).clear();
    driver.findElement(By.name("description")).sendKeys("Pool for community");
    driver.findElement(By.name("addLine1")).clear();
    driver.findElement(By.name("addLine1")).sendKeys("2899 Road Q");
    driver.findElement(By.name("addLine2")).clear();
    driver.findElement(By.name("addLine2")).sendKeys("Lawrence, NE, 68957");
    driver.findElement(By.name("goal")).clear();
    driver.findElement(By.name("goal")).sendKeys("4000");
    driver.findElement(By.name("donationPercent")).clear();
    driver.findElement(By.name("donationPercent")).sendKeys("22");
    driver.findElement(By.xpath("//input[@value='Submit']")).click();
  }
  
  @Test
  public void testMyItems() throws Exception {
    driver.get("http://ec2-3-135-240-102.us-east-2.compute.amazonaws.com:8080/OmaFund/home.html?");
    driver.findElement(By.xpath("//input[@value='Log In']")).click();
    driver.findElement(By.name("userName")).click();
    driver.findElement(By.name("userName")).clear();
    driver.findElement(By.name("userName")).sendKeys("bh");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("1234");
    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("//input[@value='Submit']")).click();
    driver.findElement(By.xpath("//input[@value='Your Items']")).click();
  }
  
  @Test
  public void testSignOut() throws Exception {
    driver.get("http://ec2-3-135-240-102.us-east-2.compute.amazonaws.com:8080/OmaFund/home.html?");
    driver.findElement(By.xpath("//input[@value='Log In']")).click();
    driver.findElement(By.name("userName")).click();
    driver.findElement(By.name("userName")).clear();
    driver.findElement(By.name("userName")).sendKeys("bh");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("1234");
    driver.findElement(By.xpath("//input[@value='Submit']")).click();
    driver.findElement(By.xpath("//input[@value='Sign Out']")).click();
  }
  
  @Test
  public void testMapData() throws Exception {
    driver.get("http://ec2-3-135-240-102.us-east-2.compute.amazonaws.com:8080/OmaFund/home.html?");
    driver.findElement(By.xpath("//input[@value='Log In']")).click();
    driver.findElement(By.name("userName")).click();
    driver.findElement(By.name("userName")).clear();
    driver.findElement(By.name("userName")).sendKeys("bh");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("1234");
    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("//input[@value='Edit User']")).click();
  }
  
  @Test
  public void testEditProject() throws Exception {
    driver.get("http://ec2-3-135-240-102.us-east-2.compute.amazonaws.com:8080/OmaFund/home.html?");
    driver.findElement(By.xpath("//input[@value='Log In']")).click();
    driver.findElement(By.name("userName")).click();
    driver.findElement(By.xpath("//input[@value='Log In']")).click();
    driver.findElement(By.name("userName")).click();
    driver.findElement(By.name("userName")).clear();
    driver.findElement(By.name("userName")).sendKeys("bh");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("1234");
    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("//input[@value='Create Project']")).click();
    driver.findElement(By.xpath("//input[@value='Back']")).click();
    driver.findElement(By.xpath("//input[@value='Your Projects']")).click();
    driver.findElement(By.xpath("//input[@value='Home']")).click();
  }
  
  @Test
  public void testEdit() throws Exception {
    driver.get("http://ec2-3-135-240-102.us-east-2.compute.amazonaws.com:8080/OmaFund/home.html?");
    driver.findElement(By.xpath("//input[@value='Log In']")).click();
    driver.findElement(By.name("userName")).click();
    driver.findElement(By.xpath("//input[@value='Log In']")).click();
    driver.findElement(By.name("userName")).click();
    driver.findElement(By.name("userName")).clear();
    driver.findElement(By.name("userName")).sendKeys("bh");
    driver.findElement(By.xpath("//input[@value='Log In']")).click();
    driver.findElement(By.name("userName")).click();
    driver.findElement(By.name("userName")).clear();
    driver.findElement(By.name("userName")).sendKeys("bh");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("1234");
    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("//input[@value='Edit User']")).click();
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("1234");
    driver.findElement(By.name("firstName")).clear();
    driver.findElement(By.name("firstName")).sendKeys("Brody");
    driver.findElement(By.name("lastName")).clear();
    driver.findElement(By.name("lastName")).sendKeys("Himmelberg");
    driver.findElement(By.name("age")).clear();
    driver.findElement(By.name("age")).sendKeys("20");
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("email@email.com");
    driver.findElement(By.xpath("//input[@value='Submit']")).click();
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
