public class ArrMinMax
{
    public static void main(String[] args)  {
    	
    	
        System.out.println("Enter the size of array: ");
        int End = ConsoleInput.getInt();

        int arr[] = new int[End];

        System.out.println("Enter the array elements: ");

        for(int iTemp = 0; iTemp < End; iTemp++)
        {
            arr[iTemp] = ConsoleInput.getInt();
        }

        int Max = arr[0];
        int Min = arr[0];

        for(int iTemp = 1; iTemp < End; iTemp++)
        {
            if(arr[iTemp] > Max)
            {
                Max = arr[iTemp];
            }

            if(arr[iTemp] < Min)
            {
                Min = arr[iTemp];
            }
        }

        System.out.println("Minimum value: " + Min);
        System.out.println("Maximum value: " + Max);
    }
}