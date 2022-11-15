package Java_Imp_Program;

public class Rev_Number {
	public static void main(String[] args) {
		int n=7563345;
		int rev=0;
		int rem=0;
		
		while(n>0) {
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
			}
		System.out.println(rev);
		
		/*int rev=0;
		int rem=0;
		int n=345874;
		while(n>0) {
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		System.out.println(rev);
		*/
		
	/*int n = 123;//12//1
	int rev = 0 ;
	int reminder=0;
	while(n>0) {//123>0=yes//12>0=yes//1>0=Yes
		reminder = n%10;//3//2//1
		rev=(rev*10)+reminder;//0+3=3//3*10+2=32//32*10+1=321
		n=n/10;//12//1//0
		
	}
	System.out.println(rev);
	*/

	}}
