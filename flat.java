public class flat {
     public static int[] flatten(int[][] x) {
        int totalLength = 0;
        for (int[] arr:x) {
            totalLength=totalLength+arr.length;
             }

         int[] a = new int[totalLength];
         int aIndex = 0;

        for (;aIndex<totalLength;aIndex++) {
            for(int temp[]:x){
                for(int tempNum:temp){
             a[aIndex]=tempNum;
             aIndex++;
                }
            }
        }

         return a;
         }
}
