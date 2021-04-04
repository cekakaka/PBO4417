package datatest;

import java.util.ArrayList;

public class Array_List extends NumberList{
    
    private final ArrayList<NumberList> arrNum = new ArrayList<>();
    
    public void addNumber(NumberList num){
        arrNum.add(num);
        
    }
    
    public void DataList(){
        for (int i=0; i < arrNum.size();i++){
            System.out.println("Number : " +arrNum.get(i).getNumber());
        }
    }
    
    public void removeNumber(NumberList num){
        arrNum.remove(num);
    }
    
    
    
    
   
    
    
}
