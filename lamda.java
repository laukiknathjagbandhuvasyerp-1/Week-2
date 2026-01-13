// interface lmda {
//  int sub (int a,int b);

// }

// public class lamda {
//     public static void main(String[] args) {
//         lmda l =(a,b)->a-b;
//         System.out.println(l.sub(9,3));
//     }
// }

interface Innerlamda {
    public int add(int a, int b);
    
}

public class lamda {
    public static void main(String[] args) {
        Innerlamda l1=(a,b)->a+b;
        System.out.println(l1.add(5,7));
    }
    
}

// import java.util.ArrayList;
// public class lamda {
// public static void main(String[] args) {
//     ArrayList<Integer> a1= new ArrayList<Integer>();
//     a1.add(5);
//     a1.add(7);
//     a1.add(9);
//     a1.forEach((n)->{System.out.println(n);});
//     }
// }

// interface st{
//     String run(String str);
// }
// public class lamda {
//     public static void main(String[] args) {
//         st s1=(s)->s+"!";
//         st s2=(s)->s+"?";
//         st s3=(j)->j+" :)";
//         System.out.println(s1.run("Kya"));
//         System.out.println(s2.run("Kya"));
//         System.out.println(s3.run("life"));
//     }
    
// }
