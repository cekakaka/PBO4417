
public class Buku {
    String judul;
    String pengarang;
    String penerbit;
    int tahun;
    
    Buku(){
        
    }
    public Buku(String newJudul, String newPengarang, String newPenerbit, int newTahun){
        this.judul = newJudul;
        this.pengarang = newPengarang;
        this.penerbit = newPenerbit;
        this.tahun = newTahun;
    }
    
    public void setCetakBuku(String newJudul, String newPengarang, String newPenerbit, int newTahun){
        this.judul = newJudul;
        this.pengarang = newPengarang;
        this.penerbit = newPenerbit;
        this.tahun = newTahun;
    }
    
}
