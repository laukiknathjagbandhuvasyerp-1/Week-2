import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamapi {
public static void main(String[] args) {
    // Collection<String> str=Arrays.asList("fjg"); 
    // Stream<String> s1=str.stream();
    // s1.forEach(System.out::println);

    // List<String> str2=Arrays.asList("fhbjn");
    // Stream<String> s2=str2.stream();
    // s2.forEach(System.out::println);

    //Collection<Integer> c1=Arrays.asList(5,6,7,8,9,2);
    // int a=5;
    // int b=67;
    // Stream<Integer> st =Stream.of(1,2,3,45,6,7,4,333,6,78)
    // .filter(y->y%2==1);
    // System.out.println(st.collect(Collectors.toList()));

    int max=90;
    int min=40;
    // Stream<Integer> st2=Stream.of(55,67,44,35,90,78,22,56,87,89,43,21).filter(i->i>=min&& i<= max).sorted().distinct();

    List<Integer> list= Arrays.asList(2,4,5,6,7,8,9,11,909);
    list.stream().distinct().peek(System.out::println).forEach(x->{});

//    System.out.println(st2.collect(Collectors.toList()));


   // List<List<String>> list = Arrays.asList(Arrays.asList("Z","O"),Arrays.asList("m","D"),Arrays.asList("h","f"));

    // List<List<Integer>> lst = Arrays.asList(Arrays.asList(55,67,3,22,21),Arrays.asList(98,7,76,456,98),Arrays.asList(6,7,8,454));

    //Set<String> res=new HashSet<>();

    //List<String> ress=list.stream().flatMap(List::stream).map(String::toLowerCase).distinct().sorted().collect(Collectors.toList());

        // List<Integer> ress1=lst.stream().flatMap(List::stream).filter(n->n>= a && n <=b).sorted().distinct().collect(Collectors.toList());


    //System.out.println("Result");
   // res.forEach(System.out::println);

    //ress1.forEach(System.out::println);


}    

}
