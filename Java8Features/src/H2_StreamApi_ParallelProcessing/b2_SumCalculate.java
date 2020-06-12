package H2_StreamApi_ParallelProcessing;

public class b2_SumCalculate {

	private int sum;//mutable object

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
	public void doSum(int input) {
		sum+=input;
	}
}
