public class Print1toN{
    public static void main(String[]args)
    {
        int n = 10;
        print1toN(n);
    }

    public static void print1toN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}