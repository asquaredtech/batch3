import core.TestLib;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Test_RegistrationXpathParameterization extends TestLib {
    @Test
    public void testRegistrationXpathParameterization(){
        logger.info("Go to http://www.newtours.demoaut.com");
        driver.get(baseUrl);

        //Verify page title : "Welcome: Mercury Tours"
        assertEquals("Welcome: Mercury Tours", driver.getTitle());

        logger.info("Click REGISTER link from Header");
        driver.findElement(By.linkText("REGISTER")).click();

        //Verify page title : "Register: Mercury Tours"

        //Verify input fields First Name and Last Name exist
        assertTrue(driver.findElement(By.xpath(getInputElementByLabel("First"))).isDisplayed());

        logger.info("Enter data First Name = Reach; Last Name = Asquared;");

        logger.info("Click Submit");

        //Verify Thank you for registering. You may now sign-in using the user name and password you've just entered.

        logger.info("Click on Home link from left hand side navigation");

        //Assert page title : “Welcome: Mercury Tours” and logo is present at the top left corner
    }
}
