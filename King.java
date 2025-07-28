class King {
	King() {
        System.out.println("King is Invoked");
    }

    King(String name, String kingdom, int age, int reignYears, String spouseName, boolean isAlive) {
		System.out.println("King parameterized constructor is invoked");
        this.name = name;
        this.kingdom = kingdom;
        this.age = age;
        this.reignYears = reignYears;
        this.spouseName = spouseName;
        this.isAlive = isAlive;
    }
    String name;
    String kingdom;
    int age;
    int reignYears;
    String spouseName;
    boolean isAlive;
	
	public void getKingInfo(){
		System.out.println("name is " + name);
        System.out.println("kingdom is " + kingdom);
        System.out.println("age is " + age);
        System.out.println("reignYears is " + reignYears);
        System.out.println("spouseName is " + spouseName);
        System.out.println("isAlive is " + isAlive);
	}
}