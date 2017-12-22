package oop_lab5;

import java.util.ArrayList;

public class myArrayList {
    public static void main(String [] args){
    //ArrayList
        ArrayList list = new ArrayList();
        String name = "Rin";
        list.add(name);
        System.out.println(list);
        list.add("Bew");
        list.add("Tik");
        System.out.println(list);
        list.add(2,"ADAM");
        System.out.println(list);
        list.add(1);
        System.out.println(list);
        list.add(10.10);
        System.out.println(list);
        list.remove("Tik");
        System.out.println(list);
    }
}