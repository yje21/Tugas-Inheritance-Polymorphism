public class Silinder extends Lingkaran {
    private double tinggi;

    // Constructor
    public Silinder(double tinggi, double radius, String warna) {
        super(radius, warna); // Memanggil constructor Lingkaran
        this.tinggi = tinggi;
    }

    // Getter dan Setter
    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }

    @Override
    public void printInfo() {
        System.out.println("Silinder warna " + warna + ", volume = " + hitungVolume());
    }
}
