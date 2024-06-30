
package bookstoreapp;

import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Book[] books = new Book[3];
            
            for (int i = 0; i < 3; i++) {
                System.out.println("Masukkan detail untuk buku " + (i + 1) + ":");
                System.out.print("Judul: ");
                String judul = scanner.nextLine();
                System.out.print("Nama Pengarang: ");
                String namaPengarang = scanner.nextLine();
                System.out.print("Penerbit: ");
                String penerbit = scanner.nextLine();
                System.out.print("Tahun Cetak: ");
                int tahunCetak = scanner.nextInt();
                scanner.nextLine();  // Mengonsumsi newline
                System.out.print("Kategori (su/r/d/a): ");
                String kategori = scanner.nextLine();
                
                switch (kategori) {
                    case "su":
                        books[i] = new AllAgesBook(judul, namaPengarang, penerbit, tahunCetak);
                        break;
                    case "r":
                        books[i] = new TeenBook(judul, namaPengarang, penerbit, tahunCetak);
                        break;
                    case "d":
                        books[i] = new AdultBook(judul, namaPengarang, penerbit, tahunCetak);
                        break;
                    case "a":
                        books[i] = new ChildBook(judul, namaPengarang, penerbit, tahunCetak);
                        break;
                    default:
                        System.out.println("Kategori tidak valid. Harap masukkan su, r, d, atau a.");
                        i--; // Ulangi iterasi ini
                        break;
                }
            }
            
            System.out.println("\nDetail buku yang dimasukkan:");
            for (Book book : books) {
                book.display();
                System.out.println();
            }
        }
    }
}