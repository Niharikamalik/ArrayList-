import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    ArrayList<String> al =new ArrayList<String>();
	    al.add("12");
	    al.add("24");
	    al.add("54");
	    al.add("2,25");
	    System.out.println(al+" ");
	   System.out.println("Method 1 using get() ");
	   for(int i = 0 ; i<al.size();i++){
	       System.out.print(al.get(i)+" ");
	   }
	   
	    System.out.println("\nMethod 2 using for each loop ");
	    for(String s:al){
	        System.out.print(s+ " ");
	    }
	    System.out.println("\nMethod 3 using iterator ");
	    Iterator it =al.iterator();
	    while(it.hasNext()){
	        System.out.print(it.next()+" ");
	    }
	     System.out.println("\nMethod 4 using For-each method ");
	     al.forEach(x->System.out.print(x+" "));
	     
	}
}
