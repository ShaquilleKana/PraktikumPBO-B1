import java.util.Scanner;

class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.println("Masukkan panjang sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi "+ sisi + " satuan adalah "+ bs.hitungLuas(sisi));
    }
}


/* Karena jika tidak ada class BujurSangkar maka tidak ada operasi yang dilaksanakan, karena MBujurSangkar akan berusaha membuat objek dari BujurSangkar */