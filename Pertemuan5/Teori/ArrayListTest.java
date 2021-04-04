import java.util.List;

public class ArrayListTest {
	public static void main(String args[]){ 
		iniArrayList elemen = new iniArrayList(); 
		Object object = elemen.is_empty();
		System.out.println("Apakah list kosong? "+ object);
		
		int sizeObject = elemen.sizeObject();
		System.out.println("Jumlah buah sekarang : "+ sizeObject);
		
		elemen.addObject("Jeruk"); 
		elemen.addObject("Melon"); 
		elemen.addObject("Semangka"); 
		elemen.addObject("Anggur"); 
		
		sizeObject = elemen.sizeObject();
		System.out.println("Jumlah buah sekarang : "+ sizeObject);
		
		object = elemen.removeObject();
		System.out.println("Buah yang dihapus : "+ object);
		
		sizeObject = elemen.sizeObject();
		System.out.println("Jumlah buah sekarang : "+ sizeObject);
	}
}