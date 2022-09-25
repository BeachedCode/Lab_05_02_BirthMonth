public class Main
{
    public static void main(String[] args)
    {
        int birthMonth = 9;
        if (birthMonth > 0)
        {
            if(birthMonth < 13)
            {
                System.out.println("Your Birth Month is: " + birthMonth);
            }
            else
            {
                System.out.println("You entered an incorrect month value: " + birthMonth);
            }
        }

    }
}
