public class New {
    public static void main(String[] args) {
        // write a program take an array from user and move all the zeros of the array ,right side of the array.
       int[] arr = {1, 2, 0, 7, 0, 0, 4, 5};
       int count=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }
       while (count< arr.length){
           arr[count]=0;
           count++;
       }
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]+" ");
       }
    } 
}
