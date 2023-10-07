/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package on_tap;

interface KPIEvaluator{
    double calculateKPI();
}

abstract class Person{
    public String name;
    protected int age;
    public String gender;
    protected String bank_account;
    
    public Person(String name, int age, String gender, String bank_account){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.bank_account = bank_account;
    }
    
    public abstract String getRole();
}

class Student extends Person implements KPIEvaluator{
    public String studentID;
    private final float gpa;
    private final String specialization;
    
    
    public Student(String name, String studentID, int age, String gender, float gpa, String specialization){
        super(name, age, gender, studentID);
        this.studentID = studentID;
        this.gpa = gpa;
        this.specialization = specialization;
    }
    
    

    @Override
    public String getRole() { 
        return this.name + Integer.toString(this.age) + this.gender + this.gpa + this.specialization; 
    }
    
    @Override
    public double calculateKPI(){
        return this.gpa;
    };
}

final class ITStudent extends Student{
    public String major;
    
    public ITStudent(String major, String name, String studentID, int age, String gender, float gpa){
        super(name, studentID, age, gender, gpa, major);
        this.major = major;
    }
    
    @Override
    public String getRole(){
        return this.major;
    }
    
}

class BusinessStudent extends Student{
    public String major;
    
    public BusinessStudent(String major, String name, String studentID, int age, String gender, float gpa){
        super(name, studentID, age, gender, gpa, major);
        this.major = major;
    }
    @Override
    public String getRole(){
        return this.major;
    }
}

class LanguageStudent extends Student{
    public String major;
    
    public LanguageStudent(String major, String name, String studentID, int age, String gender, float gpa){
        super(name, studentID, age, gender, gpa, major);
        this.major = major;
    }
    @Override
    public String getRole(){
        return this.major;
    }
    
}

public class On_tap {

    public static void main(String[] args) {
        ITStudent student = new ITStudent("IT", "Thuan", "BIT220149", 19, "Nam", 2);
        System.out.println(student.name +" "+ student.studentID);
        System.out.println(student.calculateKPI() + " " + student.getRole());
        LanguageStudent student1 = new LanguageStudent("Languages", "Nam", "BIT220150", 19, "Nam", 4);
        System.out.println(student1.name +" "+ student1.studentID);
    } 
}
