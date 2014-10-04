package P5;

import java.util.ArrayList;
import java.util.Collections;

import static Math.Factorization.PrimeFactors;
/**
 * Created by spencerlandis on 10/3/14.
 */
public class Main {
    public static void main(String args[])
    {
        Long limit = 20L;
        ArrayList<Long> factors = new ArrayList<Long>();
        for(Long i = 2L; i < limit; i++)
        {
            ArrayList<Long> temp = PrimeFactors(i);
            for(Long l : temp)
            {
                while(Collections.frequency(temp, l) > Collections.frequency(factors, l))
                {
                    factors.add(l);
                }
            }
        }
        Long result = 1L;
        for(Long l : factors)
            result *= l;
        System.out.println(result);
    }
}
