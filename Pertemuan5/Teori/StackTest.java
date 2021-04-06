import java.util.List;

public class StackTest {
	public static void main(String args[]){
		Stack stack = new Stack();
		Object object = stack.is_empty();
		System.out.println("Apakah list kosong? " + object);
		
		int sizeObject = stack.sizeObject();
		System.out.println("Jumlah buah sekarang : " + sizeObject);
		
        stack.addObject("jeruk");
        stack.addObject("anggur");
		stack.addObject("pisang");
		stack.addObject("pepaya");
        
		sizeObject = stack.sizeObject();
		System.out.println("Jumlah buah sekarang : " + sizeObject);

		object = stack.peek();
        System.out.println("Data Teratas pada Stack : " + object);
        
        object = stack.removeObject();
        System.out.println("Elemen yang dikeluarkan (Pop) : " + object);

        sizeObject = stack.sizeObject();
		System.out.println("Jumlah buah sekarang : " + sizeObject);

        object = stack.peek();
        System.out.println("Elemen Teratas pada Stack setelah Pop: " + object);
	}
}