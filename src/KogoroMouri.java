public class KogoroMouri extends AnimeKarakter {
    private String namaAnak, keahlian;

    public KogoroMouri(String nama, String peran, String dubber, String jenisKelamin, int umur) {
        super(nama, peran, dubber, jenisKelamin, umur);
    }

    public void setNamaAnak(String namaAnak) {
        this.namaAnak = namaAnak;
    }

    public void setKeahlian(String keahlian) {
        this.keahlian = keahlian;
    }

    @Override
    public void tampilKarakter() {
        super.tampilKarakter();
        System.out.println("Kelebihan : " + keahlian);
        System.out.println("Anak : " + namaAnak);
        System.out.print("\n");
    }
}
