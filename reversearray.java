
public class reversearray {

	public static void main(String[] args) {
		int [] array={1,2,3,4,5,6};
		int [] result=new int[array.length];
		for(int i=0; i<array.length; i++)
		{
			System.out.print(" "+ array[i]);
			
		}
		for(int i=0,j=result.length-1; i<array.length; i++,j--)
		{
			result[j]=array[i];
			System.out.print(" "+ result[i]);	
		}
		
		// TODO Auto-generated method stub

	}

}
