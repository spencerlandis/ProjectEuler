package P3;

import java.util.ArrayList;
import static Math.Factorization.PrimeFactors;

/**
 * Created by spencerlandis on 10/3/14.
 */
public class Main {
    public static void main(String args[])
    {
        ArrayList<Long> result = PrimeFactors(600851475143L);
        Long max = 0L;
        for(Long l : result)
        {
            max = l > max ? l : max;
        }
        System.out.println(max);

    }

}
