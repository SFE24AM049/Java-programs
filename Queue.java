Class Node{
	int data;
	Node next;
	public Node (int data){
		this.data=data;
		this.next=null;
	}
}

Class Queue{
	Node front;
	Node fear;
	int size;
public Queue(){
	front=rear=null;
	size=0;
}
public void enqueue (int data){
	Node newNode=newNode(data);
if(rear==null){
	front=rear=newNode;
}else{
	rear.next=newNode;
	rear=newNode;
}
size++;
}
public int dequeue(){
	if (is Empty()){
	throw new Retime Exception("Queue is empty");
	}
	int data=front.data;
	front=front.next;
	if (front ==null)
{
	rear=null;
	}
	size --;
	return data;
	}
public Boolean isEmpty(){
	return front==null;
}
	public in peek(){
	if (isEmpty()){
		throw new aruntimeException("Queue is Empty");
}
	return front data;
}
public intsize(){
	return size;
}
}
public class main{
	public Static void main (String[] args) {
	Queue queue=newqueue(0;


	queue.enqueue(10);
	queue.enqueue(20);
	queue.enqueue(30);
	system.out.println("Queue size:"+queue size());
	System.out.println("Frount element:"+queue.peek());
	System.out.println("deQueue element:"+queue.dequeue());
	System.out.println("Queue size:"+queue size());
}
}
	



