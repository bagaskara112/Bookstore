package bookstoreapp;

public class ChildBook extends Book {
    public ChildBook(String judul, String namaPengarang, String penerbit, int tahunCetak) {
        super(judul, namaPengarang, penerbit, tahunCetak, "a");
    }
}