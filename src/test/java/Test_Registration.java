import core.TestLib;
import org.junit.Test;

public class Test_Registration extends TestLib {
    @Test
    public void testRegistration(){
        logger.info("Go to http://www.newtours.demoaut.com Click REGISTER link from Header");

        //Verify page title : "Register: Mercury Tours" and input fields First Name and Last Name exist

        logger.info("Enter data First Name = Reach; Last Name = Asquared; Click Submit");

        //Verify Thank you for registering. You may now sign-in using the user name and password you've just entered.

        logger.info("Click on Home link from left hand side navigation");

        //Assert page title : “Welcome: Mercury Tours” and logo is present at the top left corner

    }
}
