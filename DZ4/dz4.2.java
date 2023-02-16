import sun.security.util.ArrayUtil;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.*;
import static java.util.Collections.*;

public class masiv {
    public static void main(String[] args) {
        int[] inp = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            inp[i] = Integer.parseInt(args[i]);
        }

        asList(args);
        System.out.println("base " + Arrays.toString(args));

        sort(asList(args));
        System.out.println("asc " + Arrays.toString(args));

        reverse(asList(args));
        System.out.println("desc " + Arrays.toString(args));

        Arrays.sort(inp);
        System.out.print("Inner ");
        for (int i = inp.length - 1; i >= 0; i--) {
            if (i % 2 != 0) {
                System.out.print(inp[i] + " ");
            }
        }
        for (int a = 0; a < inp.length; a++) {
            if (a % 2 == 0) {
                System.out.print(inp[a] + " ");
            }
        }



    }
}


