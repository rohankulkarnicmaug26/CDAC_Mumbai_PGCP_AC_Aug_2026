public class DataMember {

    public static void main(String[] args) {

        PrimeMembers member = new PrimeMembers();

        System.out.print("Enter Name: ");
        member.setName(ConsoleInput.getString());

        System.out.print("Enter Age: ");
        member.setAge(ConsoleInput.getInt());

        System.out.print("Enter Phone Number: ");
        member.setPhoneNumber(ConsoleInput.getString());

        System.out.print("Enter Address: ");
        member.setAddress(ConsoleInput.getString());

        System.out.print("Enter Salary: ");
        member.setSalary(ConsoleInput.getFloat());

        System.out.print("Enter Joining Year: ");
        member.setJoiningYear(ConsoleInput.getInt());

        System.out.print("Enter Joining Fees: ");
        member.setJoiningFees(ConsoleInput.getFloat());

        System.out.print("Enter Is Active (true/false): ");
        member.setActive(Boolean.parseBoolean(ConsoleInput.getString()));

        System.out.println("\n----- Member Details -----");

        member.display();

        member.printSalary();
    }
}

class Member {

    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private float salary;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class PrimeMembers extends Member {

    private int joiningYear;
    private float joiningFees;
    private boolean isActive;

    public void setJoiningYear(int joiningYear) {
        this.joiningYear = joiningYear;
    }

    public int getJoiningYear() {
        return joiningYear;
    }

    public void setJoiningFees(float joiningFees) {
        this.joiningFees = joiningFees;
    }

    public float getJoiningFees() {
        return joiningFees;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean getActive() {
        return isActive;
    }

    public void display() {

        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Address: " + getAddress());
        System.out.println("Salary: " + getSalary());
        System.out.println("Joining Year: " + getJoiningYear());
        System.out.println("Joining Fees: " + getJoiningFees());
        System.out.println("Is Active: " + getActive());
    }
}
