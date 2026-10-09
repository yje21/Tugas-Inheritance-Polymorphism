public class MainDemo {
    public static void main(String[] args) {
        Bentuk b = new Bentuk("Kuning");
        b.printInfo();

        // Menguji BujurSangkar
        BujurSangkar bs = new BujurSangkar(5.0, "Merah");
        bs.printInfo();

        // Menguji Lingkaran
        Lingkaran lk = new Lingkaran(7.0, "Biru");
        lk.printInfo();

        // Menguji Silinder
        Silinder sl = new Silinder(10.0, 7.0, "Hijau");
        sl.printInfo();
    }
}