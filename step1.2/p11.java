public class p11 {
    public static void main(String[] args) {
        int n = 5;
        String s = "";
        boolean b = true;

        for (int i = 0; i < n; i++) {
            if (b) s = 1+s;
            else s=0+s;
            System.out.println(s);
            b = !b;
        }
    }
}
