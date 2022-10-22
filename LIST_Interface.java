/* LIST INTERFACE:
The List interface provides a way to store the ordered collection.
It is an ordered collection of objects in which duplicate values can be stored.
The List interface is used by one of the most popular classes in Java collections which is ArrayList.
It is also implemented by the LinkedList class.
It is also implemented by Vector class and it is also used by Stack class which is inherited from Vector class. 
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    List<Integer> l1 = new ArrayList<Integer>();
	   // add element in ArrayList
	    l1.add(2);
	    l1.add(4);
	    l1.add(5);
	    System.out.println(l1);
	   // add element at given index
	    l1.add(1,3);
	    System.out.println(l1);
	    List<Integer> l2 =new ArrayList<Integer>();
	    l2.add(76);
	    l2.add(21);
	   // add list2 form index
	   l1.addAll(3,l2);
	   System.out.println(l1);
	   //Remove element form index
	   l1.remove(1) ;
	   System.out.println(l1);
	   //get element form index
	   System.out.println(l1.get(3));
	   //set element at index 
	   l1.set(2,8);
	   System.out.println(l1);
	   System.out.println(l1.indexOf(2));
	}
}
