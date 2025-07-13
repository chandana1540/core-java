class RadioRunner {
	public static void main (String audio[]){
		String colour = Radio.getColour();
		System.out.println("The colour of Radio is "+colour);
		int buttons = Radio.getButton();
		System.out.println("The No of Buttons are "+buttons);
		byte speedRange = Radio.getSpeedRange();
		System.out.println("The speedrange od Radio is "+speedRange);
		float volume = Radio.getVolume();
		System.out.println("The Volume of Radio is "+volume);
		boolean isSwitched = Radio.getIsSwitched();
		System.out.println("The Radio isSwitched "+isSwitched);
	}
}
	