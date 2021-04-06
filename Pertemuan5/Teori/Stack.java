import java.util.ArrayList;
import java.util.List;

public class Stack extends iniArrayList{
    public Object peek() {
        return list.get(currIdx);
    }
    public void clear(){
        list.clear();
        currIdx=-1;
    } 
}
