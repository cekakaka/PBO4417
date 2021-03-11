/*
 NAMA = DWI CANDRA KIRANA
 NIM  = A11.2019.11759 
 */

/**
 *
 * @author dwica
 */

public class EncapTest {
    // field
    private String name;
    private String idNum;
    private int age;
    
    // get n set
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getIdNum(){
        return idNum;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setIdNum(String newIdNum){
        idNum = newIdNum;
    }
    
    
    
    public static void main(String args[]) {
        EncapTest encap = new EncapTest();
        encap.setName("Dwi Candra Kirana");
        encap.setAge(17);
        encap.setIdNum("A11.2019.11759");
        
        System.out.println("Name : "+ encap.getName() + ", Age : "+ encap.getAge());
        
    }
}
