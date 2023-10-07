
//Main

public class Main {
    public static void main(String[] args){
        Student student=new Student("Johnny",18,6.5);
        System.out.println("Information student");
        System.out.println("Name: "+student.getName());
        System.out.println("Age: "+student.getAge());
        System.out.println("GPA: "+student.getGpa());
        System.out.println("Scholarship: "+student.calculateScholarship());
    }
}
