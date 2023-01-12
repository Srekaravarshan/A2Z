public class p18 {
    public static void main(String[] args) {
        String s = "";
        int n = 5;

        for (int i = n-1; i >= 0; i--) {
            s = (char)(65+i) + s;
            System.out.println(s);
        }
    }
}
