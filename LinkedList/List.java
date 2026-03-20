public class List {

    public class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data =  data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data)
    {
       Node new_Node = new Node(data);
       if ( head == null)
        {
            head = tail = new_Node;
            size++;
            return;

        }

        new_Node.next = head;
        head = new_Node;
        size++;
    }

    public void addLast(int data)
    {
        Node new_Node = new Node(data);
        if (head == null)
            {
                head = tail = new_Node;
                size++;
                return;
            }
            tail.next = new_Node;
            tail = new_Node;
            size++;
    }

    public void AddINDEX(int data, int index)
    {
        if (index < 0 || index > size)
            {
                System.out.println("Not exist");
                return;
            }
        int i = 0;
         
        Node temp = head;
        Node new_Node = new Node(data);
        while(i < index - 1)
            {
                temp = temp.next;
                i++;
            }

            new_Node.next = temp.next;
            temp.next = new_Node;
            size++;         

     }

    public void print()
    {
        Node temp = head;
        while(temp != null)
            {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public int removeFirst()
        {
            int val = 0;
            if (size == 0)
                {
                    System.out.println("List does not exist");
                    return Integer.MIN_VALUE;
                }
            if (size == 1)
                {
                    val = head.data;
                    head = tail = null;
                    size--;
                }
             val = head.data;
            head = head.next;
            size--;
            return val;
        }
    

    public int removeLast()
    {
        int val = 0;
        if (size == 0)
            {
                System.out.println("List does not exist");
                return Integer.MIN_VALUE;
            }
        if (size == 1)
            {
                val = head.data;
                head = tail = null;
                size--;
            }
        Node temp = head;
        for (int i = 0; i < size - 2; i++)
            {
                temp =temp.next;
            }
         val = temp.next.data;
         tail = temp;
         temp.next = null;

        
        size--;
        return val;
    }

    public int recSearch(int data)
    {
        return Rec(head, data);
    }

    public int Rec(Node head, int data)
    {
        if (head == null)
            {
                return -1;
            }
        if (head.data == data)
            {
                return 0;
            }
        int index = Rec(head.next, data);
        if (index == -1)
            {
                return -1;
            }
            else
                {
        return index + 1;
                }
    }

    
    public static void main(String[] args) {
        size = 0;
       List ll = new List();

        ll.addFirst(53);
        ll.addFirst(43);
        ll.addFirst(23);
        ll.addFirst(73);
        ll.addFirst(53);
        ll.addLast(57);
        
        ll.addLast(56);
        ll.addLast(55);
        ll.addLast(5);
        ll.AddINDEX(3, 3);
        
        ll.print();
        System.out.println(size);
        ll.removeFirst();
        ll.removeLast();
        ll.removeLast();
        ll.addLast(3);
        ll.print();
        
        System.out.println(size);

       System.out.println(ll.recSearch(3));
        

    }
}


