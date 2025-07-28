class Karate {
	Karate() {
        System.out.println("Default constructor called for Karate");
    }

    Karate(String style, String beltColor, int numberOfKatas, String founder, String countryOfOrigin, boolean isOlympicSport) {
		System.out.println("Karate parameterized constructor is invoked");
        this.style = style;
        this.beltColor = beltColor;
        this.numberOfKatas = numberOfKatas;
        this.founder = founder;
        this.countryOfOrigin = countryOfOrigin;
        this.isOlympicSport = isOlympicSport;
    }
    String style;
    String beltColor;
    int numberOfKatas;
    String founder;
    String countryOfOrigin;
    boolean isOlympicSport;
	
	public void getKarateInfo(){
		System.out.println("style is " + style);
        System.out.println("beltColor is " + beltColor);
        System.out.println("numberOfKatas is " + numberOfKatas);
        System.out.println("founder is " +founder);
        System.out.println("countryOfOrigin is " + countryOfOrigin);
        System.out.println("isOlympicSport is " + isOlympicSport);
	}
}
