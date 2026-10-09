public class Lingkaran extends Bentuk {
    private double radius;
    public static final double PHI = 3.141592653589793;

    // Constructor
    public Lingkaran(double radius, String warna) {
        super(warna);
        this.radius = radius;
    }

    // Getter dan Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double hitungLuas() {
        return PHI * radius * radius;
    }

    @Override
    public void printInfo() {
        System.out.println("Lingkaran " + warna + ", luas = " + hitungLuas());
    }
}
