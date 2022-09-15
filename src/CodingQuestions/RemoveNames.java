package CodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveNames {

    /*
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
     */

    public static List<String> removeName(List<String>names,String name) {

//
//        Iterator<String> allNames = names.iterator();
//        while (allNames.hasNext()) {
//            if (allNames.next().equals(name)) {
//                allNames.remove();
//            }
//        }
//        return names;
//    }
         names.removeIf(n->n.equals(name));
         return names;
    }

    public static void main(String[] args) {
        System.out.println(removeName(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"), "Ahmed"));

    }
}
