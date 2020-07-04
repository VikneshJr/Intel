import java.lang.reflect.Array;
import java.util.*;

public class Duplicates {


    public static void main (String[]args)
    {

        int a [] = {1,2,2,3,3,4,5};

        int b = a.length;

        int temp []= new int[a.length-1];

        int j = 0;
        System.out.println(b);

        for(int i =0;i<b-1;i++)
        {
            if (a[i]!=a[i+1])
            {
                   temp [j] = a[i];
                   j++ ;

            }


        }

        temp[j] = a[b-1];

        for(int k =0;k<j;k++)
        {
            System.out.println(temp[k]);
        }





        /*HashSet<Integer> set = new HashSet<>();

        for(int i =0;i<b;i++)
        {
            set.add(a[i]);
        }

       Iterator it =set.iterator();

        while(it.hasNext()) {

            System.out.println(it.next());
        }*/

    }
}
