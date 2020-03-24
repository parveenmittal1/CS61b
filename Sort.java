class Sort{
    private static int findSmallest(String[] s,int i){
        int maxLength=10000;
        for(int j=i;j<s.length;j++) {
            if (maxLength > s[j].length()) {
                maxLength = s[j].length();
            }
        }
        return maxLength;
    }
    private static void swap(String []s,int a, int b){
        String temp=s[a];
        s[a]=s[b];
        s[b]=temp;
    }
    private static void helperSort(String[] ans,int i){
        if(i==ans.length){
            return;
        }
        int pos=findSmallest(ans,i);
        swap(ans,i,pos);
        helperSort(ans,i+1);
    }
    public static void sort(String[] ans){
        helperSort(ans,0);
    }

    public static void main(String[] args) {
        String[] s={"BAlist","ABlist","nmom","mo"};
        sort(s);
        System.out.println(s[0]);
    }
}