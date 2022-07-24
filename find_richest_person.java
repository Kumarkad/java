// find richest person
class Main {
	public static void main(String[] args) {
		int [][] arr ={ {2,4,917},{4,7,9},{67,72,8,73}};
		int ans =findrich(arr);
		System.out.println("Rich money is : "+ans);
	}
	static int findrich(int [][] arr)
	{
	    int max=Integer.MIN_VALUE;
	    for(int [] person : arr)
	    {
	        int sum=0;
	        for(int acc: person)
	        {
	            sum+=acc;
	            //System.out.println(sum);
	        }
	        if(max<sum)
	        {
	            max=sum;
	        }
	      //  System.out.println(max);
	    }
	    return max;
	}
	        
}