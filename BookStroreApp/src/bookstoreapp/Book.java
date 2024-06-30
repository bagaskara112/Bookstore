package bookstoreapp;

public class Book {
    String judul;
    String namaPengarang;
    String penerbit;
    int tahunCetak;
    String kategori;

    public Book(String judul, String namaPengarang, String penerbit, int tahunCetak, String kategori) {
        this.judul = judul;
        this.namaPengarang = namaPengarang;
        this.penerbit = penerbit;
        this.tahunCetak = tahunCetak;
        this.kategori = kategori;
    }

    public void display() {
        System.out.println("Judul: " + judul);
        System.out.println("Nama Pengarang: " + namaPengarang);
        System.out.println("Penerbit: " + penerbit);
        System.out.println("Tahun Cetak: " + tahunCetak);
        System.out.println("Kategori: " + kategori);
    }
}
