
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_NewToursRegistration {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://newtours.demoaut.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testNewToursRegistration() throws Exception {
    // Go to http://www.newtours.demoaut.com
    driver.get(baseUrl + "");
    // Click REGISTER link from Header
    driver.findElement(By.linkText("REGISTER")).click();
    // Verify input fields exist
    try {
      assertTrue(isElementPresent(By.name("country")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.name("firstName")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertTrue(isElementPresent(By.name("register")));
    // Enter data
    driver.findElement(By.name("firstName")).clear();
    driver.findElement(By.name("firstName")).sendKeys("ASQUARED");
    new Select(driver.findElement(By.name("country"))).selectByVisibleText("UNITED KINGDOM");
    driver.findElement(By.name("register")).click();
    // Assert confirmation message
    assertEquals("Thank you for registering. You may now sign-in using the user name and password you've just entered.", driver.findElement(By.xpath("//tr[3]/td/p[2]/font")).getText());
    // Store attribute into a variable (checkFont)
    String checkFont = driver.findElement(By.xpath("//tr[3]/td/p[2]/font")).getAttribute("face");
    // Display value of variable
    System.out.println(checkFont);
    // Verify attribute value
    try {
      assertEquals("Arial, Helvetica, sans-serif", driver.findElement(By.xpath("//tr[3]/td/p[2]/font")).getAttribute("face"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
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
