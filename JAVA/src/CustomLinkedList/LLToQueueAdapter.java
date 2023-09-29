package CustomLinkedList;
import java.util.LinkedList;

public class LLToQueueAdapter {
    LinkedList<Integer> list ;

    public LLToQueueAdapter(){
      list = new LinkedList<>();
    }


    int size(){
        return list.size();
    }

    void add(int val){
     list.addLast(val);
    }

    int remove(){
        if(size() == 0){
            System.out.println("Queue is underFlow");
            return -1;
        }
      else{
        return list.removeFirst();
      }
    }

    int peek(){
      if(size() == 0){
            System.out.println("Queue is underFlow");
            return -1;
        }
      else{
        return list.getFirst();
      }
    }


}
