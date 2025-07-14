class BannerRunner{
	public static void main(String chand[]){
		String type = Banner.getType();
		System.out.println("The type of Banner is "+type);
        short noOfBanners = Banner.getBannerNos();
        System.out.println("The no of banners are "+noOfBanners);
        int length = Banner.getLength();
        System.out.println("The length of this banner is "+length);
		double clarityRange = Banner.getClarityRange();
		System.out.println("The Clarity of this banner is "+clarityRange);
		boolean isPrinted = Banner.getPrinted();
		System.out.println("The banner is printed "+isPrinted);
	}
}
