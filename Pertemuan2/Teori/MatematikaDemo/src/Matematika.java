
public class Matematika {
    // field
    int x;
    int y;
    
    // constructor
    Matematika(){
        
    }
    public void Matematika(int newX, int newY){
        this.x = newX;
        this.y = newX;
            
    }
    
    //method set Angka
    public void setAngka(int newX, int newY){
        this.x = newX;
        this.y = newY;
        
    }
    
    // method get
    public int getPertambahan(){
        return x+y;
    }
    public int getPerkurangan(){
        return x-y;
    }
    public int getPerkalian(){
        return x*y;
    }
    public int getPembagian(){
        return x/y;
    }


    
    
}
