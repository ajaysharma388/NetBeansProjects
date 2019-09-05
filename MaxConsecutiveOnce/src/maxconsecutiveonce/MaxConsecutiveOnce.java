package maxconsecutiveonce;
import java.util.Scanner;
/**
 *
 * @author ultimatehackers
 */
class MaxConsecutiveOnce
{
	private static int maxConsecutiveOnce(int x)
        {
		int count = 0;
		while (x!=0)
                {
			x = (x & (x << 1));
			count++;
		}
		return count;
        }
	public static void main(String strings[])
	{       
            Scanner sc = new Scanner(System.in);
            int ques = 0;
            int num = sc.nextInt();
            System.out.println(maxConsecutiveOnce(num));
     	}
}
