package Familia51;
import java.util.Scanner;


public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a,b,c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro número: ");
		a = leia.nextInt();
		System.out.println("\nEntre com o segundo número: ");
		b = leia.nextInt();
		System.out.println("\nEntre com o terceiro número: ");
		c = leia.nextInt();
		
		if(a<=b && b<=c)
		{
			System.out.println("\nOrdem crescente:"+a+" , "+b+" , "+c);
		}
		else if(a<=c && c<=b)
		{
			System.out.println("\nOrdem crescente:"+a+" , "+c+" , "+b);
		}
		else if(b<=a && a<=c)
		{
			System.out.println("\nOrdem crescente:"+b+" , "+a+" , "+c);
		}
		else if(b<=c && c<=a)
		{
			System.out.println("\nOrdem crescente:"+b+" , "+c+" , "+a);
		}
		else if(c<=a && a<=b)
		{
			System.out.println("\nOrdem crescente:"+c+" , "+a+" , "+b);
		}
		else
		{
			System.out.println("\nOrdem crescente:"+c+" , "+b+" , "+a);
		}
	}


}


