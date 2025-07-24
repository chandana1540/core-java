class CourtCaseRunner {
    public static void main(String chand []) {

        CourtCase case1 = new CourtCase();
		System.out.println("number1 is " + case1.number);
        System.out.println("defendant1 is " + case1.defendant);
        System.out.println("court1 is " + case1.court);
        System.out.println("judge1 is " + case1.judge);
        System.out.println("open1 is " + case1.open);
        System.out.println("result1 is " + case1.result);
		
        case1.number = "C001";
        case1.defendant = "Ravi";
        case1.court = "Delhi Court";
        case1.judge = "Mehta";
        case1.open = true;
        case1.result = "Pending";

        System.out.println("number1 is " + case1.number);
        System.out.println("defendant1 is " + case1.defendant);
        System.out.println("court1 is " + case1.court);
        System.out.println("judge1 is " + case1.judge);
        System.out.println("open1 is " + case1.open);
        System.out.println("result1 is " + case1.result);

        CourtCase case2 = new CourtCase();
        case2.number = "C002";
        case2.defendant = "Anil";
        case2.court = "Mumbai Court";
        case2.judge = "Roy";
        case2.open = false;
        case2.result = "Guilty";

        System.out.println("number2 is " + case2.number);
        System.out.println("defendant2 is " + case2.defendant);
        System.out.println("court2 is " + case2.court);
        System.out.println("judge2 is " + case2.judge);
        System.out.println("open2 is " + case2.open);
        System.out.println("result2 is " + case2.result);

        CourtCase case3 = new CourtCase();
        case3.number = "C003";
        case3.defendant = "Arjun";
        case3.court = "Supreme Court";
        case3.judge = "Sharma";
        case3.open = true;
        case3.result = "Pending";

        System.out.println("number3 is " + case3.number);
        System.out.println("defendant3 is " + case3.defendant);
        System.out.println("court3 is " + case3.court);
        System.out.println("judge3 is " + case3.judge);
        System.out.println("open3 is " + case3.open);
        System.out.println("result3 is " + case3.result);

        CourtCase case4 = new CourtCase();
        case4.number = "C004";
        case4.defendant = "Ramesh";
        case4.court = "Jaipur Court";
        case4.judge = "Iyer";
        case4.open = false;
        case4.result = "Not Guilty";

        System.out.println("number4 is " + case4.number);
        System.out.println("defendant4 is " + case4.defendant);
        System.out.println("court4 is " + case4.court);
        System.out.println("judge4 is " + case4.judge);
        System.out.println("open4 is " + case4.open);
        System.out.println("result4 is " + case4.result);

        CourtCase case5 = new CourtCase();
        case5.number = "C005";
        case5.defendant = "Deepak";
        case5.court = "Lucknow Court";
        case5.judge = "Sinha";
        case5.open = true;
        case5.result = "Pending";

        System.out.println("number5 is " + case5.number);
        System.out.println("defendant5 is " + case5.defendant);
        System.out.println("court5 is " + case5.court);
        System.out.println("judge5 is " + case5.judge);
        System.out.println("open5 is " + case5.open);
        System.out.println("result5 is " + case5.result);

        CourtCase case6 = new CourtCase();
        case6.number = "C006";
        case6.defendant = "Mohan";
        case6.court = "Bangalore Court";
        case6.judge = "Nair";
        case6.open = false;
        case6.result = "Closed";

        System.out.println("number6 is " + case6.number);
        System.out.println("defendant6 is " + case6.defendant);
        System.out.println("court6 is " + case6.court);
        System.out.println("judge6 is " + case6.judge);
        System.out.println("open6 is " + case6.open);
        System.out.println("result6 is " + case6.result);

        CourtCase case7 = new CourtCase();
        case7.number = "C007";
        case7.defendant = "Kiran";
        case7.court = "Hyderabad Court";
        case7.judge = "Rao";
        case7.open = true;
        case7.result = "Pending";

        System.out.println("number7 is " + case7.number);
        System.out.println("defendant7 is " + case7.defendant);
        System.out.println("court7 is " + case7.court);
        System.out.println("judge7 is " + case7.judge);
        System.out.println("open7 is " + case7.open);
        System.out.println("result7 is " + case7.result);

        CourtCase case8 = new CourtCase();
        case8.number = "C008";
        case8.defendant = "Arvind";
        case8.court = "Chennai Court";
        case8.judge = "Menon";
        case8.open = false;
        case8.result = "Guilty";

        System.out.println("number8 is " + case8.number);
        System.out.println("defendant8 is " + case8.defendant);
        System.out.println("court8 is " + case8.court);
        System.out.println("judge8 is " + case8.judge);
        System.out.println("open8 is " + case8.open);
        System.out.println("result8 is " + case8.result);

        CourtCase case9 = new CourtCase();
        case9.number = "C009";
        case9.defendant = "Rajesh";
        case9.court = "Patna Court";
        case9.judge = "Gupta";
        case9.open = true;
        case9.result = "Pending";

        System.out.println("number9 is " + case9.number);
        System.out.println("defendant9 is " + case9.defendant);
        System.out.println("court9 is " + case9.court);
        System.out.println("judge9 is " + case9.judge);
        System.out.println("open9 is " + case9.open);
        System.out.println("result9 is " + case9.result);

        CourtCase case10 = new CourtCase();
        case10.number = "C010";
        case10.defendant = "Ajay";
        case10.court = "Kolkata Court";
        case10.judge = "Das";
        case10.open = false;
        case10.result = "Not Guilty";

        System.out.println("number10 is " + case10.number);
        System.out.println("defendant10 is " + case10.defendant);
        System.out.println("court10 is " + case10.court);
        System.out.println("judge10 is " + case10.judge);
        System.out.println("open10 is " + case10.open);
        System.out.println("result10 is " + case10.result);
		
		        CourtCase case11 = new CourtCase();
        case11.number = "C011";
        case11.defendant = "Vikas";
        case11.court = "Surat Court";
        case11.judge = "Patel";
        case11.open = true;
        case11.result = "Pending";

        System.out.println("number11 is " + case11.number);
        System.out.println("defendant11 is " + case11.defendant);
        System.out.println("court11 is " + case11.court);
        System.out.println("judge11 is " + case11.judge);
        System.out.println("open11 is " + case11.open);
        System.out.println("result11 is " + case11.result);

        CourtCase case12 = new CourtCase();
        case12.number = "C012";
        case12.defendant = "Neeraj";
        case12.court = "Ahmedabad Court";
        case12.judge = "Joshi";
        case12.open = false;
        case12.result = "Guilty";

        System.out.println("number12 is " + case12.number);
        System.out.println("defendant12 is " + case12.defendant);
        System.out.println("court12 is " + case12.court);
        System.out.println("judge12 is " + case12.judge);
        System.out.println("open12 is " + case12.open);
        System.out.println("result12 is " + case12.result);

        CourtCase case13 = new CourtCase();
        case13.number = "C013";
        case13.defendant = "Kunal";
        case13.court = "Bhopal Court";
        case13.judge = "Singh";
        case13.open = true;
        case13.result = "Pending";

        System.out.println("number13 is " + case13.number);
        System.out.println("defendant13 is " + case13.defendant);
        System.out.println("court13 is " + case13.court);
        System.out.println("judge13 is " + case13.judge);
        System.out.println("open13 is " + case13.open);
        System.out.println("result13 is " + case13.result);

        CourtCase case14 = new CourtCase();
        case14.number = "C014";
        case14.defendant = "Pooja";
        case14.court = "Nagpur Court";
        case14.judge = "Deshmukh";
        case14.open = false;
        case14.result = "Not Guilty";

        System.out.println("number14 is " + case14.number);
        System.out.println("defendant14 is " + case14.defendant);
        System.out.println("court14 is " + case14.court);
        System.out.println("judge14 is " + case14.judge);
        System.out.println("open14 is " + case14.open);
        System.out.println("result14 is " + case14.result);

        CourtCase case15 = new CourtCase();
        case15.number = "C015";
        case15.defendant = "Priya";
        case15.court = "Indore Court";
        case15.judge = "Bhatia";
        case15.open = true;
        case15.result = "Pending";

        System.out.println("number15 is " + case15.number);
        System.out.println("defendant15 is " + case15.defendant);
        System.out.println("court15 is " + case15.court);
        System.out.println("judge15 is " + case15.judge);
        System.out.println("open15 is " + case15.open);
        System.out.println("result15 is " + case15.result);

        CourtCase case16 = new CourtCase();
        case16.number = "C016";
        case16.defendant = "Sunil";
        case16.court = "Chandigarh Court";
        case16.judge = "Kapoor";
        case16.open = false;
        case16.result = "Closed";

        System.out.println("number16 is " + case16.number);
        System.out.println("defendant16 is " + case16.defendant);
        System.out.println("court16 is " + case16.court);
        System.out.println("judge16 is " + case16.judge);
        System.out.println("open16 is " + case16.open);
        System.out.println("result16 is " + case16.result);

        CourtCase case17 = new CourtCase();
        case17.number = "C017";
        case17.defendant = "Alok";
        case17.court = "Goa Court";
        case17.judge = "Fernandes";
        case17.open = true;
        case17.result = "Pending";

        System.out.println("number17 is " + case17.number);
        System.out.println("defendant17 is " + case17.defendant);
        System.out.println("court17 is " + case17.court);
        System.out.println("judge17 is " + case17.judge);
        System.out.println("open17 is " + case17.open);
        System.out.println("result17 is " + case17.result);

        CourtCase case18 = new CourtCase();
        case18.number = "C018";
        case18.defendant = "Harsh";
        case18.court = "Kerala Court";
        case18.judge = "Nair";
        case18.open = false;
        case18.result = "Guilty";

        System.out.println("number18 is " + case18.number);
        System.out.println("defendant18 is " + case18.defendant);
        System.out.println("court18 is " + case18.court);
        System.out.println("judge18 is " + case18.judge);
        System.out.println("open18 is " + case18.open);
        System.out.println("result18 is " + case18.result);

        CourtCase case19 = new CourtCase();
        case19.number = "C019";
        case19.defendant = "Raj";
        case19.court = "Ranchi Court";
        case19.judge = "Prasad";
        case19.open = true;
        case19.result = "Pending";

        System.out.println("number19 is " + case19.number);
        System.out.println("defendant19 is " + case19.defendant);
        System.out.println("court19 is " + case19.court);
        System.out.println("judge19 is " + case19.judge);
        System.out.println("open19 is " + case19.open);
        System.out.println("result19 is " + case19.result);

        CourtCase case20 = new CourtCase();
        case20.number = "C020";
        case20.defendant = "Isha";
        case20.court = "Shimla Court";
        case20.judge = "Thakur";
        case20.open = false;
        case20.result = "Not Guilty";

        System.out.println("number20 is " + case20.number);
        System.out.println("defendant20 is " + case20.defendant);
        System.out.println("court20 is " + case20.court);
        System.out.println("judge20 is " + case20.judge);
        System.out.println("open20 is " + case20.open);
        System.out.println("result20 is " + case20.result);
	}
}
