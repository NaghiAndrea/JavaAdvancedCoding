import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class SimulateClass {

    public static void main(String[] args) {
        createClassHierarchy();


    }

    private static void createClassHierarchy() {
        Student student = new Student("Olteanu", "Alexandru", LocalDate.of(1998, Month.OCTOBER, 12), false);
        System.out.println(student);
        Student student2 = new Student("Student2", "Alexandru", LocalDate.of(1998, Month.OCTOBER, 12), false);
        Student student3 = new Student("Student3", "Alexandru", LocalDate.of(1998, Month.OCTOBER, 12), false);
        Student student4 = new Student("Student4", "Alexandru", LocalDate.of(1996, Month.OCTOBER, 12), true);
        Student student5 = new Student("Student5", "Alexandru", LocalDate.of(1998, Month.OCTOBER, 12), false);
        Student student6 = new Student("Student6", "Alexandru", LocalDate.of(1980, Month.OCTOBER, 12), false);
        Student student7 = new Student("Student7", "Alexandru", LocalDate.of(1985, Month.OCTOBER, 12), false);
        Student student8 = new Student("Student8", "Alexandru", LocalDate.of(1998, Month.OCTOBER, 12), false);
        Student student9 = new Student("Student9", "Alexandru", LocalDate.of(1999, Month.OCTOBER, 12), true);
        Student student10 = new Student("Student10", "Alexandru", LocalDate.of(1998, Month.OCTOBER, 12), false);
        Student student11 = new Student("Student11", "Alexandru", LocalDate.of(1978, Month.OCTOBER, 12), true);
        Student student12 = new Student("Student12", "Alexandru", LocalDate.of(1982, Month.OCTOBER, 12), false);
        Student student13 = new Student("Student13", "Alexandru", LocalDate.of(1998, Month.OCTOBER, 12), false);
        Student student14 = new Student("Student14", "Alexandru", LocalDate.of(1987, Month.OCTOBER, 12), true);
        Student student15 = new Student("Student15", "Alexandru", LocalDate.of(1991, Month.OCTOBER, 12), false);

        Trainer trainer1 = new Trainer("Trainer1", "Alexandru", LocalDate.of(1979, Month.OCTOBER, 12), true);
        System.out.println(trainer1);
        Trainer trainer2 = new Trainer("Trainer2", "Alexandru", LocalDate.of(1965, Month.OCTOBER, 12), true);
        Trainer trainer3 = new Trainer("Trainer3", "Alexandru", LocalDate.of(1973, Month.OCTOBER, 12), true);


//        List<Person> personList = new ArrayList<>();
//        List<Trainer> trainers = new ArrayList<>();

        // List<Student> students = new ArrayList<>(); //ca sa nu mai fac add-uri
        List<Student> studentsRo16 = Arrays.asList(student, student2, student3, student4);
        List<Student> studentsRo17 = Arrays.asList(student5, student6, student7, student8);
        List<Student> studentsRo18 = Arrays.asList(student9, student10, student11);
        List<Student> studentsRo19 = Arrays.asList(student12, student13, student14);


        Group JavaRo16 = new Group(trainer1, studentsRo16);
        Group JavaRo17 = new Group(trainer2, studentsRo17);
        Group JavaRo18 = new Group(trainer3, studentsRo18);
        Group JavaRo19 = new Group(null, studentsRo19);

        //JavaRo19.setTrainer(trainer3); - daca schimbam pe private trainer
    }
}
