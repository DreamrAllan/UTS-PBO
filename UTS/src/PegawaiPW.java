public class PegawaiPW extends Pegawai {
    private int jamKerja;
    private int tarifPerJam;

    public PegawaiPW(String jabatan, int jamKerja, int tarifPerJam) {
        super(jabatan);
        this.jamKerja = jamKerja;
        this.tarifPerJam = tarifPerJam;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public int getTarifPerJam() {
        return tarifPerJam;
    }

    @Override
    public double hitungBonus() {
        return 0;
    }

    @Override
    public double hitungAsuransiKesehatan() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "\nJam Kerja: " + jamKerja + " jam" + "\nTarif Per Jam: $" + tarifPerJam;
    }
}
