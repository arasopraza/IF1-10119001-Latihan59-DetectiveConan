public class SonokoSuzuki extends AnimeKarakter {
    private String pacar;

    public SonokoSuzuki(String nama, String peran, String dubber, String jenisKelamin, int umur) {
        super(nama, peran, dubber, jenisKelamin, umur);
    }

    public void setPacar(String pacar) {
        this.pacar = pacar;
    }

    @Override
    public void tampilKarakter() {
        super.tampilKarakter();
        System.out.println("Nama Pacar : " + pacar);
        System.out.print("\n");
    }
}
