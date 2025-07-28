class CoinsRunner {
    public static void main(String chandu[]) {
        Coins coin1 = new Coins("India", 1.00, "Steel", 22.0, 3.09, 2010, false);
        coin1.getCoinsInfo();

        Coins coin2 = new Coins("India", 2.00, "Steel", 25.0, 4.85, 2011, false);
        coin2.getCoinsInfo();

        Coins coin3 = new Coins("India", 5.00, "Nickel Brass", 23.0, 6.0, 2012, false);
        coin3.getCoinsInfo();

        Coins coin4 = new Coins("India", 10.00, "Bimetallic", 27.0, 7.7, 2013, false);
        coin4.getCoinsInfo();

        Coins coin5 = new Coins("India", 20.00, "Bimetallic", 27.0, 8.54, 2014, false);
        coin5.getCoinsInfo();

        Coins coin6 = new Coins("USA", 0.25, "Copper Nickel", 24.26, 5.67, 2000, true);
        coin6.getCoinsInfo();

        Coins coin7 = new Coins("USA", 0.10, "Copper Nickel", 17.91, 2.27, 1999, false);
        coin7.getCoinsInfo();

        Coins coin8 = new Coins("Canada", 1.00, "Nickel", 26.5, 7.0, 2015, false);
        coin8.getCoinsInfo();

        Coins coin9 = new Coins("Canada", 2.00, "Bimetallic", 28.0, 7.3, 2016, true);
        coin9.getCoinsInfo();

        Coins coin10 = new Coins("Australia", 0.50, "Copper Nickel", 31.65, 15.55, 2010, false);
        coin10.getCoinsInfo();

        Coins coin11 = new Coins("Australia", 2.00, "Aluminium Bronze", 20.5, 6.6, 2014, true);
        coin11.getCoinsInfo();

        Coins coin12 = new Coins("UK", 1.00, "Nickel Brass", 23.43, 9.5, 2017, false);
        coin12.getCoinsInfo();

        Coins coin13 = new Coins("UK", 2.00, "Bimetallic", 28.4, 12.0, 2018, true);
        coin13.getCoinsInfo();

        Coins coin14 = new Coins("Japan", 100, "Copper Nickel", 22.6, 4.8, 2015, false);
        coin14.getCoinsInfo();

        Coins coin15 = new Coins("Japan", 500, "Nickel Brass", 26.5, 7.0, 2019, true);
        coin15.getCoinsInfo();

        Coins coin16 = new Coins("Germany", 2.00, "Bimetallic", 25.75, 8.5, 2020, true);
        coin16.getCoinsInfo();

        Coins coin17 = new Coins("France", 1.00, "Bimetallic", 23.25, 7.5, 2018, false);
        coin17.getCoinsInfo();

        Coins coin18 = new Coins("Italy", 2.00, "Bimetallic", 25.75, 8.5, 2017, true);
        coin18.getCoinsInfo();

        Coins coin19 = new Coins("China", 1.00, "Nickel Plated Steel", 25.0, 6.1, 2016, false);
        coin19.getCoinsInfo();

        Coins coin20 = new Coins("Singapore", 1.00, "Bimetallic", 24.65, 6.0, 2021, true);
        coin20.getCoinsInfo();
	}
}
