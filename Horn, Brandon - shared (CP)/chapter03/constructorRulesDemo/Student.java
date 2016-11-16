package constructorRulesDemo;

public class Student
{
    private String name;
    private double gpa;
    private boolean hasPerfectAttendance;
    
//    public Student()
//    {
//        name = "";
//        gpa = 0;
//        hasPerfectAttendance = true;
//    }
    
//    public Student(String n)
//    {
//        name = n;
//        gpa = 0;
//        hasPerfectAttendance = true;
//    }
    
//    public Student(String n, double g)
//    {
//        name = n;
//        gpa = g;
//        hasPerfectAttendance = true;
//    }
    
    public String getName()
    {
        return name;
    }

    public double getGPA()
    {
        return gpa;
    }
    
    public void setGPA(double g)
    {
        gpa = g;
    }

    public boolean hasPerfectAttendance()
    {
        return hasPerfectAttendance;
    }
    
    public void markAbsent()
    {
        hasPerfectAttendance = false;
    }
}