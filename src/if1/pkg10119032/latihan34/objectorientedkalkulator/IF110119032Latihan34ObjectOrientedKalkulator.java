package if1.pkg10119032.latihan34.objectorientedkalkulator;
import java.util.Scanner;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program untuk menampilkan
 * program kalkulator ke layar.
 */
public class IF110119032Latihan34ObjectOrientedKalkulator {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        Kalkulator calculator = new Kalkulator();
        System.out.println("Aplikasi Kalkulator Bilangan");
        System.out.print("Masukan Angka ke-1 : ");
        calculator.value1 = input.nextDouble();
        System.out.print("Masukan Angka ke-2 : ");
        calculator.value2 = input.nextDouble();
        System.out.println();
        
        System.out.println("Hasil Pertambahan : " + calculator.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + calculator.kurangBilangan());
        System.out.println("Hasil Perkalian : " + calculator.kaliBilangan());
        System.out.println("Hasil Pembagian : " + calculator.bagiBilangan());
        System.out.println("Hasil Sisa : " + calculator.sisaBilangan());
    }
    
}