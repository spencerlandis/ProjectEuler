package P2;

/**
 * Created by spencerlandis on 10/3/14.
 */
public class Main {

    public static void main(String args[])
    {
        int prev = 1;
        int curr = 1;
        int sum = 0;
        while(curr < 4000000)
        {
            sum += curr % 2 == 0 ? curr : 0;
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        System.out.println(sum);
    }
}
