class Festivals {
	Festivals() {
        System.out.println("Festivals is invoked");
    }

    Festivals(String name, String month, String religion, boolean isNationalHoliday, int daysDuration) {
		System.out.println("Festivals parameterized constructor is invoked");
        this.name = name;
        this.month = month;
        this.religion = religion;
        this.isNationalHoliday = isNationalHoliday;
        this.daysDuration = daysDuration;
    }
    String name;
    String month;
    String religion;
    boolean isNationalHoliday;
    int daysDuration;
	
	public void getFestivalInfo(){
		System.out.println("name is " + name);
        System.out.println("month is " + month);
        System.out.println("religion is " + religion);
        System.out.println("isNationalHoliday is " + isNationalHoliday);
        System.out.println("daysDuration is " + daysDuration);
	}
}
