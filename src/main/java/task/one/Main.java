package task.one;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

   public static void main(String[] args) {
       ListOperator op = new ListOperator();

       List<Integer> list = new ArrayList<Integer>();

       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);

       int c = op.max(list);
       System.out.println("MAX int from 1-5 is ");
       System.out.println(c);

       List<Account> acc = new LinkedList<Account>();

       acc.add(new Account(1));
       acc.add(new Account(2));
       acc.add(new Account(3));
       acc.add(new Account(4));
       acc.add(new Account(5));

       System.out.println("Original list");

       for (Account a : acc) {
           System.out.println(a.toString());
       }

       op.changeElementsPosition(acc, 1 , 3);

       System.out.println("After 2-4 swap ");

       for (Account a : acc) {
           System.out.println(a.toString());
       }

       System.out.println(op.max(acc));

   }

}
