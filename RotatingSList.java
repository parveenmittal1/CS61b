public class RotatingSList<Item> extends SLLList<Item> {





    public static void main(String[] args) {
    RotatingSList list=new RotatingSList();
    list.addLast(1);
    list.addLast(2);
    list.addLast(3);
    list.addLast(4);
    list.addFirst(5);

    list.rotate();
    }

    private void rotate() {
        Item temp=this.removeLast();
        this.addFirst(temp);
    }
}
