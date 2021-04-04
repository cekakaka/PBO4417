
package datatest;
import java.util.*;
import java.util.Stack;



public class StackData extends NumberList{
    
    private final Stack<NumberList> numb = new Stack<NumberList>();
    
    StackData(){
        
    }
    // push
    public NumberList pushNumber(NumberList number){
        return this.numb.push(number);
    }
    
    //pop
    public void popData(NumberList number){
        NumberList popNumb = this.numb.pop();
        System.out.println("Pop Stack : "+popNumb.getNumber());
    }
    //peek
    public void peekData(NumberList number){
        NumberList peekNumb = this.numb.peek();
        System.out.println("Peek Stack : "+peekNumb.getNumber());
    }
    // show Data
    public void printStack(){
        for (int j=0; j < numb.size(); j++){
            System.out.println(numb.get(j).getNumber());
        }
    }
    
}
    
    
    
    

