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
     


    public int search(int data)
    {
        Node h = head;
        int i = 0;
        while (h != null)
            {
                if (h.data == data)
                    {
                        return i;
                    }
                    i++;
                    h = h.next;
            }
        return - 1;
    }

    public Node Rev(Node h)
    {
         Node next;
         Node prev = null;
         Node curr = h;
         while (curr != null)
            {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            return prev;
    }


    public boolean isPalindrome(Node h)
    {
        if (h == null || h.next == null)
            {
                return true;
            } 
        //mid
        Node Mid = findMid();

        //reverse from mid

       Node temp =  Rev(Mid);

        //compare
        Node right = temp;
        Node left = h; 
        while (right != null)
            {
                if (right.data != left.data)
                    {
                        return false;
                    }
                    right = right.next;
                    left = left.next;
            }

        return true;
    }


    public Node findMid()
    {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null)
            {
                slow = slow.next; //+1
                fast = fast.next.next; // + 2
            }

        return slow;
    }

    public void RfromLast(int n)
    {
        int size = 0;
        Node temp = head;
        while (temp != null)
            {
                temp = temp.next;
                size++;
            }
        
        if (n == size)  //remove first
        {
            head = head.next;
            return;
        }

        int i;
        int Indx = size - n;
        Node prev = head;
        for (i = 1; i < Indx; i++)
            {
                prev = prev.next;
            }

            prev.next = prev.next.next;
            return;
    } 
    
    public static void main(String[] args) {
        size = 0;
       List ll = new List();

        // ll.addFirst(53);
        // ll.addFirst(43);
        // ll.addFirst(23);
        // ll.addFirst(73);
        // ll.addFirst(53);
        // ll.addLast(57);
        
        // ll.addLast(56);
        // ll.addLast(55);
        // ll.addLast(5);
        // ll.AddINDEX(3, 3);
        
        // ll.print();
        // System.out.println(size);
        // ll.removeFirst();
        // ll.removeLast();
        // ll.removeLast();
        // ll.addLast(3);
        // ll.print();
        
        // System.out.println(size);

    //    System.out.println(ll.recSearch(3));
    //    System.out.println(ll.search(3));

    //    head = ll.Rev(head);
    //    ll.print();

    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(2);
    ll.addFirst(62);
    ll.addFirst(27);
    ll.addFirst(29);
    
     ll.RfromLast(1);
     ll.print();

   // System.out.println(ll.isPalindrome(head));
    }
}


 