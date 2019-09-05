package atm;

/**
 *
 * @author ultimatehackers
 */
import java.util.Scanner;
class Atm{
	double Bal;
	static double serviceCharge;
	public Atm(double B){
		Bal = B;
		serviceCharge = 0.50;
	}
	public void createTransaction(double wd){
		if(wd%5==0){
			if(Bal+serviceCharge>=wd){
				Bal = Bal - wd - serviceCharge;
				System.out.printf("%.2f\n",Bal);
			}else{
				System.out.printf("%.2f\n",Bal);
			}
		}else{
			System.out.printf("%.2f\n",Bal);
		}
	}
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		double wdamt,bal;
		wdamt = sc.nextDouble();
		bal = sc.nextDouble();
                if(wdamt <=2000 && bal <= 2000){
                    Atm pooja = new Atm(bal);
                    pooja.createTransaction(wdamt);
                }             
        }
}






