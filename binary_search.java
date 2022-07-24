//binary search in an array
class Main {
	public static void main(String[] args) {
		int [] arr={-12,-3,9,10,13,33,45,78,89,99,100};
		int target=10;
		System.out.println(binarysearch(arr,target));
	}
	static int binarysearch(int [] arr,int target)
	{
	    int start=0;
	    int end=arr.length-1;
	    while(start<=end)
	    {
	        int mid=start+(end-start)/2;
	        if(arr[mid]<target)
	        {
	            start=mid+1;
	        }
	        else if(arr[mid]>target)
	        {
	            end=mid-1;
	        }
	        else
	        {
	            return mid;
	        }
	    }
	    
	   return -1; 
	}
	
}