import java.util.Scanner;

public class MPrismaSegitiga {
    public static void main(String[] args) {
        // Menginput Data
        // Scanner scan1 = new Scanner(System.in);
        // System.out.println("Masukkan alas Segitiga : ");
        // double t = scan1.nextDouble();
        // Scanner scan2 = new Scanner(System.in);
        // System.out.println("Masukkan tinggi Segitiga : ");
        // double a = scan2.nextDouble();
        // Scanner scan3 = new Scanner(System.in);
        // System.out.println("Masukkan tinggi prisma : ");
        // double tp = scan3.nextDouble();
        // scan1.close();
        // scan2.close();
        // scan3.close();
        

        //Membuat Prisma Segitiga
        Segitiga s = new Segitiga(3, 4);
        PrismaSegitiga p = new PrismaSegitiga(s, 5);
        System.out.println("Luas Prisma dengan luas segitiga "+ s.hitungLuas() + " adalah :" + p.hitungVolume());
    }
}
