public class LList_in_Node {
    public int data;
    public LList_in_Node next;

    public LList_in_Node (int data){
        this.data = data;
    }
}
class Node{
    private LList_in_Node head;

    public Node(){
        head = null;
    }

    public void add(int data){
        LList_in_Node tmp = new LList_in_Node(data);
        tmp.next = head;
        head = tmp;
    }

    public void print(){
        LList_in_Node tmp = head;
        while (tmp != null){
            System.out.println(tmp.data);
                tmp = tmp.next;
        }
    }

    public int size(){
        int count = 0;
        LList_in_Node sz = head;
        while (sz != null){
            count++;
            sz = sz.next;
        }
        return count;
    }
}
