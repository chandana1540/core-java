class Politician {
	 Politician() {
        System.out.println("Politician is invoked");
    }

    Politician(String name, String party, String constituency, int age, int yearsInPolitics, boolean isMinister) {
		System.out.println("Politician parameterized constructor is invoked");
        this.name = name;
        this.party = party;
        this.constituency = constituency;
        this.age = age;
        this.yearsInPolitics = yearsInPolitics;
        this.isMinister = isMinister;
    }
    String name;
    String party;
    String constituency;
    int age;
    int yearsInPolitics;
    boolean isMinister;
	
	public void getPoliticianInfo(){
	    System.out.println("name is " + name);
        System.out.println("party is " + party);
        System.out.println("constituency is " + constituency);
        System.out.println("age is " + age);
        System.out.println("yearsInPolitics is " +yearsInPolitics);
        System.out.println("isMinister is " + isMinister);
	}
		
}
