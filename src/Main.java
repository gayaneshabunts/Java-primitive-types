public class Main {
    public static void main(String[] args) {
        // {type} varName=value
        int a;
        a = 5;
        int b;
        b = 8;
        int c;
        c = (a * a + b * b);
        System.out.println("c=" + c);
        // mas 2
        c = 6;

        int S;
        S = (((a + b) / 2) * c);
        System.out.println("S=" + S);
        //mas 3
        int d = 123;
        System.out.println(d / 100);
        System.out.println((d / 10) % 10);
        System.out.println(d % 10);

    }
}
