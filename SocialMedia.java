class SocialMedia {
	static String mediaNames[] ={"Pinterest","Reddit","YouTube","FaceBook","TikTok","WeChat","Telegram","Instagram","WhatsApp","Tumblr"};
	public static void main(String socialmedia[]) {
		//System.out.println("The Number Of mediaNames Are "+mediaNames.length);
		//System.out.println(mediaNames[0]+" "+mediaNames[1]+" "+mediaNames[2]+" "+mediaNames[3]+" "+mediaNames[4]+" "+mediaNames[5]+" "+mediaNames[6]+" "+mediaNames[7]+" "+mediaNames[8]+" "+mediaNames[9]);
	    System.out.println("Main Started");
		System.out.println("Some of the mediaNames are:");
		for ( String mediaName : mediaNames) {
			System.out.println(mediaName);
		}
		System.out.println("Main Ended");
}
}
