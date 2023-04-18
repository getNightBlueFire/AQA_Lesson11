package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> ints = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            ints.add(r.nextInt(10,20));
        }
        Integer[] arr = new Integer[1000];
//        Collection<String> strings = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        strings.removeIf(x -> x.startsWith("AAA"));


        List<String> list = new ArrayList<>(18);




        List<String> delete = List.of("1", "2", "3", "4");

        list.add("1");
        list.add("E");
        list.add("A");
        list.add("2");
        list.add("B");
        list.add("C");
        list.add("3");
        list.add("E");
        list.add("E");
        list.add("E");
        list.add("D");



//        int i = list.indexOf("E");
        int i = list.lastIndexOf("E");
        System.out.println("index of E = " + i);
        list.remove(i);
        list.remove("E");

        list.set(i-2, "WE");
        ListIterator<String> stringListIterator = list.listIterator();
        while (stringListIterator.hasNext()){
            String next = stringListIterator.next();
            System.out.println(next);
        }

//        for (String s: list){
//                System.out.println(s);
//        }

//        list.removeAll(delete);
//        list.retainAll(delete);
//        list.forEach(System.out::println);


        LinkedList<Test> testLinkedList = new LinkedList<>();
        testLinkedList.add(new Test(2));
        testLinkedList.add(new Test(4));
        testLinkedList.add(new Test(6));
        testLinkedList.add(new Test(1));
        testLinkedList.add(new Test(5));
        testLinkedList.add(new Test(6));
        testLinkedList.add(new Test(1));

        System.out.println(testLinkedList.get(4));


        Deque<String> strings1 = new ArrayDeque<>();


    }


    public static void main1(String s) {
        Arrays.stream(s.split(" ")).toList().sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
    }
}