public class ConanEdogawa extends AnimeKarakter {
    private String namaAsli;

    public ConanEdogawa(String nama, String peran, String dubber, String jenisKelamin, int umur) {
        super(nama, peran, dubber, jenisKelamin, umur);
    }

    public void setNamaAsli(String namaAsli) {
        this.namaAsli = namaAsli;
    }

    @Override
    public void tampilKarakter() {
        super.tampilKarakter();
        System.out.println("Nama asli : " + namaAsli);
        System.out.print("\n");
    }
}
