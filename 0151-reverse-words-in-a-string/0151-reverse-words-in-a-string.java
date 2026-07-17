class Solution {
    public String reverseWords(String s) {
        int left=0;
        char[] arr=s.toCharArray();
        int n=arr.length;
        int right=n-1;
        //swap
        while(left<right){
        char temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
        }
        StringBuilder result =new StringBuilder();
int start=0;
for(int i=0;i<=n;i++){
if(i==n || arr[i]== ' '){
if(start!=i){
int l=start;
int r=i-1;
while(l<r){
    char temp=arr[l];
    arr[l]=arr[r];
    arr[r]=temp;
    l++;
r--;
}
if(result.length()>0) result.append(" ");
result.append(arr,start,i-start);
}
start=i+1;
}}
return result.toString();


    }
}