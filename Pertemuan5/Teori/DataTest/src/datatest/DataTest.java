/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatest;

import java.util.Stack;

/**
 *
 * @author dwica
 */
public class DataTest {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("---------- ARRAYLIST -----------");
        Array_List array = new Array_List();
        NumberList number1 = new NumberList();
        NumberList number2 = new NumberList();
        NumberList number3 = new NumberList();
        NumberList number4 = new NumberList();
        
        // set data
        number1.setNumber(10);
        number2.setNumber(11);
        number3.setNumber(17);
        number4.setNumber(21);
        
        //add array_list
        array.addNumber(number1);
        array.addNumber(number2);
        array.addNumber(number3);
        array.addNumber(number4);
        
        //ambil data
        array.DataList();
        System.out.println("---------- Remove List -----------");
        array.removeNumber(number4);
        array.removeNumber(number1);
        array.DataList();
        
        //queue data
        System.out.println("------------ Queue -------------");
        QueueList queue = new QueueList();
        queue.addNumbQ(number1);
        queue.addNumbQ(number2);
        queue.addNumbQ(number3);
        queue.addNumbQ(number4);
        queue.DataQueue();
        
        // remove queue
        queue.removeNumbQ(number2);
        System.out.println("------------ Remove Queue ----------");
        queue.DataQueue();
        
        //poll queue
        queue.pollQueue();
        System.out.println("---------- POLL QUEUE -------------");
        queue.DataQueue();
        
        queue.Size();
        
        // STACKK
        System.out.println("------------- Stack -------------");
        StackData stack = new StackData();
        Stack<NumberList> stack1 = new Stack<>();
        stack.pushNumber(number4);
        stack.pushNumber(number3);
        stack.pushNumber(number2);
        stack.pushNumber(number1);
        stack.printStack();
        
        //pop Stack
        System.out.println("------------ POP STACKKK ----------");
        stack.popData(number4);
        stack.printStack();
        
        // peek
        System.out.println("------- PEEKK STACKK ---------");
        stack.peekData(number3);
    }
    
}
