class  SLList<Bleep> implements LIST61B{
    private  class IntNode {
        private Bleep first;
        private IntNode next;
        private IntNode prev;
        IntNode(Bleep f, IntNode r) {
            prev=null;
            first = f;
            next = r;
        }
    }

    public int size;
    private IntNode sentinelNode;
    private IntNode last;

    public SLList(){
        Bleep a = null;
            sentinelNode =new IntNode(a,null);
            last=null;
            size=0;
    }

    public void insert(Object item, int pos){

    }
    @Override
    public void print() {
        for (IntNode p = sentinelNode.next; p != null; p = p.next) {
            System.out.println(p.first + " ");
        }
    }


    public SLList(Bleep number){
        Bleep a = null;
        sentinelNode =new IntNode(a,null);
        sentinelNode.next=new IntNode(number,null);
        last=sentinelNode.next;
        size=1;
    }

    public void addLast(Object number){
        IntNode LastNode= sentinelNode;
        while (LastNode.next!=null){
            LastNode=LastNode.next;
        }
        LastNode.next=new IntNode((Bleep)number,null);
        last =LastNode.next;
        size++;
    }

    public int size(){
        return size;
    }
    public void addFirst(Object number){
        sentinelNode.next=new IntNode((Bleep)number, sentinelNode.next);
        size++;
    }

    public Bleep getFirst(){
        return sentinelNode.next.first;
    }

    @Override
    public Object getLast() {
        return null;
    }

    @Override
    public Object removeLast() {
        return null;
    }

    @Override
    public Object get(int i) {
        return null;
    }

//    public void squareDestructive(){
//        if(this.sentinelNode.next ==null){
//            return;
//        }
//        else {
//            this.sentinelNode.next.first=this.sentinelNode.next.first*this.sentinelNode.next.first;
//            this.sentinelNode.next.squareDestructive();
//            return;
//        }
//    }

//    public  void square(){
//        if(this.sentinelNode.next ==null){
//            return ;
//        }
//        else {
//            SLList s=new SLList();
//            SLList.sentinelNode.next= new IntNode(this.sentinelNode.next.first*this.sentinelNode.next.first,square(this.sentinelNode.next.next));
//        }
//    }

    public static  void main(int args[]){
        SLList l=new SLList(10);
        l.addFirst(5);
        l.addFirst(15);
        l.addLast(100);
       // l.squareDestructive();
       // l=l.square();
        System.out.println(l.size());
    }
}