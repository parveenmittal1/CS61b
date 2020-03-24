public interface LIST61B<Item> {
    public void addFirst(Item x);
    public void addLast(Item y);
    public Item getFirst();
    public Item getLast();
    public Item removeLast();
    public Item get(int i);
    public void insert(Item x, int position);
    public int  size();
    public default void print(){
        for(int i=0;i<size();i++){
            System.out.println(get(i));
        }
    }

}
