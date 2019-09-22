package HomewrokSep.Sep20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListUtils {
    public static void nameList() {
        System.out.println("==============================================================");
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("Adam");
        nameList.add("John");
        nameList.add("Nancy");
        nameList.add("Peter");
        nameList.add("Mary");
        Iterator i = nameList.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }


    public static void arrayListColors() {
        System.out.println("==============================================================");
        ArrayList<String> colors = new ArrayList<String>();
        System.out.println("The ArrayList elements are:");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.add("pink");
        colors.add("orange");
        System.out.println(colors);
    }

    public static void arrayAddElement(int index, String input) {
        System.out.println("==============================================================");
        ArrayList<String> colors = new ArrayList<String>();
        System.out.println("The ArrayList elements are:");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.add("pink");
        colors.add("orange");
        colors.add(index, input);
        System.out.println(colors);
    }

    public static void returnAddElement(int index) {
        System.out.println("==============================================================");
        ArrayList<String> colors = new ArrayList<String>();
        System.out.println("The ArrayList elements are:");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.add("pink");
        colors.add("orange");
        System.out.println(colors);
        System.out.println(colors.get(index));
    }

    public static void setElement(int index, String input) {
        System.out.println("==============================================================");
        ArrayList<String> colors = new ArrayList<String>();
        System.out.println("The ArrayList elements are:");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.add("pink");
        colors.add("orange");
        System.out.println(colors);
        colors.set(index, input);
        System.out.println(colors);
    }

    public static void removeElement(int index) {
        System.out.println("==============================================================");
        ArrayList<String> colors = new ArrayList<String>();
        System.out.println("The ArrayList elements are:");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.add("pink");
        colors.add("orange");
        System.out.println(colors);
        colors.remove(index - 1);
        System.out.println(colors);
    }

    public static void getElement(int index) {
        System.out.println("==============================================================");
        ArrayList<String> colors = new ArrayList<String>();
        System.out.println("The ArrayList elements are:");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.add("pink");
        colors.add("orange");
        System.out.println(colors);
        System.out.println(colors.get(index - 1));
    }

    public static void findElement(String element) {
        System.out.println("==============================================================");
        ArrayList<String> colors = new ArrayList<String>();
        System.out.println("The ArrayList elements are:");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.add("pink");
        colors.add("orange");
        System.out.println(colors);
        System.out.println(colors.lastIndexOf(element));
    }

    public static ArrayList copyArrayList() {
        System.out.println("==============================================================");
        ArrayList<String> colors = new ArrayList<String>();
        System.out.println("The ArrayList elements are:");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.add("pink");
        colors.add("orange");
        System.out.println(colors);
        return colors;
    }

    public static ArrayList reverseArrayList() {
        System.out.println("==============================================================");
        ArrayList<String> colors = new ArrayList<String>();
        System.out.println("The ArrayList elements are:");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.add("pink");
        colors.add("orange");
        System.out.println(colors);
        Collections.reverse(colors);
        return colors;
    }

    public static void extractElement(int start, int finish) {
        System.out.println("==============================================================");
        ArrayList<String> colors = new ArrayList<String>();
        System.out.println("The ArrayList elements are:");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.add("pink");
        colors.add("orange");
        System.out.println(colors);
        System.out.println(colors.subList(start, finish));
    }

    public static void swapElement(String first, String second) {
        System.out.println("==============================================================");
        ArrayList<String> colors = new ArrayList<String>();
        System.out.println("The ArrayList elements are:");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.add("pink");
        colors.add("orange");
        System.out.println(colors);
        Collections.swap(colors,colors.lastIndexOf(first),colors.lastIndexOf(second));
        System.out.println(colors);

    }

    public static void mergeElement() {
        System.out.println("==============================================================");
        ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "f"));

        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));

        listOne.addAll(listTwo);    //Merge both lists

        System.out.println(listOne);
    }

    public static void clearArrayList() {
        System.out.println("==============================================================");
        ArrayList<String> colors = new ArrayList<String>();
        System.out.println("The ArrayList elements are:");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.add("pink");
        colors.add("orange");
        System.out.println(colors);
        colors.clear();
    }

    public static void checkArrayList() {
        System.out.println("==============================================================");
        ArrayList<String> colors = new ArrayList<String>();
        System.out.println("The ArrayList elements are:");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.add("pink");
        colors.add("orange");
        System.out.println(colors);
        System.out.println( colors.isEmpty());
        colors.clear();
        System.out.println(colors);
        System.out.println( colors.isEmpty());
    }

    public static void setElement(String input) {
        System.out.println("==============================================================");
        ArrayList<String> colors = new ArrayList<String>();
        int index=1;
        System.out.println("The ArrayList elements are:");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.add("pink");
        colors.add("orange");
        System.out.println(colors);
        colors.set(index, input);
        System.out.println(colors);
    }
}