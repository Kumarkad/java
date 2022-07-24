// find minimum and maximum element in array
class Main {
	public static void main(String[] args) {
		int [] arr ={728,71,82,82,99,72,62,6729,738};
		int ans =findmin(arr);
		System.out.println(ans);
	}
	static int findmin(int [] arr)
	{
	    int min =Integer.MAX_VALUE;
	    int max=Integer.MIN_VALUE;
	    for(int item :arr)
	    {
	        if (item<min)
	        {
	            min=item;
	        }
	        if (item>max)
	        {
	            max=item;
	        }
	    }
	    System.out.println(max);
	    return min;
	}
}