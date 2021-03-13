/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dwica
 */
public class BukuDemo {

    public static void main(String args[]) {
        Buku book = new Buku();
        Buku book2 = new Buku();
        // BUKU PERTAMA
        
        book.setCetakBuku("PBO", "Indra", "Elex", 2007);
        System.out.println("Judul     = "+ book.judul);
        System.out.println("Pengarang = "+ book.pengarang);
        System.out.println("Penerbit  = "+ book.penerbit);
        System.out.println("Tahun     = "+ book.tahun);
        
        System.out.println("");
        // BUKU KEDUA
        book2.setCetakBuku("Java", "Ajib", "Andi", 2007);
        System.out.println("Judul     = "+ book2.judul);
        System.out.println("Pengarang = "+ book2.pengarang);
        System.out.println("Penerbit  = "+ book2.penerbit);
        System.out.println("Tahun     = "+ book2.tahun);
    }
}
