

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int armut,elma,domates,muz,patlıcan;
     double armutKilo = 2.14 ,elmaKilo = 3.67 ,domatesKilo = 1.11 ,muzKilo = 0.95 ,patlıcanKilo = 5.0 ;
     double toplamfiyat;

    Scanner inp = new Scanner(System.in);

    System.out.print("Kaç kilo Armut aldınız? " );
        armut = inp.nextInt();

        System.out.print("Kaç kilo Elma aldınız? " );
        elma = inp.nextInt();

        System.out.print("Kaç kilo Domates aldınız? " );
        domates = inp.nextInt();

        System.out.print("Kaç kilo Muz aldınız? " );
        muz = inp.nextInt();

        System.out.print("Kaç kilo Patlıcan aldınız? " );
        patlıcan = inp.nextInt();

        toplamfiyat = (armutKilo * armut) + (elmaKilo * elma) + (domatesKilo * domates) + (muzKilo * muz) + (patlıcanKilo * patlıcan);
        System.out.println("Toplam Tutar : " + toplamfiyat );

        System.out.println("İyi günler dileriz!");

        }
    }
