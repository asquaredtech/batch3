import org.junit.Test;

public class Test_InvokingMethodsFromOtherClass_5 { //Class begins
    @Test
    public void callingMethodFromDifferentClass(){ //Method begins
        //Invoking a class
        TestMultipleMethods_3 multipleMethods = new TestMultipleMethods_3();

        //Calling a method from the invoked class
        multipleMethods.mainMethod();

    } //Method Ends
}//Class ends
