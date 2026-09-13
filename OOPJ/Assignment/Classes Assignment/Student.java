public class Student
{
	
	
    String name;
    int roll_no;
    String phone_no;
    String address;

    public static void main(String[] args)  {
    	
    	
        Student objStudent1 = new Student();

        
        objStudent1.roll_no = 2;
        
        objStudent1.name = "John";

        System.out.println("Student 1: ");
        System.out.println("Roll No: " + objStudent1.roll_no);
        System.out.println("Name: " + objStudent1.name);

        Student objStudent2 = new Student();

        objStudent2.name = "Sam";
        
        objStudent2.roll_no = 1;
        objStudent2.phone_no = "9876543210";
        objStudent2.address = "Mumbai";

        System.out.println();
        System.out.println("Student 2: ");
        System.out.println("Roll No: " + objStudent2.roll_no);
        System.out.println("Name: " + objStudent2.name);
        System.out.println("Phone No: " + objStudent2.phone_no);
        System.out.println("Address: " + objStudent2.address);
    }
}