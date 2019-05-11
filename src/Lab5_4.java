public class Lab5_4 {
    public static void main(String[] args) {

        String[] stringTab ={"a", "b","c"};

        Util_show.show(stringTab);

    }
}

class Util_show{

    public static <T> void show(T[] tab){
        for (int i = 0; i <tab.length ; i++) {
            System.out.println(tab[i]);
        }
    }
}

class GenericClass<T1,T2,T3>{
    private T1 objectT1;
    private T2 objectT2;
    private T3 objectT3;

    public GenericClass(T1 objectT1, T2 objectT2, T3 objectT3) {
        this.objectT1 = objectT1;
        this.objectT2 = objectT2;
        this.objectT3 = objectT3;
    }

    public T1 getObjectT1() {
        return objectT1;
    }

    public void setObjectT1(T1 objectT1) {
        this.objectT1 = objectT1;
    }

    public T2 getObjectT2() {
        return objectT2;
    }

    public void setObjectT2(T2 objectT2) {
        this.objectT2 = objectT2;
    }

    public T3 getObjectT3() {
        return objectT3;
    }

    public void setObjectT3(T3 objectT3) {
        this.objectT3 = objectT3;
    }
}
