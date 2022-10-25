// List iterator backword traversal  

import java.util.*;
class Main{
    public static void main (String[] args) {
        
        List<Integer> l = new ArrayList<Integer> ();
        
        l.add(13);
        l.add(23);
        l.add(34);
        
        ListIterator<Integer> it = l.listIterator(l.size());
        while(it.hasPrevious()){
            System.out.print(it.previous()+ " ");
        }
    }
}
