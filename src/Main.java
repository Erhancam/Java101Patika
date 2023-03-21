import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num , toplam =0 , sayac=0;
        double bolum;
        Scanner input = new Scanner(System.in);
        System.out.println("-----12 YE BÖLÜNEN SAYILARIN TOPLAMI-----");
        System.out.print("Bir sayı giriniz : ");
        num = input.nextInt() ;

        for(int i =1;i<=num;i++){
            if(i%12==0){
                toplam +=i;
                sayac++;
            }
        }
        if(sayac == 0){
            System.out.println("12ye bölünen herhangi bir değer yok.");
        }else {
            bolum = toplam / sayac;
            System.out.println(bolum);
        }
    }
}