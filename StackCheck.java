class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
         this.data = data;
    }
}
class StackImpl {
    private ListNode head;
    public void push(int data){
       ListNode newNode = new ListNode(data);
        if(head == null){
             head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    public int pop(){
         if(head == null){
             System.out.println("Stack is empty");
             return -1;
         }
         else{
             int temp = head.data;
             head = head.next;
             return temp;
         }
    }
    public int peek(){
          if(isEmpty()){
               System.out.println("Stack is empty!");
               return -1;
          }
          return head.data;
    }
    public boolean isEmpty(){
         return head == null;
    }
}
public class StackCheck{
    public static void main(String[] args) {
        StackImpl stackImpl = new StackImpl();
        stackImpl.push(12);
        stackImpl.push(125);
        stackImpl.push(123);
        stackImpl.push(1245);
        System.out.println(stackImpl.pop());
        System.out.println(stackImpl.isEmpty());
        System.out.println(stackImpl.peek());

    }
}
