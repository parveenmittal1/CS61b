    public class  Dogs implements Comparable<Dogs> {
    public int weightInPound;

    public Dogs(int w) {
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
    public static Dogs biggerDog(Dogs d1,Dogs d2){
        return  d1.weightInPound > d2.weightInPound ? d1 : d2;
    }


    @Override
        public int compareTo(Dogs d){

            return this.weightInPound-d.weightInPound;
        }
    }