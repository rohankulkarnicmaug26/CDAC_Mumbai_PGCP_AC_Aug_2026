import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(10);

        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            String color = itr.next();
            System.out.println(color);
        }
    }
}