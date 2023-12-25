import java.util.Scanner;
public class Projekt3 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner tastatura = new Scanner(System.in);
		System.out.println("Vnesi je prvata strana: ");
		a= tastatura.nextInt();
		System.out.println("Vnesi je vtorata strana:");
		b= tastatura.nextInt();
		c= tastatura.nextInt();
		
		if(a+b>c && b+c>a) {
			System.out.println("So dadenite strani se formira triagolnikot. ");
		}else {
			System.out.println("So dadenite strani ne se forimra triagolnikot. ");
			System.exit(0);
		}
		if(a*a+b*b==c*c || a*a+c*c==b*b ||b*b+c*c==a*a) {
			System.out.println("Triagolnik e pravoagolen.");
		}
		else if(a*a+b*b<c*c || a*a+c*c<b*b || b*b+c*c<a*a) {
			System.out.println("Triagolnik e tapoagolen.");
		}
		else {
			System.out.println("Triagolnik e ostroagolen.");
		}
	}
}
