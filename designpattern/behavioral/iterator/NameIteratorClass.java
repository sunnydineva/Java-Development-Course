package designpattern.behavioral.iterator;

import java.util.List;

public class NameIteratorClass implements ContainerInterface {

    public List<Object> list;

    public NameIteratorClass(List<Object> list) {
        this.list = list;
    }

    @Override
    public IteratorInterface getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements IteratorInterface{
        int index;

        @Override
        public boolean hasNext() {
            return index < list.size();
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return list.get(index ++);
            }
            return null;
        }
    }


}
