package stack;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
arrayStack ArS=new arrayStack();
ArS.IuStack(5);
ArS.push(14);
ArS.push(13);
ArS.push(12);
ArS.push(11);
ArS.push(16);
ArS.push(160);



System.out.println(ArS.pop()+","+ArS.pop()+","+ArS.pop()+","+ArS.pop()+","+ArS.pop());
	}

}
