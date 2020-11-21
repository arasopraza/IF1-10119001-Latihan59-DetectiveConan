public class AnimeKarakter {
    private String nama, peran, dubber,
            jenisKelamin;
    private int umur;

    public AnimeKarakter(String nama, String peran, String dubber,
                         String jenisKelamin, int umur) {
        this.nama = nama;
        this.peran = peran;
        this.dubber = dubber;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
    }

    public void tampilKarakter() {
        System.out.println("Nama Karakter : " + nama);
        System.out.println("Peran: " + peran);
        System.out.println("Di dubbing oleh : " + dubber);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Umur : " + umur + " tahun");
    }
}
