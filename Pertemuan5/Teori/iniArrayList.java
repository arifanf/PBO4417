import java.util.ArrayList;
import java.util.List;
 
public class iniArrayList {
	public List<Object> list = new ArrayList<Object>();
    public int currIdx=-1;
	
	public boolean is_empty(){
		return list.isEmpty();
	}
	public void addObject(Object object){
        list.add(object);
        currIdx++;
		System.out.println("List Buah : "+list);
    }
    public Object removeObject(){
        Object object = list.remove(currIdx);
        currIdx--;
        return object;
    }
    public int sizeObject(){
        return list.size();
    }
}
