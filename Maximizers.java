public class Maximizers {
    public static Comparable max(Comparable[] a){
        int max=0;
        for(int i=0;i<a.length;i++){
            int cmp=a[i].compareTo(a[max]);

            if(cmp>0){
                max=i;
            }
        }
        return a[max];
    }

    public static void main(String[] args) {
        Dogs smallDog=new Dogs(5);
        Dogs mediumDog=new Dogs(25);
        Dogs hugeDog =new Dogs(40);

        Dogs[] dogHouses=new Dogs[3];
        dogHouses[0] =new Dogs(40);
        dogHouses[1]=smallDog;
        dogHouses[2]= hugeDog;
        Dogs a= (Dogs) max(dogHouses);
        a.makeNoise();
    }

}
