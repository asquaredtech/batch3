import core.baseClass;
import org.junit.Test;

public class Test_WhileLoop extends TestLib {
    @Test
    public void testWhileLoop(){
        int i = 0;
        while (i < 10) {
            iLearned("Valley Ridge Academy");
            System.out.println("Table : " + i );
        }
    }
}
