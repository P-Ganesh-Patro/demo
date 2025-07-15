package List;

import javax.swing.*;
import java.util.*;

public class ArrayListDemo{
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ArrayList<Integer> arrayList = new ArrayList<>(1000);
        arrayList.add(10);
        arrayList.add(1, 23);
        arrayList.set(1, 20);

//        Field field = ArrayList.class.getDeclaredField("elementData");
//        field.setAccessible(true);
//        Object[] sizeOfArray = (Object[]) field.get(arrayList);
//        System.out.println(sizeOfArray.length);

        List<String> list = Arrays.asList("india", "london", "USA");
//        System.out.println(list.getClass().getName());
        String[] arrays = {"delhi", "punjab", "haryana"};
        List<String> list1 = Arrays.asList(arrays);
//        list1.set(2, "AP");
//        System.out.println(list.get(2));

        List<String> list2 = List.of("sai kiran", "mani");
//        list2.set(1, "ganesh");
//        System.out.println(list.get(1));
//        List<String> list3 = new ArrayList<>(list1);
//        list.add("lokesh");
//        System.out.println(list3);

        List<Integer> al = new LinkedList<>();
        al.add(15);
        al.add(12);
        al.add(14);
        al.add(13);
        al.add(14);
//        System.out.println(al);
//
//        List<String> vector = new Vector<>();
//        vector.add("india");
//        vector.add("USA");
//        vector.add("Russia");
//        vector.set(2, "nepal");
//        System.out.println(vector);


//        Stack<String> stack = new Stack<>();
//        stack.push("harish");
//        stack.push("raja");
//        System.out.println(stack);
//        stack.remove(1);
//        System.out.println(stack);
//        stack.pop();
//        stack.add("2345");
//        System.out.println(stack);

//        System.out.println(stack.peek())

//        LinkedList<String> ll = new LinkedList<>();
//        ll.add("harish");
//        ll.add("ganesh");
//        ll.addFirst("sai");
//        ll.addLast("ravi");
//        System.out.println(ll);

        /*
        Vector<Integer> vector = new Vector<>();
        vector.add(123);
        vector.add(2348578);
        vector.add(875);
        vector.clear();

        vector.add(34);
        for (int i : vector) {
            System.out.print(i + " ");
        }
        vector.addElement(1);
        vector.setElementAt(2, 1);
        vector.add(2, 23);
        for (int i : vector) {
            System.out.print(i + " ");
        }
        System.out.println("Capacity:- " + vector.capacity());
        System.out.println(vector.elementAt(2));
        System.out.println(vector.get(2));
        System.out.println(vector.isEmpty());
        vector.clear();
        System.out.println(vector.isEmpty());
          */

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(23);
        stack.add(2, 3);
        System.out.println(stack);
        System.out.println(stack.elementAt(2));
        System.out.println(stack.peek());


    }
}
