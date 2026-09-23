import java.util.TreeSet;

public class TreeSetCreate {

    public static void main(String[] args) {

        TreeSet<String> colors = new TreeSet<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("TreeSet: " + colors);
    }
}