package Familia51;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2,n3,Maior;
		Scanner leia = new Scanner(System.in);


		System.out.println("\nDigite um número: ");
		n1 = leia.nextInt();
		System.out.println("\nDigite outro número: ");
		n2 = leia.nextInt();
		System.out.println("\nDigite mais outro número: ");
		n3 = leia.nextInt();

		if(n1>n2 && n1>n3)
        {
            System.out.println("\nO maior número é: "+n1);
        }
        else if(n2>n1 && n2 > n3)
        {
            System.out.println("\nO maior número é: "+n2);
        }
        else 
        {
        System.out.println("\nO maior número é: "+n3);

        	}
		}
	}
