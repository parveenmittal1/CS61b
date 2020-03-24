public class Alist<Gl> implements LIST61B{
    private int size;
    private Gl[] Aarray;
    Alist(){
        Aarray=(Gl[]) new Object[50];
        size=0;
    }

    private void reSize(){
        Gl[] temp=(Gl[]) new Object[size*2];
        System.arraycopy(Aarray,0,temp,0,size);
        Aarray=temp;
    }

//    public void AddLast(int number){
//        if(size==Aarray.length){
//            reSize();
//        }
//        Aarray[size]=number;
//        size++;
//    }

    public int size(){
        return size;
    }

    public void insert(Object item, int pos){
        int i=pos;
        Gl a=(Gl)item;
    }
    public Gl get(int i){
        if(i<size)
        return Aarray[i];
        return  null;
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

    public Gl removeLast(){
        Gl a =Aarray[size];
        size--;
        Aarray[size]=null;
        return a;
    }



}
