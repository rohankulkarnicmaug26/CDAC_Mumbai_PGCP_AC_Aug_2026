public class SeventhNumber
{
    public static void main(String[] args)
    {
        System.out.println("Enter the starting number");
        int Start = ConsoleInput.getInt();

        System.out.println("Enter the ending number");
        int End = ConsoleInput.getInt();

        System.out.println("Every 7th number is:");

        for(int iTemp = Start; iTemp <= End; iTemp++)
        {
            if(iTemp % 7 == 0)
            {
                System.out.println(iTemp);
            }
        }
    }
}