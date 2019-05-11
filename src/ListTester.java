import java.util.*;

public class ListTester {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(234);
        list.add(23);

        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.remove(0));
        System.out.println(list);
        System.out.println(list.size());
        list.clear();

        list = Arrays.asList(4,53,645,43,3,6,22,879);
        System.out.println(list.get(0));
        System.out.println(list.size());

        System.out.println("----------------");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Integer i : list
             ) {
            System.out.println(i);
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        List<Integer> anotherList = new LinkedList<>(Arrays.asList(335,54,3,43,24));
        Iterator<Integer> iteratorRemove = anotherList.listIterator();
        while (iteratorRemove.hasNext()){
           if (iteratorRemove.next()==3){
                iteratorRemove.remove();
            }
        }

        System.out.println(anotherList);
        System.out.println("-_________________-");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2==0){
                System.out.println(list.get(i));
            }
        }

        List<String>linkedList = new LinkedList();
        linkedList.add("Uno");
        linkedList.add("dos");
        linkedList.add("tres");
        linkedList.add("quatro");
        linkedList.add("quatro");
        linkedList.add("quatro");

        System.out.println(linkedList);

        linkedList.add(0,"zero");
        ((LinkedList<String>) linkedList).remove("dos");

        System.out.println(linkedList);

        System.out.println(Collections.frequency(linkedList,"quatro"));

    }
}
