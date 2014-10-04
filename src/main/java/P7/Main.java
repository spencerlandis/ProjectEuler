package P7;

import static Math.Factorization.IsPrime;

/**
 * Created by spencerlandis on 10/3/14.
 */
public class Main {
    public static void main(String args[])
    {
        //start at 1 because it will increment to 2 before checking the first time
        Long current = 1L;
        int count = 1;
        while(count < 10001)
        {
            current++;
            count += IsPrime(current) ? 1 : 0;
        }
        System.out.println(current);
    }
}
