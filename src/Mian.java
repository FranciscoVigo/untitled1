import java.util.Arrays;

public class Mian {

    public static void main(String[] args) {
        StringBuilder[] v1 = new StringBuilder[5];
        StringBuilder[] v2 = new StringBuilder[5];
        for (int i = 0; i < v1.length; i++) {
            v1[i] = new StringBuilder("a");
            v2[i] = new StringBuilder("a");
        }
        System.out.println(Arrays.equals(v1, v2));
        // compare the reference
        System.out.println(v1 == v2);
        // compare the reference
        System.out.println(v1[0] == v2[0]);
        // compare the content
        System.out.println(v1[0].equals(v2[0]));
        //comapre all the content
        System.out.println(Arrays.deepEquals(v1, v2));
        //COPY CONSTUCTOR
        StringBuilder[] v3 = Arrays.copyOf(v1, v1.length);
        //SHALOW COPYÇ+
        StringBuilder[] v4 = Arrays.copyOf(v1, v1.length);
        System.out.println(Arrays.equals(v3, v4));




    }

}
