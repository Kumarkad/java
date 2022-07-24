// searching in an array
class Main {
	public static void main(String[] args) {
		int [] arr = {73,78,2,72,84,9292,61,91};
		int ans =searchele(arr,874);
	System.out.println(ans);	
		
	}
	static int searchele(int [] arr,int target)
	{
	    for(int i :arr)
	    {
	        if (i==target)
	        {
	            return i;
	        }
	    }
	    return -1;
	}
}