public class Segitiga {
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getAlas(){
        return alas;
    }

    public double getTinggi(){
        return tinggi;
    }
    
    public double hitungLuas(){
        return (alas * tinggi)/ 2;
    }

}
