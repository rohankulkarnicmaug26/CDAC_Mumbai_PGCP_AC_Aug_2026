public class Pattern5
{
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        int End = ConsoleInput.getInt();

        for(int iTemp = End; iTemp >= 1; iTemp--) {
            for(int jTemp = 1; jTemp <= iTemp; jTemp++){
                System.out.print(jTemp + " ");
            }

            System.out.println();
        }
    }
}