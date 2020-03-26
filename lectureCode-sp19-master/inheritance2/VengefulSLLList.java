/** SList with additional operation printLostItems() which prints all items
  * that have ever been deleted. */
public class VengefulSLLList<Item> extends SLLList<Item> {
    SLLList<Item> deletedItems;

    public VengefulSLLList() {
        super();
        deletedItems = new SLLList<Item>();
    }

    public VengefulSLLList(Item x) {
        deletedItems = new SLLList<Item>();
    }

    @Override
    public Item removeLast() {
        Item x = super.removeLast();
        deletedItems.addLast(x);
        return x;
    }

    /** Prints deleted items. */
    public void printLostItems() {
        deletedItems.print();
    }

    public static void main(String[] args) {

		VengefulSLLList<Integer> vs1 = new VengefulSLLList<Integer>(0);
		vs1.addLast(1);
		vs1.addLast(5);
		vs1.addLast(10);
		vs1.addLast(13);
		// vs1 is now: [1, 5, 10, 13] 


		vs1.removeLast();
		vs1.removeLast();
		// After deletion, vs1 is: [1, 5]

		// Should print out the numbers of the fallen, namely 10 and 13.
		System.out.print("The fallen are: ");
		vs1.printLostItems();
	}
} 