public class Program {
    public static void main(String[] args) {
        Date objDate = new Date(1, 1, 2026);
        int choice;

        do {
            System.out.println("******** Date Management Program ********");
            System.out.println("1. Set Date");
            System.out.println("2. Add Day");
            System.out.println("3. Add Months");
            System.out.println("4. Add Years");
            System.out.println("5. Display Date");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = ConsoleInput.getInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the Day: ");
                    int inputDay = ConsoleInput.getInt();

                    System.out.print("Enter the Month: ");
                    int inputMonth = ConsoleInput.getInt();

                    System.out.print("Enter the Year: ");
                    int inputYear = ConsoleInput.getInt();

                    objDate.setDate(inputDay, inputMonth, inputYear);
                    break;

                case 2:
                    System.out.print("Enter number of Days: ");
                    int dayValue = ConsoleInput.getInt();
                    objDate.addDays(dayValue);
                    break;

                case 3:
                    System.out.print("Enter number of Months: ");
                    int monthValue = ConsoleInput.getInt();
                    objDate.addMonths(monthValue);
                    break;

                case 4:
                    System.out.print("Enter number of Years: ");
                    int yearValue = ConsoleInput.getInt();
                    objDate.addYears(yearValue);
                    break;

                case 5:
                    objDate.display();
                    break;

                case 6:
                    System.out.println("Program Exit");
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        } while (choice != 6);
    }
}
