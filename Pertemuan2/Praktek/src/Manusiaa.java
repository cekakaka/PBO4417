
public class Manusiaa {
    //field
    private String name;
    private boolean punyaTV;
    
    //constructor
    Manusiaa(){
        name = "noname";
        punyaTV = false;        
    }
    
    public Manusiaa(String newNama){
        this.name = newNama;
    }
    
    // method
    public String getName(){
        return this.name;
    }
    public String namaSaya(){
        return this.name;
    }
    public void BeliTV(TV tiviku){
        punyaTV = true;
    }
    public void setJualSemuaTV(){
        punyaTV = false;
    }
    public boolean getCekTV(){
        return punyaTV;
    }
    
}
