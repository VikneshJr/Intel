import java.util.Arrays;

public class Demo {


    public static void main (String[]args)
    {

        int [] a = {96,76,45,100,29,30};

        int max = a[0];

        System.out.println(a.length);

        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max = a[i];

            }

        }
        System.out.println(max);



    }





}
