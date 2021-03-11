/*
    NAMA  : DWI CANDRA KIRANA
    NIM   : A11.2019.11759
    KELAS : PBO_4417

 */
package mahasiswa;

/**
 *
 * @author dwica
 */



public class Mahasiswa {
    private String m_nama;
    private String m_nim;
    
    // construktor
    Mahasiswa(){
        
    }
    
    public Mahasiswa(String nim, String nama){
        m_nama = nama;
        m_nim = nim;
           
    }
    
    //set Nim
    public void setNim(String mNim){
        m_nim = mNim;
    }
    
    //get Nim 
    public String getNim(){
        return m_nim;
    }
    public static void main(String[] args){
        Mahasiswa ceka = new Mahasiswa();
        ceka.setNim("A11.2019.11759");
        System.out.println(ceka.getNim());
    }
        

}
