public class ConsoleInput {

    public static int getInt()
    {
        return Integer.parseInt(getString());
    }

    public static float getFloat()
    {
        return Float.parseFloat(getString());
    }

    public static String getString()
    {
        try
        {
            byte arrInput[] = new byte[100];
            int inputLength = System.in.read(arrInput);

            byte arrFinal[] = new byte[inputLength - 2];

            System.arraycopy(arrInput, 0, arrFinal, 0, inputLength - 2);

            String objString = new String(arrFinal);

            return objString;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }

        return null;
    }
}