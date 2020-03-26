public class DogsLauncher {
    public static void main(String[] args){
        Dogs smallDog=new Dogs(5);
        Dogs mediumDog=new Dogs(25);
        Dogs hugeDog =new Dogs(40);

        Dogs[] dogHouses=new Dogs[3];
        dogHouses[0] =new Dogs(40);
        dogHouses[1]=smallDog;
        dogHouses[2]= hugeDog;

        for(int i=0;i<dogHouses.length;i++){
            Dogs.biggerDog(dogHouses[i],mediumDog).makeNoise();
        }

        Dogs a= (Dogs) Maximizers.max(dogHouses);
        a.makeNoise();

    }
}