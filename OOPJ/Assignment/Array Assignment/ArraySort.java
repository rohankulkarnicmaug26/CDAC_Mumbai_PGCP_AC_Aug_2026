import java.util.Arrays;

public class ArraySort
{
    public static void main(String[] args) {
        System.out.println("Enter the size of array ");
        int End = ConsoleInput.getInt();

        int arr[] = new int[End];

        System.out.println("Enter the array elements ");

        for(int iTemp = 0; iTemp < End; iTemp++){
            arr[iTemp] = ConsoleInput.getInt();
        }

        Arrays.sort(arr);
        System.out.println("Sorted Array: ");

        for(int iTemp = 0; iTemp < End; iTemp++)
        {
            System.out.print(arr[iTemp] + " ");
        }
    }
}