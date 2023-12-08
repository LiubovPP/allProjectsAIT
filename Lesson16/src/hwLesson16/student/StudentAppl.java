package hwLesson16.student;

import hwLesson16.student.model.Student;

public class StudentAppl {
    public static void main(String[] args) {
        Student student1 = new Student(1,"Luke","Smith",2005,
                "medicine");
        student1.display();
        student1.learnPoorly();
        student1.failExam();
        student1.learnWell();
        student1.passExam();
        student1.takeVacation();

        Student student2 = new Student(2,"Helen", "Brown", 2006, "pedagogy");
        student2.display();
        student2.takeVacation();
        student2.takeVacation();
        student2.takeVacation();
        student2.failExam();
        student2.learnWell();
    }
}
