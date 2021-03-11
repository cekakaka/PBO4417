
public class TestTv {
    
    public static void main(String args[]) {
        Manusiaa man1 = new Manusiaa("CK");
        System.out.println(man1.namaSaya());
        TV tvku = new TV();
        man1.BeliTV(tvku);
        // Mengecek TV false atau true
        System.out.println(man1.getCekTV());
        man1.setJualSemuaTV();
        System.out.println(man1.getCekTV());        
                
        
    }
}
