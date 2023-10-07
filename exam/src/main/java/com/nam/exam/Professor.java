package com.nam.exam;

public final class Professor extends Lecturer
{
    public static int countProfessors = 0;
    private int numberOfProjects;
    
    public Professor(String name, int age, String gender, String employeeID, int numberOfPublications, int numberOfProjects) 
    {
        super(name, age, gender, employeeID, numberOfPublications);
        this.numberOfProjects = numberOfProjects;
        countProfessors++;
    }
    
    @Override
    String getRole() 
    {
        return "Professor";
    }
    
    @Override
    public double calculateKPI() 
    {
        double out = Double.valueOf(7 * getPublications()) + Double.valueOf(10 * numberOfProjects);
        return out;
    }
}
