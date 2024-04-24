public abstract class Pegawai {
    protected String jabatan;
    protected int gajiPokok = 550;

    public Pegawai(String jabatan) {
        this.jabatan = jabatan;
    }

    public abstract double hitungBonus();

    public abstract double hitungAsuransiKesehatan();

    @Override
    public String toString() {
        return "Jabatan: " + jabatan + "\nGaji Pokok: $" + gajiPokok + "\nBonus: $" + hitungBonus() + "\nAsuransi Kesehatan: $" + hitungAsuransiKesehatan();
    }
}
