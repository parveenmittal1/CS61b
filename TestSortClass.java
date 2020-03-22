class TestSortClass{

    public static void testSort(){
        String []input={"this","is","a","test"};
        String []output={"a","is","test","this"};
        Sort.sort(input);

        if(!java.util.Arrays.equals(input,output)){
            System.out.println("this is not matched ");
        }
    }

    public static void main(String[] args) {
        testSort();
    }
}