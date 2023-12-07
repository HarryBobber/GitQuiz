public class Implementation {

	public static void main(String[] args){
		Summation summation = (int first, int last) ->
		{
			int finalSum = 0;
			for(int i = first; i <= last; i ++) {
				finalSum += i;
			}
			return finalSum;
		};
	}
}