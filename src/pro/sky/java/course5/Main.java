package pro.sky.java.course5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Maria");
        names.add("Anna");
        names.add("Oleg");
        names.add("Kirill");
        System.out.println(names);

        int i;
        for (i = 0; i < names.size(); i++) {
            String currentName = names.get(i).substring(1);
            names.set(i, currentName);
        }
        Collections.sort(names);
        System.out.println(names);
    }
}
