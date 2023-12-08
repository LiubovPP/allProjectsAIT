package homework_Lesson52;

import java.util.Objects;
import java.util.TreeSet;

public class StudentsTreeSet {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<Student>();
        Student student1 = new Student("Ivan", 5);
        Student student2 = new Student("Kirill", 2);
        Student student3 = new Student("Svetlana", 1);
        Student student4 = new Student("Dmitrii", 4);
        Student student5 = new Student("Peter", 3);
        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);
        treeSet.add(student5);
        System.out.println(treeSet);

        System.out.println("First "+ treeSet.first());
        System.out.println("Last "+ treeSet.last());

        Student student6 = new Student("Konstantin", 5);
        System.out.println(treeSet.headSet(student6));
        //всё, что  выше курса этого студента

        System.out.println(treeSet.tailSet(student6));
        //всё, что ниже курса этого студента

        treeSet.remove(student2);
        System.out.println(treeSet); // после удаления
        Student student7 = new Student("Leonid", 4);
        System.out.println(treeSet.subSet(student7,student6)); // множество студентов на курсе ниже Константина  до курса Леонида
    }
}
    class Student implements Comparable<Student>{
        String name;
        int course;

        public Student(String name, int course) {
            this.name = name;
            this.course = course;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCourse() {
            return course;
        }

        public void setCourse(int course) {
            this.course = course;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", course=" + course +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return course == student.course && Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, course);
        }

        @Override
        public int compareTo(Student o) {
            return course-o.course;
        }
    }

