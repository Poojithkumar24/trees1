import java.util.ArrayList;
import java.util.List;

public class MinHeap {
    List<Integer> list=new ArrayList<>();
    public int peek(){
        return list.get(0);
    }
    public void insert(int val){
        list.add(val);
        heapifyIns(list,list.size()-1);
    }
    public void deleteRoot(){
        if(list.size()==0){
            System.out.println("empty heap");
            return;
        }
        list.set(0,list.get(list.size()-1));
        list.remove(list.size()-1);
        heapifyDel(list,0);
    }
    public void heapifyDel(List<Integer> list,int i){
        int size=list.size();
        int largest=i;
        int left=(2*i)+1;
        int right=(2*i)+2;
        if(left<size && list.get(largest)>list.get(left)) largest=left;
        if(right<size && list.get(largest)>list.get(right)) largest=right;
        if(largest!=i){
            int temp=list.get(largest);
            list.set(largest,list.get(i));
            list.set(i,temp);
            heapifyDel(list,largest);
        }
    }
    public void heapifyIns(List<Integer> list,int i){
        int parent=(i-1)/2;
        if(parent>=0 && list.get(parent)>list.get(i)){
            int temp=list.get(parent);
            list.set(parent,list.get(i));
            list.set(i,temp);
            heapifyIns(list,parent);
        }
    }
    public void traverse(){
        for(int i:list){
            System.out.print(i+" ");
        }
    }
}
