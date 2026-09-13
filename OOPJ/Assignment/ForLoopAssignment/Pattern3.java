public class Pattern3
{
    public static void main(String[] args){
        System.out.println("Enter the number of rows");
        int End = ConsoleInput.getInt();

        int Number = 1;

        for(int iTemp = 1; iTemp <= End; iTemp++){
            for(int jTemp = 1; jTemp <= iTemp; jTemp++)
            {
                System.out.print(Number + " ");
                Number++;
            }

            System.out.println();
        }
    }
}