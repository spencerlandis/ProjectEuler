package Math;

import java.util.ArrayList;

/**
 * Created by spencerlandis on 10/3/14.
 */
public class Factorization {
    public static ArrayList<Long> PrimeFactors(Long value)
    {
        ArrayList<Long> result = new ArrayList<Long>();
        for(Long i = 2L; i < value; i++)
        {
            if(value % i == 0)
            {
                result.add(i);
                result.add(value / i);
                i = value;
            }
        }
        if(result.size() == 0)
        {
            result.add(value);
        }
        else
        {
            ArrayList<Long> temp = new ArrayList<Long>();
            for(Long i : result)
            {
                temp.addAll(PrimeFactors(i));
            }
            result = temp;
        }
        return result;
    }
    public static boolean IsPrime(Long value)
    {
        double limit = Math.sqrt(value);
        if(value % 2 == 0)
          return false;
        for(Long l = 3L; l <= limit; l += 2)
        {
            if(value % l == 0)
                return false;
        }
        return true;
    }
}
