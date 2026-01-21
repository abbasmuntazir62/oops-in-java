
import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {
    public static void main(String []args){
        ArrayList<Integer> List = new ArrayList<Integer>();
        //Add
        List.add(0);
        List.add(1);
        List.add(2);
        System.out.println(List);
        
        //get element
        int element = List.get(0);
        System.out.println(element);

        //add element
        List.add(1);
        System.out.println(List);

        //delete
        List.remove (3);
        System.out.println(List);

        //size
        int size = List.size();
        System.out.println(size);

        //loops
        for(int i = 0;i<List.size();i++){
            System.out.println(List.get(i));

            //sorting
            Collections.sort(List);
            System.out.println(List);

        }
    }
}
