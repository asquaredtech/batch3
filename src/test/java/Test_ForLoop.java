import core.baseClass;
import org.junit.Test;

public class Test_ForLoop extends baseClass {
    @Test
    public void testFor() {

        for(int i = 1; i < 10; i = i+1) {
            iLearned();
            System.out.println("Table : " + i );
        }
    }
}