package Model;

import java.util.Iterator;
import java.util.List;

public class PersonsIterator<T> implements Iterator<T> {
    private int counter;
    private final List<T> persons;
    

    public  PersonsIterator(List<T> persons) {
        this.persons = persons;
    } 

    @Override
    public boolean hasNext() {
        return counter<persons.size();
    }

    @Override
    public T next() {
        if(!hasNext())
        {
            return null;
        }
        return persons.get(counter++);
    }

    public T getCurrent() {
        if(counter <= 0){
             throw new IllegalStateException("Next method should be called before getCurrent");
        }
        return persons.get(counter-1);
     }
    
     public void ResetIterator(){
        counter = 0;
     }
    
}