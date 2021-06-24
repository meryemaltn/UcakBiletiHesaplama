import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int age, distance, roadType;
		double price;
		
		Scanner inp= new Scanner(System.in);
		System.out.println("Mesafeyi km türünden giriniz :");
		distance=inp.nextInt();
		price= distance*0.10;
		
		System.out.println("Yaþýnýzý giriniz :");
		age=inp.nextInt();
		
		System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiþ Dönüþ ):");
		roadType=inp.nextInt();
		
		// yolculuk türü 1 veya 2 deðilse hatalý veri girilmiþ olur.
		if (roadType!=1 && roadType!=2) {

			System.out.println("Hatalý Veri Girdiniz!");}
		
		else if (age>=0 && distance>=0) {
			switch (roadType) {
			case 1:
				if (age<12) {
				System.out.println("Bilet Fiyatýnýz: "+ (price/2));}
				else if(age>12 && age<24) {
				System.out.println("Bilet Fiyatýnýz: "+ (price-(price*0.10)));}
				else if(age>65) {
				System.out.println("Bilet Fiyatýnýz: "+ (price-(price*0.30)));}
				else
					System.out.println("Bilet Fiyatýnýz: "+ price);
				break;
			case 2:
				if (age<12) {
				System.out.println("Bilet Fiyatýnýz: "+ ((price/2-(price/2)*0.20)));}
				else if(age>12 && age<24) {
				System.out.println("Bilet Fiyatýnýz: "+ (72*price/50));}
				else if(age>65) {
				System.out.println("Bilet Fiyatýnýz: "+ (8*(price-(price*0.30)))/5);}
				else
					System.out.println("Bilet Fiyatýnýz: "+ (price-price*0.20)*2);
				break;
				}
			}
		else 
			System.out.println("Hatalý Veri Girdiniz!");
		}
	}
