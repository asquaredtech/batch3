package core;

/*
    This is a Base Class that hold global methods which can be used in the project by extending this class
    Base class is also called super class
 */
public class baseClass {
    public void whoAmI(){
        System.out.println("baseClass : I am in Super or Base Class");
    }

    public void iLearned(){
        System.out.println();
        System.out.println("In Asquared");
        System.out.println("--------------");
        System.out.print("I learned ");
    }

    //Overriding a method
    public void iLearned(String institute){
        System.out.println();
        System.out.println("In " + institute);
        System.out.println("--------------");
        System.out.print("I learned ");
    }
}
