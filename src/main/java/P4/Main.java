package P4;

/**
 * Created by spencerlandis on 10/3/14.
 */
public class Main {
    public static void main(String args[])
    {
        int max = 0;
        for(int i = 999; i > 99; i--)
        {
            for(int j = 999; j > 99 && i * j > max; j--)
            {
                if(IsPalindrome(i * j))
                {
                    max = i * j > max ? i * j : max;
                }
            }
        }
        System.out.println(max);
    }

    public static boolean IsPalindrome(Integer i)
    {
        String s = i + "";
        for(int c = 0; c < s.length(); c++)
        {
            if(s.charAt(c) != s.charAt(s.length()-1-c))
                return false;
        }
        return true;
    }
}
