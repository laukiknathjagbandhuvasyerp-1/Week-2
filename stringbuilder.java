public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder();
        str.append("ok");

        String s = str.toString();
        StringBuffer s1=new StringBuffer(s);

        System.out.println(s1);


    }
}
