public class IkeaStore {

    public static void main(String[] args) {

        Chair chair1 = new Chair("Adde","Ikea", 2016);
        Chair chair2 = new Chair("Janinge","Ikea", 2016);
        Chair chair3 = new Chair("Adde","Ikea", 2015);
        Chair chair4 = new Chair("Adde","Ikea", 2016);

        System.out.println("1 z 2 " + chair1.equals(chair2));
        System.out.println("1 z 3 " + chair1.equals(chair3));
        System.out.println("1 z 4 " + chair1.equals(chair4));
        System.out.println("1 z null " + chair1.equals(null));

        System.out.println(chair1.hashCode());
        System.out.println(chair2.hashCode());
        System.out.println(chair3.hashCode());
        System.out.println(chair4.hashCode());
    }
}
