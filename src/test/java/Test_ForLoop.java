import core.TestLib;
import core.baseClass;
import org.junit.Test;

public class Test_ForLoop extends TestLib {
    @Test
    public void testFor() {

        for (int i = 1; i < 10; i = i + 1) {
            if (i % 2 == 1) { // 'i%2' will give the reminder
                // odd number
                iLearned(i + ": Valley Ridge Academy");//String concatenation
            } // end if
            else {
                //even number
                System.out.print(i + ": ");
                iLearned();
            } // end else
            System.out.println("Table : " + i);
        } // end for
    }
}
