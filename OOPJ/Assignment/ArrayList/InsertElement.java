import java.util.ArrayList;

public class InsertElement {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(10);

        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        System.out.println("Before Insert: " + list);

        list.add(0, "Red");

        System.out.println("After Insert: " + list);
    }
}