import core.baseClass;
import org.junit.Test;

/*
    This class is extending Base Class
    Extending a class is called inheritance.
 */
public class extensionClass_4 extends baseClass {
    @Test
    public void useBaseClass(){
        System.out.println("From Extension/Inheritance Class calling Super or Base Class");
        whoAmI();
    }
}
