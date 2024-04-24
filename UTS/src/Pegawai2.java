public class Pegawai2 extends Pegawai {
    private final double asuransiKesehatanRate = 0.10;

    public Pegawai2(String jabatan) {
        super(jabatan);
    }

    @Override
    public double hitungBonus() {
        return (0.04 * gajiPokok);
    }

    @Override
    public double hitungAsuransiKesehatan() {
        double asuransi = gajiPokok * asuransiKesehatanRate;
        return (asuransi > 30) ? 30 : asuransi;
    }
}
