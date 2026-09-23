import java.util.TreeSet;

public class AddTreeset {

    public static void main(String[] args) {

        TreeSet<String> set1 = new TreeSet<>();

        set1.add("Red");
        set1.add("Blue");
        set1.add("Green");

        TreeSet<String> set2 = new TreeSet<>();

        set2.add("Blue");
        set2.add("Yellow");

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2 Before: " + set2);

        set2.addAll(set1);

        System.out.println("Set 2 After: " + set2);
    }
}