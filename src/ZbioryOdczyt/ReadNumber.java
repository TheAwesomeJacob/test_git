package ZbioryOdczyt;
import java.io.*;
import java.util.Comparator;
import java.util.TreeSet;
public class ReadNumber{
    public static void main (String[] args){
        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return -s.compareTo(t1);
            }
        });
        try (var reader = new BufferedReader(new FileReader("namespl.txt"))){
            String nextLine = null;
            while((nextLine = reader.readLine())!= null){
                treeSet.add(nextLine);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(treeSet.size());
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
    }

}
