import java.util.ArrayList;

public class RemoveElement {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        System.out.println("Before Remove: " + list);

        list.remove(2);

        System.out.println("After Remove: " + list);
    }
}