package company.model;
public abstract class Employee{
    //поля класса
    protected final int id;
    protected String firstName;
    protected String lastName;
    protected int age;
    protected double hours;
    protected double workExperience;
    protected String education;

    // конструктор
    public Employee(int id, String firstName, String lastName, int age, double hours,
                    double workExperience, String education) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hours = hours;
        this.workExperience = workExperience;
        this.education = education;
            }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(double workExperience) {
        this.workExperience = workExperience;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", hours=" + hours +
                ", workExperience=" + workExperience +
                ", education='" + education + '\'' +
                '}';
    }

    public abstract double calcSalary(); // определили абстрактный метод (у него нет тела!)


}

