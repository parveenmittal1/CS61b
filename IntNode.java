public class IntNode{
    int first;
    IntNode next;
    IntNode(int f,IntNode r ){
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
        IntNode l=new IntNode(15,null);
        l=new IntNode(10,l);
        l=new IntNode(5,l);
        System.out.println(l.size());
        System.out.println(l.get(1));
    }
}