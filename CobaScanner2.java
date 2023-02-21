import java.util.Scanner;

public class CobaScanner2 {
    public static void main(String[]arg){
        String nama,hobi,warnakesukaan;
        int umur,tinggibadan;

        Scanner input = new Scanner(System.in);
    
        System.out.print(" Tulis Nama = ");
        nama = input.next();

        System.out.println(" Tulis Umur = ");
        umur = input.nextInt();

        System.out.println("Tulis Tinggi Badan = ");
        tinggibadan = input.nextInt();

        warnakesukaan =umur%2 ==0 ?"biru":"merah";
        hobi = tinggibadan%2 ==0 ?"gosip":"mancing";

        System.out.print("nama = " + nama);
        System.out.print("umur = " + umur);
        System.out.print("tinggi badan = " + tinggibadan+"cm");
        System.out.print("warna kesukaan = " + warnakesukaan);
        System.out.print("hobi = " + hobi);

  }
}