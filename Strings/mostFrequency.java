public class mostFrequency {
    public static void main(String[] args) {
        String s="abaacrmnrra";
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[ch-97]++;
        }
        int mx=0;
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx) {
                mx=arr[i];
                idx=i;
            }
        }
        System.out.println(s.charAt(idx));
    }
}
