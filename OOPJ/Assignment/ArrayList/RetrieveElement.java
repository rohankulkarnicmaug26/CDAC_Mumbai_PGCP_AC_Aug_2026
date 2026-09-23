import java.util.ArrayList;

public class RetrieveElement {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        System.out.println("Before Update: " + list);

        list.set(2, "Black");

        System.out.println("After Update: " + list);
    }
}