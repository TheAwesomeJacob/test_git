package Zbiorki;

import java.util.HashSet;

public class SetTaska {

    static HashSet<Object> hashSet = new HashSet<>();

    public static void main(String[] args){
        hashSet.add(new Person("Jan", "Kowalski"));
        hashSet.add(new Person("Karol", "Saski"));
        hashSet.add(new Person("Wojciech", "Muskal"));
        hashSet.add(new Person("Sławomir", "Loczek"));
        printList(hashSet);
        strangeSet();
        System.out.println(" ");
        printList(hashSet);

    }

    public static void printList(HashSet<Object> hashSet){
        for (Object s:hashSet) {
            System.out.println(s);
        }
    }
    public static void strangeSet(){
        hashSet.add(2);
        hashSet.add(5);
        hashSet.add("Adamowicz");
        hashSet.add("Elżebieta");

    }
}
