import java.util.List;

public class QueueTest {
	public static void main(String args[]){ 
		Queue queue = new Queue(); 
		Object object = queue.is_empty();
		System.out.println("Apakah list kosong? "+ object);
		
		int sizeObject = queue.sizeObject();
		System.out.println("Jumlah buah sekarang : " + sizeObject);
		
		queue.addObject("Jeruk"); 
		queue.addObject("Melon"); 
		queue.addObject("Semangka"); 
		queue.addObject("Anggur"); 
		
		sizeObject = queue.sizeObject();
		System.out.println("Jumlah buah sekarang : " + sizeObject);
		
		object=queue.peek();
        System.out.println("Elemen head pada Queue : " + object);
		
		object = queue.removeObject();
		System.out.println("Buah yang dihapus : " + object);
		
		sizeObject = queue.sizeObject();
		System.out.println("Jumlah buah sekarang : "+ sizeObject);
	}
}