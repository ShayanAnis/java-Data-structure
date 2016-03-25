package stack;

public class arrayStack  {
	private  int A[];
	private int count;	
	int  x,temp=10;
	void IuStack( int size){
		A= new int [size];
		count=0;
	}
void push(int  val)
{
	if(A.length==count){
	 
	 System.out.println("Stack is full");
	 A = new int [temp];
	 System.out.println(temp);
	 
}
	
	A[count]=val;
	count++;
	//System.out.println(count);
}
 int pop(){
	 count--;
	 x=A[count];
	// System.out.println(count);
	return x;
	
}
}
																		