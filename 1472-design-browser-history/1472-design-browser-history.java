class BrowserHistory {
    public class Node{
        String data;
        Node next, prev;
        public Node(String data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    Node head, ptr;

    public BrowserHistory(String homepage) {
        head = new Node(homepage);
        ptr = head;
    }
    
    public void visit(String url) {
        Node newNode = new Node(url);
        ptr.next = newNode;
        newNode.prev = ptr;
        ptr = newNode;
    }
    
    public String back(int steps) {
        while(ptr.prev != null && steps-- > 0){
            ptr = ptr.prev;
        }
        return ptr.data;
    }
    
    public String forward(int steps) {
        while(ptr.next != null && steps-- > 0){
            ptr = ptr.next;
        }
        return ptr.data;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */