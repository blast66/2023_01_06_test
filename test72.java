import java.util.Set;

public class test72 {
    public static void main(String[] args){
        int x = 10;
        double y = 10.0;
        System.out.println("x " + setV (x) );
        System.out.println("x,y " + setV(x, 3) );
        System.out.println("y " + setV (y) );

        int total = 0;
        for (String str : args) {
            total += Integer.parseInt(str);
            System.out.println("args[" + str + "]" + total);
        }
        System.out.println("toal " + total);
    }

    public static int setV (int x){
        return x = 20;
    }

    public static int setV(int x, int y ){
        return x = 40 ;
    }

    public static double setV(double x ){
        return x = 30.0 ;
    }
}   