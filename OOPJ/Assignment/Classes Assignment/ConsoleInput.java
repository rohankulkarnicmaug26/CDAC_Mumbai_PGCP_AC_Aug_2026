public class ConsoleInput
{
    public static float getFloat()
    {
        String objString = getString();

        float data = Float.parseFloat(objString);

        return data;
    }

    public static int getInt()
    {
        return Integer.parseInt(getString());
    }

    public static String getString()
    {
        try
        {
            byte arrInput[] = new byte[100];

            int length = System.in.read(arrInput);

            byte arrFinal[] = new byte[length - 2];

            System.arraycopy(arrInput, 0, arrFinal, 0, length - 2);

            String inputString = new String(arrFinal);

            return inputString;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }

        return null;
    }
}