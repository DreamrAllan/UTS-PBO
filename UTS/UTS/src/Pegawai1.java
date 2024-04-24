public class Pegawai1 extends Pegawai {
    private int tunjangan;
    private final double asuransiKesehatan = 30;

    public Pegawai1(String jabatan, int tunjangan) {
        super(jabatan);
        this.tunjangan = tunjangan;
    }

    @Override
    public double hitungBonus() {
        return (0.04 * (gajiPokok + tunjangan));
    }

    @Override
    public double hitungAsuransiKesehatan() {
        return asuransiKesehatan;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTunjangan: $" + tunjangan ;
    }
}
