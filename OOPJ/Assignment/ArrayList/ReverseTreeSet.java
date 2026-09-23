import java.util.TreeSet;

public class ReverseTreeSet {

    public static void main(String[] args) {

        TreeSet<String> colors = new TreeSet<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Original TreeSet: " + colors);

        System.out.println(
            "Reverse Order: " + colors.descendingSet()
        );
    }
}