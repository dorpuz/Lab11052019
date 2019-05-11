import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericTest {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");

        //String s = list.getClass(0);

       /* List<Point> list1 = new ArrayList<>();
        list.add(new Point(4,5));

        Point point= list1.get(0);

        Box<String> box = new Box();
        box.setObject("siedem");

        String s = box.getObject();

        Box<Person> personBox = new Box<>();
        personBox.setObject(new Person(3,"Ala",24));

        Person ala = personBox.getObject();

        Pair<String,Integer> pair1 = new OrderedPair<>("Ala", 24);
        Pair<String,String> pair2 = new OrderedPair<>("Ala", "24");

        Pair<String, Box<Integer>> pair3 = new OrderedPair<>("Ola",new Box<>());*/

        Pair<Integer,String> p1 = new OrderedPair<>(1,"one");
        Pair<Integer,String> p2 = new OrderedPair<>(2,"two");

        boolean same = Util.compare(p1,p2);
        System.out.println(same);

        List<String> stringList = new ArrayList<>();
        stringList.add("AA");
        stringList.add("Echo");
        stringList.add("AA");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);

        List<A> aList = new LinkedList<>();
        aList.add(new A(3,"czy"));
        aList.add(new A(4,"czy4"));
        aList.add(new A(5,"czy5"));
        aList.add(new A(76,"czy76"));

        printList(stringList);
        printList(integerList);
        printList(aList);

    }

    public static void printList(List<?> list) { //wildcard - unknown type
        for (Object e : list){
            System.out.println(e + " ");
        }
        System.out.println();
    }
}


class Box<T>{
    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}

interface Pair<K,V>{
    K getKey();
    V getValue();
}

class OrderedPair<K,V> implements Pair{

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }


    @Override
    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

class Util{

    public static <K,V> boolean compare(Pair<K,V> pair1,Pair<K,V> pair2){
        return pair1.getKey().equals(pair2.getKey())
                && pair1.getValue().equals(pair2.getValue());
    }

}