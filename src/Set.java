import java.util.HashSet;
import java.util.Iterator;

public class Set {

    public static void main(String[]args)
    {

        int a [] = {1,2,2,3,3,4,5};
        int b = a.length;

        HashSet<Integer> set = new HashSet<>();

        for(int i =0;i<b;i++)
        {
            set.add(a[i]);
        }

        Iterator it =set.iterator();

        while(it.hasNext()) {

            System.out.println(it.next());
        }

    }

}
