package Repository;

import Iterator.IteratorContainer;
import Iterator.IteratorInterface;

import java.util.ArrayList;

public class NameRepository implements IteratorContainer {

    /*USE FOR ADDING NAME TO THE ARRAY LIST*/
    public ArrayList<String> names = new ArrayList<>();
    public void addName(String name){
        names.add(name);
    }

    @Override
    public IteratorInterface getLeft2RightOrder() {
        return new Left2Right();
    }

    @Override
    public IteratorInterface getRight2LeftOrder() {
        return new Right2Left();
    }

    @Override
    public IteratorInterface getAlphabetOrder() {
        return new AlphabetOrder();
    }

    private class Left2Right implements IteratorInterface{
        int i = 0;
        @Override
        public boolean hasNext() {
            if (i < names.size()) {
                return true;
            }
            return false;
        }
        @Override
        public Object next() {

            if (this.hasNext()) {
                return names.get(i++);
            }
            return null;
        }
    }

    private class Right2Left implements IteratorInterface{
        int i = names.size() -1;
        @Override
        public boolean hasNext() {
            if(i>=0 ){
               return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names.get(i--);
            }
            return null;
        }
    }

    private class AlphabetOrder implements IteratorInterface{
        int i = 0;
        String temp = null;
        @Override
        public boolean hasNext() {
            if (i >= 0 && i < names.size()) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                for(int j = i + 1; j < names.size(); j++){
                    if(names.get(i).compareToIgnoreCase(names.get(j)) > 0){
                        temp = names.get(i);
                        names.set(i, names.get(j));
                        names.set(j,temp);
                    }
                }
                return names.get(i++);
            }
            return null;
        }
    }
}
