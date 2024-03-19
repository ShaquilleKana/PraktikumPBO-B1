
import java.util.Scanner;
public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jejari Lingkaran : ");
        double jejari = scan.nextDouble();
        Lingkaran luas = new Lingkaran(jejari);
        scan.close();
        System.out.println("Luas lingkaran dengan jejari " + jejari + " adalah " + luas.hitungLuas());
    }
}
