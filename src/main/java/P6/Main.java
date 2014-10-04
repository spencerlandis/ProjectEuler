package P6;

/**
 * Created by spencerlandis on 10/3/14.
 */
public class Main {
    public static void main(String args[])
    {
        int sum = 0;
        int sumSquared = 0;
        for(int i = 1; i <= 100; i++)
        {
            sum += i;
            sumSquared += i * i;
        }
        sum *= sum;
        System.out.println(sum - sumSquared);
    }
}
