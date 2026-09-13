public class Pattern4
{
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        int End = ConsoleInput.getInt();

        for(int iTemp = 1; iTemp <= End; iTemp++) {
            for(int jTemp = 1; jTemp <= iTemp; jTemp++)
            {
                System.out.print(jTemp + " ");
            }

            System.out.println();
        }
    }
}