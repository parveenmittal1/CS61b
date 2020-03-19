public class DogLauncher{
    public static void main(String[] args){
        Dog smallDog=new Dog(5);
        Dog mediumDog=new Dog(25);
        Dog hugeDog =new Dog(40);

        Dog[] dogHouses=new Dog[4];
        dogHouses[0] =new Dog(40);
        dogHouses[1]=smallDog;
        dogHouses[2]= hugeDog;

        for(int i=0;i<dogHouses.length;i++){
            Dog.biggerDog(dogHouses[i],mediumDog).makeNoise();
        }
    }
}