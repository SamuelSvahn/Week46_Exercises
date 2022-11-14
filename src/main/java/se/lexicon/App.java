package se.lexicon;

import java.util.*;


public class App {
    public static void main(String[] args) {
        ex12();

    }

    public static void ex1() {
        ArrayList<String> days = new ArrayList<String>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        System.out.println(days);
    }


    public static void ex2() {

        ArrayList<String> days = new ArrayList<String>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        for (String week : days) {
            System.out.println(week);
        }

    }

    public static void ex3() {

        ArrayList<String> days = new ArrayList<String>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        ArrayList<String> extraDay= new ArrayList<String>();
        extraDay.add("Thursday");

        days.addAll(3,extraDay);

        for(String element: days){
            System.out.println("Days: "+ element);
        }


    }

    public static void ex4() {
        ArrayList<String> days = new ArrayList<String>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        List<String> someDays = days.subList(0, 3);
        System.out.println(someDays);

    }

    public static void ex5() {

        Set<String> days = new HashSet<String>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        for (String week : days) {
            System.out.println(week);
        }


    }

    public static void ex6() {
        HashSet<String> days = new HashSet<String>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");


        List<String> strings = Arrays.asList("Monday", " Tuesday ", "Wednesday ", "Thursday ", "Friday ", "Saturday ", "Sunday");
        System.out.println(strings);


    }


    public static void ex7() {

        HashSet<String> names = new HashSet<String>();
        names.add("Samuel");
        names.add("Sanna");
        names.add("Erik");
        names.add("Farhad");

        ArrayList<String> list = new ArrayList<String>();
        list.addAll(names);
        Collections.sort(list);

        System.out.println("I am from Hashset: " + names);
        System.out.println("I am from Arraylist " + list);

    }

    public static void ex8() {

        HashSet<String> names = new HashSet<String>();
        names.add("Samuel");
        names.add("Sanna");
        names.add("Erik");
        names.add("Farhad");

        System.out.println("Original Hashset: " + names);

        TreeSet<String> treeSet = new TreeSet<String>(names);
        System.out.println("In sorted order: " + treeSet);

    }

    public static void ex9() {
        Map<Integer, String> cars = new HashMap<Integer, String>();
        cars.put(1, "Audi");
        cars.put(2, "Bmw");
        cars.put(3, "Volvo");

        for(Map.Entry entry: cars.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }

    }

    public static void ex10() {
        Map<Integer, String> cars = new HashMap<Integer, String>();
        cars.put(1, "Audi");
        cars.put(2, "Bmw");
        cars.put(3, "Volvo");

        for(Map.Entry entry: cars.entrySet()){
            System.out.println(entry.getKey());
        }


    }

    public static void ex11() {
        Map<Integer, String> cars = new HashMap<Integer, String>();
        cars.put(1, "Audi");
        cars.put(2, "Bmw");
        cars.put(3, "Volvo");

        for(Map.Entry entry: cars.entrySet()){
            System.out.println(entry.getValue());
        }

    }

    public static void ex12() {//Todo

        Map<Integer,Car> cars= new HashMap<Integer,Car>();
        cars.put(1,new Car(1,"Bmw","X6M"));
        cars.put(2,new Car(2,"Audi", "RS7"));

        for(Map.Entry entry : cars.entrySet()){
            System.out.println(entry.getValue());
        }

    }
}
