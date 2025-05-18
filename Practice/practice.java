// package Practice;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;



public class practice{
//     public static void main(String[] args){
//         int x = 10; 
//         if (x) {
//             System.out.println("Stark"); 
//         }
//         else { 
//             System.out.println("X"); 
//         } 
//     }
// }
// public class practice {
//     public static void reverse(int arr[]){
//         int i=0;
//         int j=arr.length-1;
//         while(i<j){
//             int temp=arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp;
//             i++;
//             j--;
//         }
//     }
//     public static void main(String[] args) {
        // boolean name = true;
        // switch (name) {
        //     case true:
        //         System.out.println("Hello ");
        //     default:
        //         System.out.println("hi");
        // }
//         int arr[]={1,2,3,4,5};
//         reverse(arr);
//         for(int ele: arr){
//             System.out.print(ele);
//         }
//     }


    // public static void main(String[] args) {
   
    //     String s="The quick brown fox";
    //     String toFind="quick";
    //     boolean flag=false;
    //     for(int i=0;i<=s.length()-toFind.length();i++){
    //         String substr=s.substring(i,i+toFind.length());
    //         if(substr.equals(toFind)) flag=true;
    //     }
    //     if(flag) System.out.printf("Found Substring: %s",toFind);
    //     else System.out.printf("Substring not found");
    // }


    // public static void main(String[] args) {
    //     char arr[]=new char[5];
    //     System.out.println(arr[0]+"#"+arr[1]);
        

    // }
   
        public static void main(String[] args) {
            // String str="shreya";
            // String []s=str.split("");
            // for(int i=0;i<s.length;i++){
            //     System.out.print(s[i]);
            // }
        // StringBuilder sb = new StringBuilder("abc");
        // System.out.println(sb.toString().compareTo("bgh"));
        // List<Integer> arr=new ArrayList<>();
        // arr.add(1);
        // arr.add(2);
        // arr.set(0,arr.get(0)+arr.get(1));
        // System.out.println(arr.get(0));
        // int n=2;
        // char ch='a';
        // ch=(char)((int)n+48);
        // System.out.println(ch);
        
        // String s="000070000800";
        // int n=s.length();
        // int i=0;
        // for(i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(ch!='0') break;
        // }
        // System.out.println(s.substring(i,n));
        // String str="";
        // boolean bool=false;
        // for(int i=0;i<n;i++){
        //     char ch=s.charAt(i);
        //     if(ch!='0') bool=true;
        //     if(bool) str+=ch;
        // }
        // System.out.println(str);
        // String str="hello";
        // char ch[]=str.toCharArray();
        // String s="123";
        // // int n=Integer.parseInt(s);
        // int n=0;
        // for(int i=0;i<s.length();i++){
        //     int ch=s.charAt(i)-'0';
        //     n=n*10+(ch);
        // }
        // System.out.println(n);
        // int n=8;
        // int prev=0,curr=1,next=1;
        // int i=0;
        // while(i<n){
        //     System.out.println(prev);
        //     next=prev+curr;
        //     prev=curr;
        //     curr=next;
        //     i++;
        // }

        // int arr[]={3,2,5,1,4,10};
        // int max=Integer.MIN_VALUE;
        // int smax=Integer.MIN_VALUE;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>max){
        //         smax=max;
        //         max=arr[i];
        //     }
        //     else if(arr[i]>smax && arr[i]!=max){
        //         smax=arr[i];
        //     }

        // }
        // System.out.println(max+" "+smax);

        // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // String message=reader.readLine();
        // System.out.println(message);
        int arr1[]={101,102,103,104,105};
        String arr2[]={"Alice","Bob","Charlie","David","Eve"};
        int arr3[]={95,90,95,85,90};
        int n=arr3.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr3[j]<arr3[j+1]){
                    int temp1=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp1;

                    String temp2=arr2[j];
                    arr2[j]=arr2[j+1];
                    arr2[j+1]=temp2;

                    int temp3=arr3[j];
                    arr3[j]=arr3[j+1];
                    arr3[j+1]=temp3;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr1[i]+" "+arr2[i]+" "+arr3[i]);
        }




    }
}



