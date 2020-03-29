import java.util.*;

public class ArrSet<T>  implements Iterable<T>{
    private T [] tList;
    static int  size;
    public ArrSet() {
        size=0;
        tList=(T[]) new Object[100];
    }

    /* Returns true if this map contains a mapping for the specified key.
     */

    public Iterator<T> iterator() {
        return new AIterator();
    }



    public boolean contains(T x) {
        for(int i=0;i<size;i++){
            if (x.equals(tList[i])) {
                return true;
            }
        }
        return false ;
    }

    /* Associates the specified value with the specified key in this map.
       Throws an IllegalArgumentException if the key is null. */
    public void add(T x) {
        if (x==null){
            return;
        }
        if(!contains(x)){
        tList[size]=x;
        size++;
    }
    }

    /* Returns the number of key-value mappings in this map. */
    public int size() {
        return size;
    }



    private  class AIterator implements Iterator<T>{
        int wizPos;
        AIterator(){
            wizPos=0;
        }
        public boolean hasNext() {
            return wizPos<size;
        }

        public T next() {
            T returnItem=tList[wizPos];
            wizPos++;
            return returnItem;
        }
    }
    @Override
    public String toString() {
        StringBuilder SB=new StringBuilder("{");
        for(int i=0;i<size-1;i++){
            SB.append(tList[i]);
            SB.append(",");
        }
        SB.append(tList[size-1]);
        SB.append("}");
        return SB.toString();
    }

    @Override
    public boolean equals(Object other){
        if(other==null){
            return false;
        }
        if(this==other){
            return true;
        }
        if(getClass()!=other.getClass()){
            return false;
        }
        ArrSet o=(ArrSet) other;
        if(this.size!=o.size()){
            return false;
        }
        for(T item:this) {
        if(!o.contains(item)){
            return false;
        }
        }
        return true;
    }


    public  static <GL> ArrSet<GL> of(GL... stuff){
        ArrSet<GL> returnSet = new ArrSet<GL>();
        for(GL x:stuff){
            returnSet.add(x);
        }
        return returnSet;
    }
    
    public static void main(String[] args) {
        Set<Integer> javaSet=new HashSet<>();
        javaSet.add(1);
        javaSet.add(2);
        javaSet.add(3);
        javaSet.add(4);
        Iterator<Integer> seer=javaSet.iterator();
        while(seer.hasNext()){
            System.out.println(seer.next());
        }
        System.out.println(javaSet);


        ArrSet<String> aSet = new ArrSet<>();
        aSet.add(null);
        aSet.add("horse");
        aSet.add("fish");
        aSet.add("house");
        aSet.add("fish");
        Iterator<String> aseer=aSet.iterator();
        System.out.println(aSet);
        while (aseer.hasNext()){
            System.out.println(aseer.next());
        }
        for(String i:aSet){
            System.out.println(i);
        }
        System.out.println(aSet.contains("horse"));
        System.out.println(aSet.size());
        System.out.println(aSet);
    }



    /* Also to do:
    1. Make ArraySet implement the Iterable<T> interface.
    2. Implement a toString method.
    3. Implement an equals() method.
    */
}
