public class DenganMethod {
    public static void main(String[] args) {
        int gajiPokok = 5000000;
        int tunjanganTransport = 500000;
        int tunjanganMakan = 300000;
        int bonus = 1000000;

        int totalpenghasilan = hitungTotalPenghasilan(gajiPokok, tunjanganTransport, tunjanganMakan, bonus );
        int Pajak = hitungPajak(totalpenghasilan);
        int gajiBersih = hitungGajiBersih(totalpenghasilan, Pajak);

        tampilkanGa()



    }
}
