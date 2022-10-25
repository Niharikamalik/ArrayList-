import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	    ArrayList<Integer> al =new ArrayList<Integer>();
	    al.add(12);
	    al.add(24);
	    al.add(54);
	    al.add(2,25);
	    System.out.println(al+" ");
	    System.out.println(al.contains(24));
	    al.remove(2);
	    System.out.println(al);
	    System.out.println(al.get(2));
	    al.set(1,56);
	    System.out.println(al);
	    System.out.println(al.indexOf(4));
	    System.out.println(al.lastIndexOf(54));
	    System.out.println(al.isEmpty());
	    al.clear();
	    System.out.println(al.isEmpty());	
	}
}
