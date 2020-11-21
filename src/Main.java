/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: menampilkan nama karakter
 * anime Detektfi Conan berbasis OOP dan implementasi pewarisan.
 */

public class Main {
    public static void main(String[] args) {
        ConanEdogawa conan = new ConanEdogawa("Conan Edogawa",
                "Tokoh protagonis utama", "Kappei Yamaguchi dan Minami Takayama",
                "Laki-laki", 7);
        conan.setNamaAsli("Shinici Kudo");
        conan.tampilKarakter();

        KogoroMouri kogoro = new KogoroMouri("Kogoro Mouri",
                "Tokoh utama", "Akira Amiya dan Rikiya Koyama",
                "Laki-laki", 38);
        kogoro.setNamaAnak("Ran Mouri");
        kogoro.setKeahlian("Ahli Judo");
        kogoro.tampilKarakter();

        RanMouri ran = new RanMouri("Ran Mouri",
                "Tokoh Utama", "Wakana Yamazaki",
                "Perempuan", 17);
        ran.setNamaAyah("Kogoro Mouri");
        ran.tampilKarakter();

        SonokoSuzuki sonoko = new SonokoSuzuki("Sonoko Suzuki",
                "Tokoh Pendukung", "Naoko Matsui",
                "Perempuan", 17);
        sonoko.setPacar("Makoto Kyogoku");
        sonoko.tampilKarakter();

        YusakoKudo yuki = new YusakoKudo("Yukiko Kudo",
                "Tokoh Pendukung", "Hideyuki Tanaka",
                "Laki-laki", 38);
        yuki.setKelebihan("Penulis Novel dan Sangat Cerdas");
        yuki.tampilKarakter();
    }
}
