class SignalRunner {
	public static void main(String signal[]){
		int noOfSignals = Signal.getNoOfSignals();
		System.out.println("The noOfSignals are "+noOfSignals);
		String type = Signal.getType();
		System.out.println("The Type of a signal is"+type);
		float length = Signal.getLength();
		System.out.println("The Length of signal is "+length);
		byte range = Signal.getRange();
		System.out.println("The Range of Signal is "+range);
		boolean isTraffic = Signal.getIsTraffic();
		System.out.println("The traffic is jamed "+isTraffic);
	}
}

