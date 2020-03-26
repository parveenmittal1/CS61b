/* SLList, but with additional rotateRight operation. */
public class RotatingSLLList<Item> extends SLLList<Item> {
	/** To do: Implement RotatingSLList such that code compiles and outputs correct result. */

	public static void main(String[] args) {
		RotatingSLLList<Integer> rsl = new RotatingSLLList<>();
		/* Creates SList: [10, 11, 12, 13] */
		rsl.addLast(10);
		rsl.addLast(11);
		rsl.addLast(12);
		rsl.addLast(13);

		/* Should be: [13, 10, 11, 12] */
		rsl.rotateRight();
		rsl.print();
	}
} 