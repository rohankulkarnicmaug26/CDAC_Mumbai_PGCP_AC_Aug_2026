import java.util.ArrayList;

public class SearchElement {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        if (list.contains("Blue")) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}