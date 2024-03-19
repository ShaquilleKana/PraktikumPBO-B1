package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
    private double panjang, tinggi;

    public Segitiga(double panjang, double tinggi, int jumlahSisi){
        this.panjang = panjang;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }
    
    public double hitungLuas(){
        return (panjang * tinggi)/ 2;
    }

    public void printInfo(){
        System.out.println("Bangun Segitiga Bersisi " + this.getjumlahSisi());
    }
}
