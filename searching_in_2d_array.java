// find the element in 2d array

class Main {
	public static void main(String[] args) {
		int [][] arr ={ {2,4,7},{4,7,9},{67,72,8,73}};
		int ans =searchele(arr,77);
		System.out.print(ans);
		
		
	}
	static int searchele(int[][] arr,int target)
	{
	    for(int i =0;i<arr.length;i++)
	    {
	        for(int j =0;j<arr[i].length;j++)
	        {
	            if (arr[i][j]==target)
	            {
	                return arr[i][j];
	            }
	        }
	    }
	    return -1;
}
}