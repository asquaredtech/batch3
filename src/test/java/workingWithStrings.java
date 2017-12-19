import org.junit.Test;

public class workingWithStrings {
    String string1;
    String string2;

    @Test
    public void stringExamples(){
        concatenateStrings();
        assignValues("Sunday", "Monday");
        compareStrings();
    }

    public void concatenateStrings(){
        String firstName = "Fristname";
        String lastName = "Lastname";
        String fullName = firstName + " and " + lastName;
        System.out.println(fullName);
    }

    public void compareStrings(){
        System.out.println(string1.equals(string2));
    }

    public void assignValues(String val1, String val2){
        string1 = val1;
        string2 = val2;
    }
}
