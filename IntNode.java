public class IntNode implements LIST61B{
    int first;
    IntNode next;
    IntNode(int f,IntNode r ){
        first=f;
        next=r;
    }
    public int size(){
        if(next==null){
            return 1;
        }
        return 1+next.size();
    }
    public int iterativeSize(){
        IntNode temp=this;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        return size;
    }

    @Override
    public void addFirst(Object x) {

    }

    @Override
    public void addLast(Object y) {

    }

    @Override
    public Object getFirst() {
        return null;
    }

    @Override
    public Object getLast() {
        return null;
    }

    @Override
    public Object removeLast() {
        return null;
    }

    public Object get(int i){
        if(i==0){
            return this.first;
        }
        else return next.get(i-1);
    }

    @Override
    public void insert(Object x, int position) {

    }


    public void addAdjacent(){
        if(next==null){
            return;
        }
        if(this.first==next.first){
            this.next.first=this.first+this.next.first;
            this.next.addAdjacent();
            this.next=null;
        }
        else{
            this.next.addAdjacent();
        }
    }


    public void skippify() {
        IntNode p = this;
        int n = 1;
        while (p != null) {
            IntNode next = p;
            for (int i=0;i<n;i++) {
                if (p!=null) {
                    p=p.next;
                }
            }
            next.next=p.next;
            n++;
            p=p.next;
        }
    }

    public static void main(String args[]){
        IntNode l=new IntNode(15,null);
        l=new IntNode(20,l);
        l=new IntNode(10,l);
        l=new IntNode(5,l);
        l=new IntNode(5,l);

        System.out.println(l.size());
        System.out.println(l.get(1));
        System.out.println(l.iterativeSize());
        l.addAdjacent();
        System.out.println(l.size());
        l.skippify();
        System.out.println(l.iterativeSize());

    }
}