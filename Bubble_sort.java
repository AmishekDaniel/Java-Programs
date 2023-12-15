public class Bubble_sort {
	public static void main(String[] args){
    int i,j;
    int[] arr={15,13,14,11,12,10};
    for(j=0;j<6;j++)
    {
      for( i=0;i<5;i++)
      {
         if(arr[i]>arr[i+1])
         {
           int swap=arr[i];
           arr[i]=arr[i+1];
           arr[i+1]=swap;
         }
      }
    }
	for(i=0;i<6;i++){
        System.out.println(arr[i]);
    }
}
}
 
