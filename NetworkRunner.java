class NetworkRunner {
    public static void main(String chandu[]) {

        Network network1 = new Network("HomeWiFi", "Wireless", "Airtel", 100.0, true);
        network1.getNetInfo();

        Network network2 = new Network("OfficeLAN", "Wired", "ACT", 200.0, true);
        network2.getNetInfo();

        Network network3 = new Network("MobileHotspot", "Wireless", "Jio", 50.0, true);
        network3.getNetInfo();

        Network network4 = new Network("CafeNet", "Wireless", "ACT", 75.0, false);
        network4.getNetInfo();

        Network network5 = new Network("CollegeLAN", "Wired", "BSNL", 500.0, true);
        network5.getNetInfo();

        Network network6 = new Network("GuestWiFi", "Wireless", "JioFiber", 30.0, false);
        network6.getNetInfo();

        Network network7 = new Network("LibraryNet", "Wired", "Hathway", 250.0, true);
        network7.getNetInfo();

        Network network8 = new Network("LabWiFi", "Wireless", "ACT", 120.0, true);
        network8.getNetInfo();

        Network network9 = new Network("AirportNet", "Wireless", "BSNL", 40.0, false);
        network9.getNetInfo();

        Network network10 = new Network("MetroNet", "Wireless", "RailWire", 20.0, false);
        network10.getNetInfo();

        Network network11 = new Network("EventWiFi", "Wireless", "Jio", 60.0, false);
        network11.getNetInfo();

        Network network12 = new Network("ParkNet", "Wireless", "Airtel", 25.0, false);
        network12.getNetInfo();

        Network network13 = new Network("MallWiFi", "Wireless", "ACT", 80.0, false);
        network13.getNetInfo();

        Network network14 = new Network("StadiumNet", "Wireless", "BSNL", 45.0, false);
        network14.getNetInfo();

        Network network15 = new Network("PublicHotspot", "Wireless", "RailWire", 10.0, false);
        network15.getNetInfo();

        Network network16 = new Network("HostelLAN", "Wired", "Hathway", 150.0, true);
        network16.getNetInfo();

        Network network17 = new Network("HospitalNet", "Wireless", "ACT", 70.0, true);
        network17.getNetInfo();

        Network network18 = new Network("RailwayNet", "Wireless", "RailWire", 15.0, false);
        network18.getNetInfo();

        Network network19 = new Network("TempleWiFi", "Wireless", "JioFiber", 20.0, false);
        network19.getNetInfo();

        Network network20 = new Network("GymNet", "Wireless", "Airtel", 35.0, true);
        network20.getNetInfo();
    }
}
