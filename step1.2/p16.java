public class p16 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            System.out.println(((char)(64+i) + "").repeat(i));
        }
    }
}
