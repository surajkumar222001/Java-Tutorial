package CustomLinkedList;
import java.util.LinkedList;

public class LLToStackAdapter {
    LinkedList<Integer> list;
    

    public LLToStackAdapter(){
        list = new LinkedList<>();
    }

    int size(){
        return list.size();
    }

    void push(int val){
        list.addFirst(val);
    }

    int pop(){
      return list.removeFirst();
    }

    int top(){
     return list.getFirst();
    }
}
