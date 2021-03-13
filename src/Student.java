import java.time.LocalDate;

public class Student extends Person {
    private boolean hasPreviousJavaKnowledge;

    public Student(String firstName, String lastName, LocalDate dateOfBirth, boolean hasPreviousJavaKnowledge) {
        //Aici nu se poate pune ca parametru Person personStudent in loc de primii 3 parametrii,
        //pt.ca avem mostenirea de Person
        super(firstName, lastName, dateOfBirth);
        this.hasPreviousJavaKnowledge = hasPreviousJavaKnowledge;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString() + " - HasPreviousJavaKnowledge: " + hasPreviousJavaKnowledge;
    }
}
