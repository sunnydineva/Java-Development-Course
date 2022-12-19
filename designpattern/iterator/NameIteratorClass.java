package designpattern.iterator;

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
            if(index < list.size()){
            }
            return false;
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
