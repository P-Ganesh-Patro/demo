package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashsetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("john");
        set.add("pranva");
        set.add("bunny");
        set.add("saikiran");
        set.add("harish");
        set.add("ricky");
        set.add(null);
        set.add(null);
        System.out.println(set);
        // for(String s : set){
        //     System.out.println(s);
        // }

        ArrayList<String> al = new ArrayList<>(set);
        System.out.println(al.get(2));

    }

}
