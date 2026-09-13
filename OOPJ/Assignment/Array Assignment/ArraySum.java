public class ArraySum
{
    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        int End = ConsoleInput.getInt();

        int arr[] = new int[End];

        System.out.println("Enter the array elements: ");

        for(int iTemp = 0; iTemp < End; iTemp++) {
            arr[iTemp] = ConsoleInput.getInt();
        }
        
        int Sum = 0;

        for(int iTemp = 0; iTemp < End; iTemp++)
            Sum = Sum + arr[iTemp];

        System.out.println("Sum of array elements: " + Sum);
    }
}