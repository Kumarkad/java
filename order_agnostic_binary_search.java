// order agnostic binary search in an array
class Main {
	public static void main(String[] args) {
	    int [] arr={-12,8,65,76,83,832,839,7910};
//		int [] arr={99,88,83,77,66,56,43,32,22,10,-24};
		int target=83;
		System.out.println(orderagnosticbs(arr,target));
	}
	static int orderagnosticbs(int[] arr, int target)
	{
	    int start=0;
	    int end=arr.length-1;
	    
	    boolean isasc=(arr[start]<arr[end]);
	    
	    while(start<=end)
	    {
	        int mid= start+(end-start)/2;
	        if(isasc)
	        {
	            if (arr[mid]<target)
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
	        else
	        {
	            if(arr[mid]>target)
	            {
	                start=mid+1;
	            }
	            else if(arr[mid]<target)
	            {
	                end=mid-1;
	            }
	            else
	            {
	                return mid;
	            }
	        }
	    }
	    return -1;
	}
}