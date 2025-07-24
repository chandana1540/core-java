class NetworkRunner {
    public static void main(String chand[]) {
        
        Network network1 = new Network();
		System.out.println("name1 is " + network1.name);
        System.out.println("type1 is " + network1.type);
        System.out.println("provider1 is " + network1.provider);
        System.out.println("speed1 is " + network1.speed + " Mbps");
        System.out.println("isSecure1 is " + network1.isSecure);
		
        network1.name = "HomeWiFi";
        network1.type = "Wireless";
        network1.provider = "Airtel";
        network1.speed = 100.0;
        network1.isSecure = true;

        System.out.println("name1 is " + network1.name);
        System.out.println("type1 is " + network1.type);
        System.out.println("provider1 is " + network1.provider);
        System.out.println("speed1 is " + network1.speed + " Mbps");
        System.out.println("isSecure1 is " + network1.isSecure);

        Network network2 = new Network();
        network2.name = "OfficeLAN";
        network2.type = "Wired";
        network2.provider = "ACT";
        network2.speed = 200.0;
        network2.isSecure = true;

        System.out.println("name2 is " + network2.name);
        System.out.println("type2 is " + network2.type);
        System.out.println("provider2 is " + network2.provider);
        System.out.println("speed2 is " + network2.speed + " Mbps");
        System.out.println("isSecure2 is " + network2.isSecure);

        Network network3 = new Network();
        network3.name = "MobileHotspot";
        network3.type = "Wireless";
        network3.provider = "Jio";
        network3.speed = 50.0;
        network3.isSecure = true;

        System.out.println("name3 is " + network3.name);
        System.out.println("type3 is " + network3.type);
        System.out.println("provider3 is " + network3.provider);
        System.out.println("speed3 is " + network3.speed + " Mbps");
        System.out.println("isSecure3 is " + network3.isSecure);

        Network network4 = new Network();
        network4.name = "CafeNet";
        network4.type = "Wireless";
        network4.provider = "ACT";
        network4.speed = 75.0;
        network4.isSecure = false;

        System.out.println("name4 is " + network4.name);
        System.out.println("type4 is " + network4.type);
        System.out.println("provider4 is " + network4.provider);
        System.out.println("speed4 is " + network4.speed + " Mbps");
        System.out.println("isSecure4 is " + network4.isSecure);

        Network network5 = new Network();
        network5.name = "CollegeLAN";
        network5.type = "Wired";
        network5.provider = "BSNL";
        network5.speed = 500.0;
        network5.isSecure = true;

        System.out.println("name5 is " + network5.name);
        System.out.println("type5 is " + network5.type);
        System.out.println("provider5 is " + network5.provider);
        System.out.println("speed5 is " + network5.speed + " Mbps");
        System.out.println("isSecure5 is " + network5.isSecure);

        Network network6 = new Network();
        network6.name = "GuestWiFi";
        network6.type = "Wireless";
        network6.provider = "JioFiber";
        network6.speed = 30.0;
        network6.isSecure = false;

        System.out.println("name6 is " + network6.name);
        System.out.println("type6 is " + network6.type);
        System.out.println("provider6 is " + network6.provider);
        System.out.println("speed6 is " + network6.speed + " Mbps");
        System.out.println("isSecure6 is " + network6.isSecure);

        Network network7 = new Network();
        network7.name = "LibraryNet";
        network7.type = "Wired";
        network7.provider = "Hathway";
        network7.speed = 250.0;
        network7.isSecure = true;

        System.out.println("name7 is " + network7.name);
        System.out.println("type7 is " + network7.type);
        System.out.println("provider7 is " + network7.provider);
        System.out.println("speed7 is " + network7.speed + " Mbps");
        System.out.println("isSecure7 is " + network7.isSecure);

        Network network8 = new Network();
        network8.name = "LabWiFi";
        network8.type = "Wireless";
        network8.provider = "ACT";
        network8.speed = 120.0;
        network8.isSecure = true;

        System.out.println("name8 is " + network8.name);
        System.out.println("type8 is " + network8.type);
        System.out.println("provider8 is " + network8.provider);
        System.out.println("speed8 is " + network8.speed + " Mbps");
        System.out.println("isSecure8 is " + network8.isSecure);

        Network network9 = new Network();
        network9.name = "AirportNet";
        network9.type = "Wireless";
        network9.provider = "BSNL";
        network9.speed = 40.0;
        network9.isSecure = false;

        System.out.println("name9 is " + network9.name);
        System.out.println("type9 is " + network9.type);
        System.out.println("provider9 is " + network9.provider);
        System.out.println("speed9 is " + network9.speed + " Mbps");
        System.out.println("isSecure9 is " + network9.isSecure);

        Network network10 = new Network();
        network10.name = "MetroNet";
        network10.type = "Wireless";
        network10.provider = "RailWire";
        network10.speed = 20.0;
        network10.isSecure = false;

        System.out.println("name10 is " + network10.name);
        System.out.println("type10 is " + network10.type);
        System.out.println("provider10 is " + network10.provider);
        System.out.println("speed10 is " + network10.speed + " Mbps");
        System.out.println("isSecure10 is " + network10.isSecure);

        Network network11 = new Network();
        network11.name = "EventWiFi";
        network11.type = "Wireless";
        network11.provider = "Jio";
        network11.speed = 60.0;
        network11.isSecure = false;

        System.out.println("name11 is " + network11.name);
        System.out.println("type11 is " + network11.type);
        System.out.println("provider11 is " + network11.provider);
        System.out.println("speed11 is " + network11.speed + " Mbps");
        System.out.println("isSecure11 is " + network11.isSecure);

        Network network12 = new Network();
        network12.name = "ParkNet";
        network12.type = "Wireless";
        network12.provider = "Airtel";
        network12.speed = 25.0;
        network12.isSecure = false;

        System.out.println("name12 is " + network12.name);
        System.out.println("type12 is " + network12.type);
        System.out.println("provider12 is " + network12.provider);
        System.out.println("speed12 is " + network12.speed + " Mbps");
        System.out.println("isSecure12 is " + network12.isSecure);

        Network network13 = new Network();
        network13.name = "MallWiFi";
        network13.type = "Wireless";
        network13.provider = "ACT";
        network13.speed = 80.0;
        network13.isSecure = false;

        System.out.println("name13 is " + network13.name);
        System.out.println("type13 is " + network13.type);
        System.out.println("provider13 is " + network13.provider);
        System.out.println("speed13 is " + network13.speed + " Mbps");
        System.out.println("isSecure13 is " + network13.isSecure);

        Network network14 = new Network();
        network14.name = "StadiumNet";
        network14.type = "Wireless";
        network14.provider = "BSNL";
        network14.speed = 45.0;
        network14.isSecure = false;

        System.out.println("name14 is " + network14.name);
        System.out.println("type14 is " + network14.type);
        System.out.println("provider14 is " + network14.provider);
        System.out.println("speed14 is " + network14.speed + " Mbps");
        System.out.println("isSecure14 is " + network14.isSecure);

        Network network15 = new Network();
        network15.name = "PublicHotspot";
        network15.type = "Wireless";
        network15.provider = "RailWire";
        network15.speed = 10.0;
        network15.isSecure = false;

        System.out.println("name15 is " + network15.name);
        System.out.println("type15 is " + network15.type);
        System.out.println("provider15 is " + network15.provider);
        System.out.println("speed15 is " + network15.speed + " Mbps");
        System.out.println("isSecure15 is " + network15.isSecure);

        Network network16 = new Network();
        network16.name = "HostelLAN";
        network16.type = "Wired";
        network16.provider = "Hathway";
        network16.speed = 150.0;
        network16.isSecure = true;

        System.out.println("name16 is " + network16.name);
        System.out.println("type16 is " + network16.type);
        System.out.println("provider16 is " + network16.provider);
        System.out.println("speed16 is " + network16.speed + " Mbps");
        System.out.println("isSecure16 is " + network16.isSecure);

        Network network17 = new Network();
        network17.name = "HospitalNet";
        network17.type = "Wireless";
        network17.provider = "ACT";
        network17.speed = 70.0;
        network17.isSecure = true;

        System.out.println("name17 is " + network17.name);
        System.out.println("type17 is " + network17.type);
        System.out.println("provider17 is " + network17.provider);
        System.out.println("speed17 is " + network17.speed + " Mbps");
        System.out.println("isSecure17 is " + network17.isSecure);

        Network network18 = new Network();
        network18.name = "RailwayNet";
        network18.type = "Wireless";
        network18.provider = "RailWire";
        network18.speed = 15.0;
        network18.isSecure = false;

        System.out.println("name18 is " + network18.name);
        System.out.println("type18 is " + network18.type);
        System.out.println("provider18 is " + network18.provider);
        System.out.println("speed18 is " + network18.speed + " Mbps");
        System.out.println("isSecure18 is " + network18.isSecure);

        Network network19 = new Network();
        network19.name = "TempleWiFi";
        network19.type = "Wireless";
        network19.provider = "JioFiber";
        network19.speed = 20.0;
        network19.isSecure = false;

        System.out.println("name19 is " + network19.name);
        System.out.println("type19 is " + network19.type);
        System.out.println("provider19 is " + network19.provider);
        System.out.println("speed19 is " + network19.speed + " Mbps");
        System.out.println("isSecure19 is " + network19.isSecure);

        Network network20 = new Network();
        network20.name = "GymNet";
        network20.type = "Wireless";
        network20.provider = "Airtel";
        network20.speed = 35.0;
        network20.isSecure = true;

        System.out.println("name20 is " + network20.name);
        System.out.println("type20 is " + network20.type);
        System.out.println("provider20 is " + network20.provider);
        System.out.println("speed20 is " + network20.speed + " Mbps");
        System.out.println("isSecure20 is " + network20.isSecure);
}
}