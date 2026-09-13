public class ArrayCopy{
	
	
    public static void main(String[] args){
    	
    	
    	
        System.out.println("Enter the size of array: ");
        int End = ConsoleInput.getInt();

        int arr[] = new int[End];
        int arrCopy[] = new int[End];

        System.out.println("Enter the array elements: ");

        for(int iTemp = 0; iTemp < End; iTemp++)
        {
            arr[iTemp] = ConsoleInput.getInt();
        }

        for(int iTemp = 0; iTemp < End; iTemp++)
        {
            arrCopy[iTemp] = arr[iTemp];
        }

        System.out.println("Copied Array: ");

        for(int iTemp = 0; iTemp < End; iTemp++)
        {
            System.out.print(arrCopy[iTemp] + " ");
        }
    }
}