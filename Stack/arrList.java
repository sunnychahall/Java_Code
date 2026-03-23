import java.util.*;
public class arrList{
    static public class Stack
    {
        ArrayList<Integer> list = new ArrayList<>();

        //empty
        public boolean isEmpty()
        {
            return list.size() == 0;
        }

        //push

        public void push(int data)
        {
            list.add(data);
            return;
        }

        //pop
        public int pop()
        {
            if (isEmpty()){
                return -1;
            }
            int val = list.get(list.size() - 1);
            list.remove(list.size() - 1);

            return val;
        }


        //peek
        public int peek()
        {
            if (isEmpty()){
                return -1;
            }
            return list.get(list.size() - 1);
           
        }
    }

public static void main(String[] args) {
    Stack s = new Stack();

    s.push(1);
    s.push(2);

    while (!s.isEmpty())
        {
            System.out.println(s.pop());
        }
    

}
}

