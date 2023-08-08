import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int ay,gun;
		Scanner inp = new Scanner(System.in);
		System.out.println("Dogdugunuz ayi giriniz: ");
		ay = inp.nextInt();
		
		System.out.println("Dogdugunuz gunu giriniz: ");
		gun = inp.nextInt();
		
		if(ay == 1) {
			if((gun>=1) && (gun<=21)) {
				System.out.println("Burcunuz Oglak");
			}
			else if((gun>=22) && (gun<=31)) {
				System.out.println("Burcunuz Kova");
			}
			else {
				System.out.println("Gecersiz gun girdiniz.");
			}
		}
		else if(ay == 2) {
			if((gun>=1) && (gun<=19)) {
				System.out.println("Kova Oglak");
			}
			else if((gun>=20) && (gun<=29)) {
				System.out.println("Burcunuz Balik");
			}
			else {
				System.out.println("Gecersiz gun girdiniz.");
			}
		}
		else if(ay == 3) {
			if((gun>=1) && (gun<=20)) {
				System.out.println("Burcunuz Balik");
			}
			else if((gun>=21) && (gun<=31)) {
				System.out.println("Burcunuz Koc");
			}
			else {
				System.out.println("Gecersiz gun girdiniz.");
			}
		}
		else if(ay == 4) {
			if((gun>=1) && (gun<=20)) {
				System.out.println("Burcunuz Koc");
			}
			else if((gun>=21) && (gun<=30)) {
				System.out.println("Burcunuz Boga");
			}
			else {
				System.out.println("Gecersiz gun girdiniz.");
			}
		}
		else if(ay == 5) {
			if((gun>=1) && (gun<=21)) {
				System.out.println("Burcunuz Boga");
			}
			else if((gun>=22) && (gun<=31)) {
				System.out.println("Burcunuz Ikizler");
			}
			else {
				System.out.println("Gecersiz gun girdiniz.");
			}
		}
		else if(ay == 6) {
			if((gun>=1) && (gun<=22)) {
				System.out.println("Burcunuz Ikizler");
			}
			else if((gun>=23) && (gun<=30)) {
				System.out.println("Burcunuz Yengec");
			}
			else {
				System.out.println("Gecersiz gun girdiniz.");
			}
		}
		else if(ay == 7) {
			if((gun>=1) && (gun<=22)) {
				System.out.println("Burcunuz Yengec");
			}
			else if((gun>=23) && (gun<=31)) {
				System.out.println("Burcunuz Aslan");
			}
			else {
				System.out.println("Gecersiz gun girdiniz.");
			}
		}
		else if(ay == 8) {
			if((gun>=1) && (gun<=22)) {
				System.out.println("Burcunuz Aslan");
			}
			else if((gun>=23) && (gun<=31)) {
				System.out.println("Burcunuz Basak");
			}
			else {
				System.out.println("Gecersiz gun girdiniz.");
			}
		}
		else if(ay == 9) {
			if((gun>=1) && (gun<=22)) {
				System.out.println("Burcunuz Basak");
			}
			else if((gun>=23) && (gun<=30)) {
				System.out.println("Burcunuz Terazi");
			}
			else {
				System.out.println("Gecersiz gun girdiniz.");
			}
		}
		else if(ay == 10) {
			if((gun>=1) && (gun<=22)) {
				System.out.println("Burcunuz Terazi");
			}
			else if((gun>=23) && (gun<=31)) {
				System.out.println("Burcunuz Akrep");
			}
			else {
				System.out.println("Gecersiz gun girdiniz.");
			}
		}
		else if(ay == 11) {
			if((gun>=1) && (gun<=21)) {
				System.out.println("Burcunuz Akrep");
			}
			else if((gun>=22) && (gun<=30)) {
				System.out.println("Burcunuz Yay");
			}
			else {
				System.out.println("Gecersiz gun girdiniz.");
			}
		}
		else if(ay == 12) {
			if((gun>=1) && (gun<=21)) {
				System.out.println("Burcunuz Yay");
			}
			else if((gun>=22) && (gun<=31)) {
				System.out.println("Burcunuz Oglak");
			}
			else {
				System.out.println("Gecersiz gun girdiniz.");
			}
		}
		
		else {
			System.out.println("Gecersiz ay girdiniz.");
		}

	}

}
