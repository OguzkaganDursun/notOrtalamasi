import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Degiskenler olusturuldu.
        int matematik, fizik, kimya, turkce, tarih, muzik;

        // Scanner sinifi tanimlandi.
        Scanner scan = new Scanner(System.in);

        // Kullanicidan degerler alindi.
        System.out.println("Not Ortalamasi Hesaplanacaktir. \nLutfen Notunuzu Tam Sayi Cinsinden Yaziniz ! \n-------------------------------");
        System.out.print("Matematik Notunuzu Giriniz : ");
        matematik = scan.nextInt();

        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = scan.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = scan.nextInt();

        System.out.print("Turkce Notunuzu Giriniz : ");
        turkce = scan.nextInt();

        System.out.print("Tarih Notunuzu Giriniz : ");
        tarih = scan.nextInt();

        System.out.print("Muzik Notunuzu Giriniz : ");
        muzik = scan.nextInt();

        // Alinan degerler toplandi ve ortalamasi alindi.
        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6.0;

        // Ortalama kontrol edildi ve gecme durumu bilgisi verildi.
        boolean kosul = ortalama >= 60;
        System.out.println("-------------------------------");
        String sinif = kosul ? "Tebrikler ! \nSinifi Gectiniz." : "Sinifi Gecemediniz.";
        System.out.println(sinif);
    }
}
