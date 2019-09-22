package HomewrokSep.Sep20;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListExercise {
    public static void main(String[] args) {
        ArrayList colors = new ArrayList<String>();
        ArrayListUtils.arrayListColors();
        System.out.println();
        ArrayListUtils.nameList();
        ArrayListUtils.arrayAddElement(2, "purple");
        ArrayListUtils.returnAddElement(4);
        ArrayListUtils.setElement(2, "purple");
        ArrayListUtils.removeElement(3);
        ArrayListUtils.getElement(3);
        ArrayListUtils.findElement("blue");
        colors = ArrayListUtils.copyArrayList();System.out.println(colors);
        colors=ArrayListUtils.reverseArrayList(); System.out.println(colors);
        ArrayListUtils.extractElement(1,4);
        ArrayListUtils.swapElement("blue","orange");
        ArrayListUtils.mergeElement();
        ArrayListUtils.clearArrayList();
        ArrayListUtils.checkArrayList();
        ArrayListUtils.setElement("purple");
    }
}
