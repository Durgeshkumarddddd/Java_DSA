class SearchNode {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public static Node head;
    public static Node tail;
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    // Search Node by using recursive search
    
     

    public int search(Node temp, int key, int idx){
        if(temp == null){
            return -1;
        }
        if(temp.data == key){
            return idx;
        }
        return search(temp.next, key, idx+1);
    }
    

    // Search Node data by using recursive search
    
    public static int helperSearch(Node temp, int key){
        if(temp == null){
            return -1;
        }
        if(temp.data == key){
            return 0;
        }
        int idx = helperSearch(temp.next, key);
        
        if( idx < 0){
            return -1;
        }
        return idx+1 ;
    }


    public int recSearch(int key){
        Node temp = head;
        return helperSearch(temp, key);
    }


    // Search Node by using iterative search


    public int search(int key){
        Node temp = head;
        int i = 0 ;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1; // not found in list
    }
    
    public static void main(String[] args){
        SearchNode sn = new SearchNode();
        sn.insert(5);
        sn.insert(10);
        sn.insert(15);
        sn.insert(20);
        System.out.println(sn.search(head,15, 0));
       System.out.println( sn.search(20));
       System.out.println(sn.recSearch(15));
    }
}
