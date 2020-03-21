class  SLList{
    private class IntNode {
        private int first;
        private IntNode next;
        IntNode(int f, IntNode r) {
            first = f;
            next = r;
        }
    }

    public int size;
    private IntNode sentinalNode;

    public SLList(){
            sentinalNode=new IntNode(63,null);
            size=0;
    }

    public SLList(int number){
        sentinalNode=new IntNode(63,null);
        sentinalNode.next=new IntNode(number,null);
        size=1;
    }

    public void addLast(int number){
        IntNode LastNode=sentinalNode;
        while (LastNode.next!=null){
            LastNode=LastNode.next;
        }
        LastNode.next=new IntNode(number,null);
        size++;
    }

    public int size(){
        return size;
    }
    public void addFirst(int number){
        sentinalNode.next=new IntNode(number,sentinalNode.next);
        size++;
    }
    public int getFirst(){
        return sentinalNode.next.first;
    }

    public void squareDestructive(){
        if(this.sentinalNode.next ==null){
            return;
        }
        else {
            this.sentinalNode.next.first=this.sentinalNode.next.first*this.sentinalNode.next.first;
            this.sentinalNode.next.squareDestructive();
            return;
        }
    }

    public  void square(){
        if(this.sentinalNode.next ==null){
            return ;
        }
        else {
            SLList s=new SLList();
            SLList.sentinalNode.next= new IntNode(this.sentinalNode.next.first*this.sentinalNode.next.first,square(this.sentinalNode.next.next));
        }
    }

    public static  void main(int args[]){
        SLList l=new SLList(10);
        l.addFirst(5);
        l.addFirst(15);
        l.addLast(100);
        l.squareDestructive();
        l=l.square();
        System.out.println(l.size());
    }
}