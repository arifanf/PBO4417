import java.util.ArrayList;
import java.util.List;

public class Queue extends iniArrayList {
    int head;
	
	public Object removeObject(){
        Object object = list.remove(head);
        head--;
        return object;
    }

	public Object peek(){
        return list.get(head);
    }
}
