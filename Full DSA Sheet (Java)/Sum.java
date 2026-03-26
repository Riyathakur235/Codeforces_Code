 //Sliding window(k size of maximum sum )
// import java.util.*;;
// int arr[]={2,1,2,5,1,3,2};
// int k=3;
// int windowsum=0;
// for(int i=0;i<k;i++){
//        windowsum+=arr[i];
//    }
//    int maxsum=windowsum;
// for(int j=k;j<arr.length;j++){
//        windowsum+=arr[j];
//        windowsum-=arr[j-k];
//        maxsum=Math.max(maxsum,windowsum);
//    }
//        System.out.println(maxsum);


//print pair of target value using two pointer
    //    int arr[]={1,2,3,4,5,6};
    //    int target=8                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ;
    //    int left=0;
    //    int right=arr.length-1;
    //    while(left<right){
    //        int sum=arr[left]+arr[right];
    //        if(sum==target){
    //            System.out.println(arr[left]+" "+arr[right]);
    //            break;
    //        }else if(sum>target){
    //            right--;
    //        }else{
    //            left++;
    //        }

    //    }
