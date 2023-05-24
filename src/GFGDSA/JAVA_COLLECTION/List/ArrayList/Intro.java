package GFGDSA.JAVA_COLLECTION.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Intro {

    public static void main(String[] args)
    {
        System.out.println("Hi Array List");

        ArrayList<String> student = new ArrayList<String>();
        // List<String> list = new ArrayList<String>();
        // List<String> stu = new LinkedList<String>();
        // List<String> stacklist = new Stack<String>();
        // Stack<String> stack = new Stack<>();
        student.add("Reetesh");
        student.add("meena");
        student.isEmpty();
        
        Integer[] initialElements = {1, 22, 3, 4, 5};
        List<Integer> initialList = Arrays.asList(initialElements);
        // ArrayList<Integer> arrayList = new ArrayList<>(initialList);
        Collections.sort(initialList);
        System.out.println(initialList.size());

        System.out.println(student.isEmpty());
        
    }
}
