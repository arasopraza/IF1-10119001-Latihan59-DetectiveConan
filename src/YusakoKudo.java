public class YusakoKudo extends AnimeKarakter {
    private String kelebihan;

    public YusakoKudo(String nama, String peran, String dubber, String jenisKelamin, int umur) {
        super(nama, peran, dubber, jenisKelamin, umur);
    }

    public void setKelebihan(String kelebihan) {
        this.kelebihan = kelebihan;
    }

    @Override
    public void tampilKarakter() {
        super.tampilKarakter();
        System.out.println("Kelebihan : " + kelebihan);
        System.out.print("\n");

    }
}
