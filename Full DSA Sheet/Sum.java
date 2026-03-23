 //Sliding window(k size of maximum sum )
   int arr[]={2,1,2,5,1,3,2};
   int k=3;
   int windowsum=0;
   for(int i=0;i<k;i++){
       windowsum+=arr[i];
   }
   int maxsum=windowsum;
   for(int j=k;j<arr.length;j++){
       windowsum+=arr[j];
       windowsum-=arr[j-k];
       maxsum=Math.max(maxsum,windowsum);
   }
       System.out.println(maxsum);
