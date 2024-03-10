package bus;

import java.util.Scanner;

public class TicketInfo {

	public static void main(String[] args) {
	

		Scanner input = new Scanner(System.in);
		
		double yas,km,yolculuktip;
		double kmbasi,biletfiyat,cocukindirim1,cocukindirim2,gencindirim2,gencindirim1,yaslindirim2,yaslindirim1,tipindirim;
		kmbasi = 0.10;
		tipindirim = 0.80;
		
		System.out.print("Yolculuk tipini seçiniz (1 = tek yön) (2 = çift yön) :");
		yolculuktip = input.nextInt();
		 
		
		if(yolculuktip == 1 || yolculuktip == 2) {
			System.out.print("Yaşınızı giriniz :");
			 yas = input.nextInt();
			if(yas > 0) {
				System.out.print("Mesafeyi giriniz:");
				km = input.nextInt();
				biletfiyat = km * kmbasi;
				if(km > 0) {
			
					cocukindirim1 = biletfiyat * 0.50;
					gencindirim1 = biletfiyat * 0.90;
					yaslindirim1 = biletfiyat * 0.70;
					
					
					
					
					if(yas < 12 && yolculuktip == 1) {
						
						System.out.print("Bilet fiyatınız :" + cocukindirim1);
					}
					else if(yas < 12 && yolculuktip == 2) {
						
						cocukindirim2 = (cocukindirim1 * tipindirim) * 2;
						System.out.print("Bilet fiyatınız :" + cocukindirim2);
					}
					else if(yas <=24 && yolculuktip == 1){
						System.out.print("Bilet fiyatınız : " + gencindirim1);
					}
					else if(yas <= 24 && yolculuktip == 2) {
						gencindirim2 = (gencindirim1 * tipindirim) * 2;
						System.out.print("Bilet fiyatınız : " + gencindirim2);
					}
					else if(yas > 65 && yolculuktip == 1) {
						System.out.print("Bilet fiyatınız : " + yaslindirim1);
					}
					else if(yas > 65 && yolculuktip == 2) {
						yaslindirim2 = (yaslindirim1 * tipindirim) * 2;
						System.out.print("Bilet fiyatınız : " + yaslindirim2);
 					}
					else if(yolculuktip == 2) {
						System.out.print("Bilet fiyatınız :" +(biletfiyat * tipindirim) * 2);
					}
					else {
						System.out.print("Bilet fiyatınız :" +  biletfiyat);
					}
					
					
				}else {
					System.out.print("Hatalı veri girdiniz !!");
				}
				
			}else {
				System.out.print("Hatalı veri girdiniz !!");
			}
			
		}else {
			System.out.print("Hatalı veri girdiniz !!");
		}
		
		
		
		
	}

}
