class Network {
	Network() {
        System.out.println("Network is invoked");
    }

    Network(String name, String type, String provider, double speed, boolean isSecure) {
        System.out.println("Network parameterized constructor is invoked");
        this.name = name;
        this.type = type;
        this.provider = provider;
        this.speed = speed;
        this.isSecure = isSecure;
    }
    String name;
    String type;
    String provider;
    double speed;
    boolean isSecure;
	
	public void getNetInfo(){
		System.out.println("name is " + name);
        System.out.println("type is " +type);
        System.out.println("provider is " +provider);
        System.out.println("speed is " + speed + " Mbps");
        System.out.println("isSecure is " + isSecure);
	}
}
