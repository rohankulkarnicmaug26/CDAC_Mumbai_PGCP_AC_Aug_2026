import java.util.TreeSet;

public class FirstLastTreeSet {

    public static void main(String[] args) {

        TreeSet<String> colors = new TreeSet<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("TreeSet: " + colors);

        System.out.println(
            "First Element: " + colors.first()
        );

        System.out.println(
            "Last Element: " + colors.last()
        );
    }
}