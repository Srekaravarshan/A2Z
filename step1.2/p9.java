public class p9 {
    public static void main(String[] args) {
        int n = 5;
        String s = "*";
        String sp = "";

        for (int i = 0; i < n-1; i++) {
            sp+=" ";
        }

        for (int i = 0; i < n; i++) {
            System.out.println(sp + s);
            s+="**";
            if (sp.length()>0)
            sp = sp.substring(0, sp.length()-1);
        }

        for (int i = 0; i < n; i++) {
            s=s.substring(0, s.length()-2);
            System.out.println(sp + s);
            sp+=" ";
        }

    }
}
