import java.util.*;

public class UserCollector {


    public static void main(String[] args) {

        Map<Integer,User> map = new HashMap<>();

        map.put(1,new User("Ala", "As", 12));
        map.put(2,new User("Basia", "Bąk", 2));
        map.put(3,new User("Czarek", "Cee", 23));
        showAll(map);
        System.out.println("-_____-");
        showId(map,3);

    }

   static void showAll(Map<Integer,User> map){
        Set<Integer> keys = map.keySet();
        for (Integer k : keys
             ) {
            System.out.println(map.get(k));
        }
    }

    static void showId(Map<Integer,User> map, Integer i){
        Set<Integer> keys = map.keySet();
        for (Integer k : keys
             ) {
            if(k.equals(i)){
                System.out.println(map.get(i));
            }
        }

    }
}

class User{
    private String firstName;
    private String lastName;
    private int age;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}