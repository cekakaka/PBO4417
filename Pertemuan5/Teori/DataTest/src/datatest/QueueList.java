/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatest;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author dwica
 */
public class QueueList {
    private final Queue<NumberList> number = new LinkedList<>();

    QueueList() {
    }
    
    public void addNumbQ(NumberList numb){
        this.number.add(numb);
    }
    
    public void removeNumbQ(NumberList numb){
        this.number.remove(numb);
    }
    
    public void DataQueue(){
        for (int i = 0; i < number.size(); i++) {
             System.out.println(number.element().getNumber());
        }
    }
    public void Size(){
        NumberList head = this.number.peek();
        System.out.println("Head of Queue- "+ head);
        int size = number.size();
        System.out.println("Size Of Queue- "+size);
    }
    
    public void pollQueue(){
        NumberList peekNumb = this.number.poll();
        System.out.println("Poll Queue : "+peekNumb.getNumber());
    }
}
