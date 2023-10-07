package com.nam.exam;

public class TeachingAssistant extends Person implements KPIEvaluator
{
    public String employeeID;
    private int numberOfCourses;
    
    public TeachingAssistant(String name, int age, String gender, String employeeID, int numberOfCourses)
    {
        super(name, age, gender);
        this.employeeID = employeeID;
        this.numberOfCourses = numberOfCourses;
    }
    
    @Override
    String getRole() 
    {
        return "Teaching Assistant";
    }

    @Override
    public double calculateKPI() 
    {
        double out = Double.valueOf(5 * this.numberOfCourses);
        return out;
    }
    
}
