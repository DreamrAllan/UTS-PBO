//  NO 2
public class Main {
    public static void main(String[] args) {
        // Data Pegawai
        Pegawai1 pegawai1 = new Pegawai1("Allan Sebagai Manager", 20);
        Pegawai2 pegawai2 = new Pegawai2("Marcelino Sebagai IT");
        PegawaiPW pegawaiPW = new PegawaiPW("Daffa Sebagai Sekertaris", 60, 10);

        // Menampilkan Data Pegawai
        System.out.println("Data Pegawai 1:\n" + pegawai1);
        System.out.println("\nData Pegawai 2:\n" + pegawai2);
        System.out.println("\nData Pegawai Paruh Waktu:\n" + pegawaiPW);

        // Mencari Pegawai dengan Take Home Pay Tertinggi
        double takeHomePay1 = pegawai1.gajiPokok + pegawai1.hitungBonus() - pegawai1.hitungAsuransiKesehatan();
        double takeHomePay2 = pegawai2.gajiPokok + pegawai2.hitungBonus() - pegawai2.hitungAsuransiKesehatan();
        double takeHomePayPW = pegawaiPW.getJamKerja() * pegawaiPW.getTarifPerJam();

        // Menampilkan Pegawai dengan Take Home Pay Tertinggi
        String pegawaiDenganPayTertinggi;

        if (takeHomePay1 > takeHomePay2 && takeHomePay1 > takeHomePayPW) {
            pegawaiDenganPayTertinggi = pegawai1.jabatan;
        } else if (takeHomePay2 > takeHomePay1 && takeHomePay2 > takeHomePayPW) {
            pegawaiDenganPayTertinggi = pegawai2.jabatan;
        } else {
            pegawaiDenganPayTertinggi = pegawaiPW.jabatan;
        }

        System.out.println("\nPegawai dengan take home pay tertinggi adalah: " + pegawaiDenganPayTertinggi);
    }
}

//// NO 1
//public class Main {
//    public static void main(String[] args) {
//        // Data Pegawai
//        Pegawai1 pegawai1 = new Pegawai1("Allan Sebagai Manager", 20);
//        Pegawai2 pegawai2 = new Pegawai2("Marcelino Sebagai IT");
//        PegawaiPW pegawaiPW = new PegawaiPW("Daffa Sebagai Sekertaris", 60, 10);
//
//        // Menampilkan Data Pegawai
//        System.out.println("Data Pegawai 1:\n" + pegawai1);
//        System.out.println("\nData Pegawai 2:\n" + pegawai2);
//        System.out.println("\nData Pegawai Paruh Waktu:\n" + pegawaiPW);
//    }
//}
