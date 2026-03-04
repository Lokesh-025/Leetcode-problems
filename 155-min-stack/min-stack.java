class MinStack {

    class Node {
        int data;   
        int min;    
        Node next;

        Node(int d, int m) {
            data = d;
            min = m;
            next = null;
        }
    }

    Node head;

    public MinStack() {
        head = null;
    }

    public void push(int val) {
        if (head == null) {
            head = new Node(val, val);
        } else {
            int minimum;

            if (val < head.min) {
                minimum = val;
            } else {
                minimum = head.min;
            }

            Node newNode = new Node(val, minimum);
            newNode.next = head;
            head = newNode;
        }
    }


    public void pop() {
        if (head != null) {
            head = head.next;
        }
    }


    public int top() {
        return head.data;
    }

    public int getMin() {
        return head.min;
    }
}