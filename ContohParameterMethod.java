public class ContohParameterMethod {

    // Method dengan satu parameter
    public static int kaliDua(int angka) {
        int hasil = angka * 2;
        return hasil;
    }

    // Method dengan beberapa parameter
    public static double hitungLuasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;

    }

    public static void main(String[] args) {
        int hasilkaliDua = kaliDua(5); // Memanggil Method dengan argumen 5
        System.out.println("5 X 2 = " + hasilkaliDua);

        double luasSegitiga = hitungLuasSegitiga(4, 6); // Memanggil method dengan argumen 4 dan 6
        System.out.println("luas segitiga: " + luasSegitiga);

    }
}


