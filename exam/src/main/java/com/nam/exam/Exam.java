package com.nam.exam;

import java.util.Scanner;

public class Exam 
{
    public static Person[] people;

    public static void main(String[] args) 
    {
        Scanner sn = new Scanner(System.in);
        
        TeachingAssistant ta = new TeachingAssistant("Nick", 21, "Male", "id123", 5);
        Lecturer lt = new Lecturer("Nic", 24, "Female", "id234", 3);
        Professor pf = new Professor("Nathan", 30, "Male", "id345", 6, 6);
        
        /*
        System.out.printf("Nick's role: %s \n", ta.getRole());
        System.out.printf("Nic's role: %s \n",lt.getRole());
        System.out.printf("Nathan's role: %s \n", pf.getRole());
        
        System.out.printf("Nick's kpi: %.2f \n", ta.calculateKPI());
        System.out.printf("Nic's kpi: %.2f \n", lt.calculateKPI());
        System.out.printf("Nathan's kpi: %.2f \n", pf.calculateKPI());
        */

        System.out.print("Enter n: ");
        int n = Integer.parseInt(sn.nextLine());
        
        people = enterValues(sn, n);
        int profCount = 0;
        
        for (Person person : people)
        {
            if (person instanceof Professor professor)
            {
                System.out.printf("%s, %d, %s, %s\n", professor.name, professor.age, professor.gender, professor.employeeID);
                System.out.printf("Role: %s\n", professor.getRole());
                System.out.printf("KPI; %.2f\n", professor.calculateKPI());
                profCount++;
            }
            else if (person instanceof Lecturer lecturer)
            {
                System.out.printf("%s, %d, %s, %s\n", lecturer.name, lecturer.age, lecturer.gender, lecturer.employeeID);
                System.out.printf("Role: %s\n", lecturer.getRole());
                System.out.printf("KPI; %.2f\n", lecturer.calculateKPI());
            }
            else if (person instanceof TeachingAssistant teachingAssistant)
            {
                System.out.printf("%s, %d, %s, %s\n", teachingAssistant.name, teachingAssistant.age, teachingAssistant.gender, teachingAssistant.employeeID);
                System.out.printf("Role: %s\n", teachingAssistant.getRole());
                System.out.printf("KPI; %.2f\n", teachingAssistant.calculateKPI());
            }
        }
        
        System.out.printf("Professor count: %d\n", profCount);
        
        form1 f1 = new form1();
        f1.setLocationRelativeTo(null);
        f1.setVisible(true);
    }
    
    public static Person[] enterValues(Scanner sn, int n)
    {
        Person[] people = new Person[n];

        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter role (ta, lec, gs): ");
            String role = sn.nextLine();

            if (role.toLowerCase().equals("ta"))
            {
                while (true)
                {
                    try
                    {
                        System.out.print("Enter ta's name: ");
                        String name = sn.nextLine();
                        System.out.print("Enter ta's age: ");
                        int age = Integer.parseInt(sn.nextLine());
                        System.out.print("Enter ta's gender: ");
                        String gender = sn.nextLine();
                        System.out.print("Enter ta's ID: ");
                        String id = sn.nextLine();
                        System.out.print("Enter ta's number of courses: ");
                        int courseNum = Integer.parseInt(sn.nextLine());

                        TeachingAssistant ta = new TeachingAssistant(name, age, gender, id, courseNum);
                        people[i] = ta;
                        break;
                    }
                    catch (Exception e)
                    {
                        System.out.println("invalid, do it again");
                    }
                }
            }
            else if (role.toLowerCase().equals("lec"))
            {
                while (true)
                {
                    try
                    {
                        System.out.print("Enter lec's name: ");
                        String name = sn.nextLine();
                        System.out.print("Enter lec's age: ");
                        int age = Integer.parseInt(sn.nextLine());
                        System.out.print("Enter lec's gender: ");
                        String gender = sn.nextLine();
                        System.out.print("Enter lec's ID: ");
                        String id = sn.nextLine();
                        System.out.print("Enter lec's number of publications: ");
                        int pubNum = Integer.parseInt(sn.nextLine());

                        Lecturer lt = new Lecturer(name, age, gender, id, pubNum);
                        people[i] = lt;
                        break;
                    }
                    catch (Exception e)
                    {
                        System.out.println("invalid, do it again");
                    }
                }
            }
            else if (role.toLowerCase().equals("gs"))
            {
                while (true)
                {
                    try
                    {
                        System.out.print("Enter gs's name: ");
                        String name = sn.nextLine();
                        System.out.print("Enter gs's age: ");
                        int age = Integer.parseInt(sn.nextLine());
                        System.out.print("Enter gs's gender: ");
                        String gender = sn.nextLine();
                        System.out.print("Enter gs's ID: ");
                        String id = sn.nextLine();
                        System.out.print("Enter gs's number of publications: ");
                        int pubNum = Integer.parseInt(sn.nextLine());
                        System.out.print("Enter gs's number of projects: ");
                        int projNum = Integer.parseInt(sn.nextLine());

                        Professor pf = new Professor(name, age, gender, id, pubNum, projNum);
                        people[i] = pf;
                        break;
                    }
                    catch (Exception e)
                    {
                        System.out.println("invalid, do it again");
                    }
                }
            }
            else
            {
                System.out.println("Wrong role, enter again");
                i--;
            }
        }
        
        return people;
    }
}
