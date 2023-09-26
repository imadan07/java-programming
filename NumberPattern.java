public class NumberPattern {
    public static void main(String[] args)
    {

        int numberOfRows= 6;
        for (int i= 0; i<= numberOfRows-1; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print("1"+ " ");
            }
            System.out.println();
        }
        for (int i=numberOfRows-1; i>=0; i--)
        {

            for(int j=0; j <= i-1;j++)
            {
                System.out.print("1"+ " ");
            }
            System.out.println();
        }
    }
}
