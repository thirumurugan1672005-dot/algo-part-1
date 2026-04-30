class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
         this.data = data;
    }
}
class ListDs{
    ListNode head;
    ListNode tail;
    int size;

    public void append(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
                 head = newNode;
                 tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void insert(int pos,int data){
        if(pos < 0|| pos > size){
             System.out.println("Invalid Position");
             return;
        }
        ListNode newNode = new ListNode(data);
         if(pos == 0){
            newNode.next = head;
            head = newNode;
         }
         else if(pos==size){
             tail.next = newNode;
             tail = newNode;
         }
         else {
            ListNode current = head;
            for(int i=0;i<pos-1;i++){
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
         }
         size++;
    }
    public void delete(int pos){
         if(pos < 0 || pos >= size){
             System.out.println("Invalid position");
             return;
         }
         if(pos == 0){
             head = head.next;
         }
         else{
            ListNode curr = head;
            for(int i=0;i<pos-1;i++){
                curr = curr.next;
            }
            ListNode temp = curr.next;
            curr.next = curr.next.next;
            temp.next = null;
         }
         size--;

    }
    public void print(){
        ListNode curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }

}
public class ListImpl {
    public static void main(String[] args) {
        ListDs ds = new ListDs();
        ds.append(100);
        ds.append(2);
        ds.append(3);     
        ds.append(3);     
        ds.append(132);   
        ds.insert(0,235);
        ds.print();

        ds.delete(5);
        ds.print();  
    }
}
