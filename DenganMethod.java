public class DenganMethod {

    public static void main(String[] args) {
        int gajiPokok = 5000000;
        int tunjanganTransport = 500000;
        int tunjanganMakan = 300000;
        int bonus = 1000000;

        int totalpenghasilan = hitungtotalpenghasilan(gajiPokok, tunjanganTransport, tunjanganMakan, bonus);
        int Pajak = hitungPajak(totalpenghasilan);
        int gajiBersih = hitungGajiBersih(totalpenghasilan, Pajak);

        tampilkanDetailGaji(gajiPokok, tunjanganTransport, tunjanganMakan, bonus, Pajak, gajiBersih);

    }

    public static int hitungtotalpenghasilan(int gajiPokok, int tunjanganTransport, int tunjanganMakan, int bonus) {
        return gajiPokok + tunjanganTransport + tunjanganMakan + bonus;

    }

    public static int hitungPajak(int totalPenghasilan) {
        return totalPenghasilan * 10 / 100;

    }

    public static int hitungGajiBersih(int totalPenghasilan, int pajak) {
        return totalPenghasilan - pajak;

    }

    public static void tampilkanDetailGaji(int gajiPokok, int tunjanganTransport, int tunjanganMakan, int bonus, int pajak, int gajiBersih) {
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan Transport: " + tunjanganTransport);
        System.out.println("Tunjangan Makan: " + tunjanganMakan);
        System.out.println("Bonus: " + bonus);

    }
}