public class IntList{
    int first;
    IntList next;
    IntList(int f,IntList r ){
        first=f;
        next=r;
    }
    int size(){
        if(next==null){
            return 1;
        }
        return 1+next.size();
    }
    int get(int i){
        if(i==0){
            return this.first;
        }
        else return next.get(i-1);
    }
    public static void main(String args[]){
        IntList l=new IntList(15,null);
        l=new IntList(10,l);
        l=new IntList(5,l);
        System.out.println(l.size());
        System.out.println(l.get(1));
    }
}