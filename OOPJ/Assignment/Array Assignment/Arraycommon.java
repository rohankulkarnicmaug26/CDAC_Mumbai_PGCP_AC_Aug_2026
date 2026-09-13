public class Arraycommon
{
    public static void main(String[] args)
    {
    	
    	
    	
        System.out.println("Enter the size of first array: ");
        int End = ConsoleInput.getInt();

        int arr1[] = new int[End];

        System.out.println("Enter the elements of first array: ");

        for(int iTemp = 0; iTemp < End; iTemp++)
        {
            arr1[iTemp] = ConsoleInput.getInt();
        }

        System.out.println("Enter the size of second array: ");
        int End2 = ConsoleInput.getInt();

        int arr2[] = new int[End2];

        System.out.println("Enter the elements of second array: ");

        for(int iTemp = 0; iTemp < End2; iTemp++)
        {
            arr2[iTemp] = ConsoleInput.getInt();
        }

        System.out.println("Common elements are: ");

        for(int iTemp = 0; iTemp < End; iTemp++)
        {
            for(int jTemp = 0; jTemp < End2; jTemp++)
            {
                if(arr1[iTemp] == arr2[jTemp])
                {
                    System.out.println(arr1[iTemp]);
                    break;
            }
            }
        }
    }
}