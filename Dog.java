    public class  Dog {
    public int weightInPound;

    public Dog(int w) {
        weightInPound = w;
    }
    public  void makeNoise() {
        if (weightInPound < 10) {
            System.out.println("Yeep");
        }
            if(weightInPound <  30) {
            System.out.println("Bark");
        } else {
            System.out.println("woof");
        }
    }
    public static Dog biggerDog(Dog d1,Dog d2){
        return  d1.weightInPound > d2.weightInPound ? d1 : d2;
    }
}