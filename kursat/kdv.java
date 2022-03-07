package KDV;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // kullanıcadan para değerini alıyor 
        Scanner inp = new Scanner(System.in);

        int userMoney;
        System.out.print("Lütfen bir birim fiyatı giriniz= ");
        userMoney = inp.nextInt();
        System.out.println("Ürün fiyatı= "+ userMoney + "₺");

        // KDV hesaplama
        double mKDV, pKDV;
        mKDV = (userMoney <= 1000) ? 0.18 : 0.08;
        pKDV = userMoney + (userMoney * mKDV);
        System.out.println("KDV\'li fiyat= " + pKDV + "₺");

        // KDV tutarı farkını alma

        double fKDV = userMoney * mKDV;
        System.out.println("KDV tutarı = " +fKDV + "₺");


    }
}