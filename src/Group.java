import java.util.List;

public class Group {
    //  private String nameOfGroup;  - nu mai e nevoie sa-i dau nume, deoarece
    //cand instantiez grupul ii dau nume
    // (Group grupaRO16 = new Group(name: groupRO16, trainer, lista de studenti)
    private Trainer trainer;
    private List<Student> listOfStudents;

    public Group(Trainer trainer, List<Student> listOfStudents) {
        this.trainer = trainer;
        this.listOfStudents = listOfStudents;
    }
}
