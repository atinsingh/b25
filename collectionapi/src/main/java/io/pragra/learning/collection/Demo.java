package io.pragra.learning.collection;

import java.util.*;
import java.util.function.Consumer;


public class Demo {
    public static void main(String[] args) {
        List<String> listOfStudent = new LinkedList<>();
        System.out.println(listOfStudent);
        listOfStudent.add("Jegan");
        listOfStudent.add("Somya");
        listOfStudent.add("Kiran");

        System.out.println(listOfStudent);

        List<String> vips = new ArrayList<String>();
        vips.add("Vivek");
        vips.add("Ajay");
        vips.add("James");

        vips.add("Ajay");



        listOfStudent.addAll(0, vips);

        if (listOfStudent.contains("Vivek") ) {
            System.out.println("Found vivek in collection");
        }
        System.out.println(listOfStudent);
        //System.out.println(listOfStudent.get(2));
        System.out.println(listOfStudent.remove(2));
        listOfStudent.add("Ajay");
        System.out.println(listOfStudent);
        System.out.println( listOfStudent.lastIndexOf("Ajay") );

        //listOfStudent.removeAll(vips);
        //listOfStudent.remove("Ajay");
        listOfStudent.retainAll(vips);
        System.out.println(listOfStudent);
        listOfStudent.set(1,"Atin");
        System.out.println("****************************");
        System.out.println(listOfStudent);
        System.out.println("****************************");
        // (s1,s2)-> s1.compareTo(s2);
        //
        // listOfStudent.sort(String::compareTo);
        //void accept(T var1);
        // System.out.println
//        listOfStudent.forEach((e)->System.out.println(e));
//
//        List<String> names = Arrays.asList("Jegan", "Karthik","Manpreet","Atin","Mike");
//        //int compare(T var1, T var2);
//        System.out.println(names);
//      //  names.sort();
//        System.out.println(names);

//        Iterator<String>  iterator =  listOfStudent.iterator();
//        System.out.println("##########ITERATOR");
//         while ( iterator.hasNext() ){
//            //String st =   iterator.next();
//             System.out.println("In the itetor");
//
//         }

        for(String st: listOfStudent) {
//            System.out.println(st);
//            if( st.equals("Vivek") ) {
//                listOfStudent.remove(st);
//            }
        }

        System.out.println("##########ITERATOR");

        System.out.println(listOfStudent);

        Queue<String> queue = new ArrayDeque<>();
        queue.add("James");
        queue.offer("Mike");
        queue.offer("Kiran");
        queue.offer("Ajay");
        queue.add("Atin");

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        // Never used


        System.out.println(queue);


        Student student = new Student("Atin","Java", new Date());

        // Date/LocalDate/LocalTime/Instant -- Java 8


    }

}
