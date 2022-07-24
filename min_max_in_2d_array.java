//to find maximum and minimum element in 2d array
class Main {
	public static void main(String[] args) {
		int [][] arr ={ {2,4,917},{4,7,9},{67,72,-373,8,73}};
		System.out.println(minimum(arr));
		System.out.println(maximum(arr));
	}
	static int maximum(int[][] nums)
	{
	    int max=Integer.MIN_VALUE;
	    for(int [] no :nums)
	    {
	        for(int n:no)
	        {
	            if(n>max)
	            {
	                max=n;
	            }
	        }
	    }
	    return max;
	}
	static int minimum(int[][] arr)
	{
	    int min =Integer.MAX_VALUE;
	    for(int[] nums : arr)
	    {
	        for(int no: nums)
	        {
	            if (no<min)
	            {
	                min=no;
	            }
	        }
	    }
	    return min;
	}
}