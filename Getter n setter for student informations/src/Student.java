public class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;

    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;

    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double calculateScholarship() {
        if (gpa >= 8.5) {
            return 100.0;
        } else if (gpa >= 7.0) {
            return 70.0;
        } else {
            return 0;
        }
    }
}
