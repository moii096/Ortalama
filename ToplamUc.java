package Ucdort;

import java.util.Scanner;

public class ToplamUc {

	public static void main(String[] args) {
         
		Scanner scan= new Scanner (System.in);
		int k , sayac = 0 ;
		 
				double ortalama , toplam=0 ;
		System.out.println("bir sayi giriniz ");
		k=scan.nextInt();
		for(	int i =1 ;i<=k ; i++ ) {
					if(i %3==0 ||  i %4 == 0) {
				toplam=toplam+i;
				sayac++ ;
		
	} 
			}System.out.println("sayilarin toplami "+ toplam);
			ortalama = toplam/ sayac ;
	         System.out.println("Sayilarin ortalamasi "  + ortalama);
	}

}
