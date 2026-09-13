public class ArrayReverse
{
    public static void main(String[] args)
    {
    	
    	
        System.out.println("Enter the size of array: ");
        int End = ConsoleInput.getInt();

        int arr[] = new int[End];

        System.out.println("Enter the array elements: ");

        for(int iTemp = 0; iTemp < End; iTemp++)
        {
            arr[iTemp] = ConsoleInput.getInt();
        }

        System.out.println("Reverse array is: ");

        for(int iTemp = End - 1; iTemp >= 0; iTemp--)
        {
            System.out.println(arr[iTemp]);
        }
    }
}