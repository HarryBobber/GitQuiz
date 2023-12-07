public class Implementation implements Summation {

	public int sum(int first, int last) {
		int finalSum = 0;
		for(int i = first; i <= last; i ++) {
			finalSum += i;
		}
		return finalSum;
	}

}