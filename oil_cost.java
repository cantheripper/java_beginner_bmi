package oil_cost;

import java.util.Scanner;

public class oil_cost {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//21.28 TL/LT 13.08.22 in Ankara Capital of Turkey PO
		double oil = 21.15;
		System.out.println("Lütfen kaç litre alacağınızı yazınız");
		double purchased_litre = scanner.nextDouble();
		double total_cost=(oil*purchased_litre);
		System.out.println("Toplam Ödeme:"+ total_cost+"TL");
		
		
		

	}

}
