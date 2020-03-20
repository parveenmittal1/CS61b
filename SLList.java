class  SLList{
    private class IntNode {
        int first;
        IntNode next;

        IntNode(int f, IntNode r) {
            first = f;
            next = r;
        }
    }
    private IntNode first;
    public int size
    public SLList(int number){
        first=new IntNode(number,null);
        size=1;
    }
    public  addLast(int number){
        IntNode LastNode=first;
        while (LastNode.next!=null){
            LastNode=LastNode.next;
        }
        LastNode.next=new IntNode(number);
        size++;
    }

    public int size(){
        return size;
    }
    public void addFirst(int number){
        first=new IntNode(number,first);
        size++;
    }
    public int getFirst(){
        return first.first;
    }

    public static  void main(int args[]){
        SLList l=new SLList(10);
    }
    public void squareDestructive(IntNode first){
        if(first.next ==null){
            first.first=first.first*first.first;
            return;
        }
        else {
            first.first=first.first*first.first;
            squareDestructive(first.next);
            return;
        }
    }

    public  void square(IntNode first){
        if(first.next ==null){
            return new IntNode(first.first*first.first,null);
        }
        else {
            return new IntNode(first.first*first.first,square(first.next));
        }
    }
}