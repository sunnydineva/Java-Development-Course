package designpattern.behavioral.iterator;

import java.util.Arrays;
import java.util.List;

public class MainIterator {

    public static void main(String[] args) {
        List<Object> names = Arrays.asList("Ivan", "Petyr", "Geri", "Mery");
        NameIteratorClass nameIterator = new NameIteratorClass(names);
        IteratorInterface iterator = nameIterator.getIterator();

        while(iterator.hasNext()){
            Object element = iterator.next();
            System.out.println(element);
        }
    }
}
