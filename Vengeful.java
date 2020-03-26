public class Vengeful<item> extends SLLList<item> {
    SLLList<item> deletedItems;
    public Vengeful(){
        deletedItems=new SLLList<item>();
    }


    @Override
    public item removeLast(){
        item x=super.removeLast();
        deletedItems.addLast(x);
        return x;
    }

    public void printLostItems(){
        deletedItems.print();
    }

    public static void main(String[] args) {
        Vengeful list=new Vengeful();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.removeLast();
        list.removeLast();

        list.printLostItems();
    }
}
