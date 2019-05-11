import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTester {

    public static void main(String[] args) {
        /*Set<String> set = new HashSet<>();
        set.add("Jan");
        set.add("Stefan");
        set.add("Julian");
        set.add("Julian");

        set.remove("Stefan");

        System.out.println(set.size());

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name + " " + name.hashCode());


        }

        String a="Ala", b="Ala";

        System.out.println(a.equals(b));
        System.out.println(a.hashCode() + " " + b.hashCode());*/

    Set<A> set = new HashSet<>();

        for (int i = 0; i < 100 ; i++) {
            set.add(new A(1,"aaa"));
        }
        System.out.println(set.size());
    }
}
