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

		int first = Integer.parseInt(args[0]);
		int last = Integer.parseInt(args[args.length-1]);
		System.out.print(summation.sum(first, last));
	}
}