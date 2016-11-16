package constructorRulesDemo;

public class StudentDemo
{
    public static void main(String[] args)
    {
        Student stu = new Student();
//        Student stu = new Student("Brandon");
//        Student stu = new Student("Brandon", 3.6);
        
        System.out.println("Name: " + stu.getName());
        System.out.println("GPA: " + stu.getGPA());
        System.out.println("Perfect attendance: " + stu.hasPerfectAttendance());
    }
}