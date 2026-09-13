public class DuplicateValue {
	
	
    public static void main(String[] args) {
    	
    	
        System.out.println("Enter the size of array: ");
        int End = ConsoleInput.getInt();

        int arr[] = new int[End];

        System.out.println("Enter the array elements: ");

        for(int iTemp = 0; iTemp < End; iTemp++)
        {
            arr[iTemp] = ConsoleInput.getInt();
        }

        System.out.println("Duplicate values are: ");

        for(int iTemp = 0; iTemp < End; iTemp++)
        {
            for(int jTemp = iTemp + 1; jTemp < End; jTemp++)
            {
                if(arr[iTemp] == arr[jTemp])
                {
                    System.out.println(arr[iTemp]);
            }
            }
        }
    }
}