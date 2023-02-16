import com.sun.org.apache.bcel.internal.classfile.InnerClass;
import com.sun.xml.internal.bind.v2.model.util.ArrayInfoUtil;
import sun.security.util.ArrayUtil;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Arrays.asList(args);
        System.out.println("base "+Arrays.toString(args));

        Collections.sort(Arrays.asList(args));
        System.out.println("asc "+Arrays.toString(args));

        Collections.reverse(Arrays.asList(args));
        System.out.println("desc "+Arrays.toString(args));
        
        int a = Integer.parseInt(args[0]);
        int a1 = Integer.parseInt(args[1]);
        int a2 = Integer.parseInt(args[2]);
        int a3 = Integer.parseInt(args[3]);
        int a4 = Integer.parseInt(args[4]);
        int a5 = Integer.parseInt(args[5]);
        Integer ar[] = new Integer[]{a3,a4,a5};
        Collections.sort(Arrays.asList(ar));
        Integer arr []= new Integer[]{a, a1, a2};
        Collections.sort(Arrays.asList(arr));
        Collections.reverse(Arrays.asList(arr));
        System.out.println("Inner "+Arrays.toString(arr)+Arrays.toString(ar));


    }
    }

