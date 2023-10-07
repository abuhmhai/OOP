package com.nam.exam;

public class Lecturer extends Person implements KPIEvaluator
{
    public String employeeID;
    private int numberOfPublications;
    
    public Lecturer(String name, int age, String gender, String employeeID, int numberOfPublications)
    {
        super(name, age, gender);
        this.employeeID = employeeID;
        this.numberOfPublications = numberOfPublications;
    }
    
    public int getPublications()
    {
        return this.numberOfPublications;
    }
    
    @Override
    String getRole() 
    {
        return "Lecturer";
    }

    @Override
    public double calculateKPI() 
    {
        double out = Double.valueOf(7 * this.numberOfPublications);
        return out;
    }
}
