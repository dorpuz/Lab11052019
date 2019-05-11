import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab5_3 {

    public static void main(String[] args) {

        long startTimeArray = System.currentTimeMillis();

//        List<Person> personList = new ArrayList<>();
        List<Person> personList = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            personList.add(0, new Person(i,"XYZ", 24));
        }

        long createTimeArray = System.currentTimeMillis();

        System.out.println(personList.size());

        int total = personList.size()/2;
        for (int i = 0; i <total ; i++) {
            personList.remove(personList.size()-1);
            personList.remove(0);
        }
        System.out.println(personList.size());

        long stopTime = System.currentTimeMillis();
        System.out.println("Czas wykonania całości:");
        System.out.println(stopTime-startTimeArray);
        System.out.println("Czas tworzenia:");
        System.out.println(createTimeArray-startTimeArray);
        System.out.println("Czas usuwania");
        System.out.println(stopTime-createTimeArray);
    }
}
