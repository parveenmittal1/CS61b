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

    public SLList(int number){
        first=new IntNode(number,null);
    }
    public  addLast(int number){
        IntNode LastNode=first;
        while (LastNode.next!=null){
            LastNode=LastNode.next;
        }
        LastNode.next=new IntNode(number);
    }

    private static int size(){
        if(next==null){
            return 1;
        }
        return 1+next.size();
    }

    public int size(){
        return size(first);
    }

    public void addFirst(int number){
        first=new IntNode(number,first);
    }
    public int getFirst(){
        return first.first;
    }

    public static  void main(int args[]){
        SLList l=new SLList(10);
    }
}