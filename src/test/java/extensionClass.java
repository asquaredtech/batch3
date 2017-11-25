import core.baseClass;
import org.junit.Test;

/*
    This class is extending Base Class
 */
public class extensionClass extends baseClass {
    @Test
    public void useBaseClass(){
        System.out.println("From Extension Class Calling Base Class");
        whoAmI();
    }
}
