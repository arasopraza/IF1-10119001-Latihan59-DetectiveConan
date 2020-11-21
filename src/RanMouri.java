public class RanMouri extends AnimeKarakter {
    private String namaAyah;

    public RanMouri(String nama, String peran, String dubber, String jenisKelamin, int umur) {
        super(nama, peran, dubber, jenisKelamin, umur);
    }

    public void setNamaAyah(String namaAyah) {
        this.namaAyah = namaAyah;
    }

    @Override
    public void tampilKarakter() {
        super.tampilKarakter();
        System.out.println("Nama Ayah : " + namaAyah);
        System.out.print("\n");
    }
}
