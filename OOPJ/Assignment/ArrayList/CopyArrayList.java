import java.util.ArrayList;
import java.util.Collections;

public class CopyArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> source = new ArrayList<>();

        source.add(50);
        source.add(30);
        source.add(20);
        source.add(10);
        source.add(40);

        ArrayList<Integer> target = new ArrayList<>();

        target.add(0);
        target.add(0);
        target.add(0);
        target.add(0);
        target.add(0);

        System.out.println("Source: " + source);
        System.out.println("Before Copy: " + target);

        Collections.copy(target, source);

        System.out.println("After Copy: " + target);
    }
}