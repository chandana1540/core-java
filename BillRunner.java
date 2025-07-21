class BillRunner {
	public static void main(String chandu[]){
		System.out.println("The Main is Started");
		
		Bill FirstBill = new Bill();
		FirstBill.planType = "Periodic Billing";
		FirstBill.BillisPaid = true;
		FirstBill.BillAmountWithTax = 350.90;
		FirstBill.BillDueDate = "21-06-2025";
        FirstBill.BillId = 4;
		
		System.out.println("The FirstBill is "+FirstBill.planType);
		System.out.println("The FirstBill is "+FirstBill.BillisPaid);
		System.out.println("The FirstBill is "+FirstBill.BillAmountWithTax);
		System.out.println("The FirstBill is "+FirstBill.BillDueDate);
		System.out.println("The FirstBill is "+FirstBill.BillId);
		
		Bill SecondBill = new Bill();
		SecondBill.planType = "Milestone Billing";
		SecondBill.BillisPaid = true;
		SecondBill.BillAmountWithTax = 400.98;
		SecondBill.BillDueDate = "17-08-2025";
		SecondBill.BillId = 2;
		
		System.out.println("The SecondBill is "+SecondBill.planType);
		System.out.println("The SecondBill is "+SecondBill.BillisPaid);
		System.out.println("The SecondBill is "+SecondBill.BillAmountWithTax);
		System.out.println("The SecondBill is "+SecondBill.BillDueDate);
		System.out.println("The SecondBill is "+SecondBill.BillId);
		
		Bill ThirdBill = new Bill();
		ThirdBill.planType = "Quantum Billing";
		ThirdBill.BillisPaid = false;
		ThirdBill.BillAmountWithTax = 450.00;
		ThirdBill.BillDueDate = "19-05-2025";
        ThirdBill.BillId = 7;
		
		System.out.println("The ThirdBill is "+ThirdBill.planType);
		System.out.println("The ThirdBill is "+ThirdBill.BillisPaid);
		System.out.println("The ThirdBill is "+ThirdBill.BillAmountWithTax);
		System.out.println("The ThirdBill is "+ThirdBill.BillDueDate);
		System.out.println("The ThirdBill is "+ThirdBill.BillId);
		
		Bill FourthBill = new Bill();
		FourthBill.planType = "pentox Billing";
		FourthBill.BillisPaid = true;
		FourthBill.BillAmountWithTax = 450.00;
		FourthBill.BillDueDate = "4-06-2025";
        FourthBill.BillId = 6;
		
		System.out.println("The FourthBill is "+FourthBill.planType);
		System.out.println("The FourthBill is "+FourthBill.BillisPaid);
		System.out.println("The FourthBill is "+FourthBill.BillAmountWithTax);
		System.out.println("The FourthBill is "+FourthBill.BillDueDate);
		System.out.println("The FourthBill is "+FourthBill.BillId);
		
		Bill FifthBill = new Bill();
		FifthBill.planType = "Manual Billing";
		FifthBill.BillisPaid = false;
		FifthBill.BillAmountWithTax = 500.50;
		FifthBill.BillDueDate = "24-04-2025";
        FifthBill.BillId = 3;
		
		System.out.println("The FifthBill is "+FifthBill.planType);
		System.out.println("The FifthBill is "+FifthBill.BillisPaid);
		System.out.println("The FifthBill is "+FifthBill.BillAmountWithTax);
		System.out.println("The FifthBill is "+FifthBill.BillDueDate);
		System.out.println("The FifthBill is "+FifthBill.BillId);
		
		Bill SixthBill = new Bill();
		SixthBill.planType = "prepaid Billing";
		SixthBill.BillisPaid = true;
		SixthBill.BillAmountWithTax = 350.40;
		SixthBill.BillDueDate = "11-06-2025";
        SixthBill.BillId = 5;
		
		System.out.println("The SixthBill is "+SixthBill.planType);
		System.out.println("The SixthBill is "+SixthBill.BillisPaid);
		System.out.println("The SixthBill is "+SixthBill.BillAmountWithTax);
		System.out.println("The SixthBill is "+SixthBill.BillDueDate);
		System.out.println("The SixthBill is "+SixthBill.BillId);
		
		Bill SeventhBill = new Bill();
		SeventhBill.planType = "postpaid Billing";
		SeventhBill.BillisPaid = true;
		SeventhBill.BillAmountWithTax = 540.00;
		SeventhBill.BillDueDate = "29-06-2025";
        SeventhBill.BillId = 9;
		
		System.out.println("The SeventhBill is "+SeventhBill.planType);
		System.out.println("The SeventhBill is "+SeventhBill.BillisPaid);
		System.out.println("The SeventhBill is "+SeventhBill.BillAmountWithTax);
		System.out.println("The SeventhBill is "+SeventhBill.BillDueDate);
		System.out.println("The SeventhBill is "+SeventhBill.BillId);
		
		Bill EighthBill = new Bill();
		EighthBill.planType = "proxy Billing";
		EighthBill.BillisPaid = false;
		EighthBill.BillAmountWithTax = 245.00;
		EighthBill.BillDueDate = "09-04-2025";
        EighthBill.BillId = 7;
		
		System.out.println("The EighthBill is "+EighthBill.planType);
		System.out.println("The EighthBill is "+EighthBill.BillisPaid);
		System.out.println("The EighthBill is "+EighthBill.BillAmountWithTax);
		System.out.println("The EighthBill is "+EighthBill.BillDueDate);
		System.out.println("The EighthBill is "+EighthBill.BillId);
		
		Bill ninthBill = new Bill();
		ninthBill.planType = "macro Billing";
		ninthBill.BillisPaid = true;
		ninthBill.BillAmountWithTax = 650.10;
		ninthBill.BillDueDate = "15-04-2025";
        ninthBill.BillId = 1;
		
		System.out.println("The ninthBill is "+ninthBill.planType);
		System.out.println("The ninthBill is "+ninthBill.BillisPaid);
		System.out.println("The ninthBill is "+ninthBill.BillAmountWithTax);
		System.out.println("The ninthBill is "+ninthBill.BillDueDate);
		System.out.println("The ninthBill is "+ninthBill.BillId);
		
		Bill TenthBill = new Bill();
		TenthBill.planType = "Mini Billing";
		TenthBill.BillisPaid = false;
		TenthBill.BillAmountWithTax = 350.40;
		TenthBill.BillDueDate = "14-02-2025";
        TenthBill.BillId = 10;
		
		System.out.println("The TenthBill is "+TenthBill.planType);
		System.out.println("The TenthBill is "+TenthBill.BillisPaid);
		System.out.println("The TenthBill is "+TenthBill.BillAmountWithTax);
		System.out.println("The TenthBill is "+TenthBill.BillDueDate);
		System.out.println("The TenthBill is "+TenthBill.BillId);
		
		Bill ElventhBill = new Bill();
		ElventhBill.planType = "prepaid Billing";
		ElventhBill.BillisPaid = true;
		ElventhBill.BillAmountWithTax = 350.40;
		ElventhBill.BillDueDate = "11-06-2025";
        ElventhBill.BillId = 5;
		
		System.out.println("The ElventhBill is "+ElventhBill.planType);
		System.out.println("The ElventhBill is "+ElventhBill.BillisPaid);
		System.out.println("The ElventhBill is "+ElventhBill.BillAmountWithTax);
		System.out.println("The ElventhBill is "+ElventhBill.BillDueDate);
		System.out.println("The ElventhBill is "+ElventhBill.BillId);
		
		Bill TvelthBill = new Bill();
		TvelthBill.planType = "Nacro Billing";
		TvelthBill.BillisPaid = true;
		TvelthBill.BillAmountWithTax = 574.10;
		TvelthBill.BillDueDate = "06-07-2025";
        TvelthBill.BillId = 11;
		
		System.out.println("The TvelthBill is "+TvelthBill.planType);
		System.out.println("The TvelthBill is "+TvelthBill.BillisPaid);
		System.out.println("The TvelthBill is "+TvelthBill.BillAmountWithTax);
		System.out.println("The TvelthBill is "+TvelthBill.BillDueDate);
		System.out.println("The TvelthBill is "+TvelthBill.BillId);
		
		Bill ThirteenthBill = new Bill();
		ThirteenthBill.planType = "Sales Billing";
		ThirteenthBill.BillisPaid = true;
		ThirteenthBill.BillAmountWithTax = 250.40;
		ThirteenthBill.BillDueDate = "04-05-2025";
        ThirteenthBill.BillId = 12;
		
		System.out.println("The ThirteenthBill is "+ThirteenthBill.planType);
		System.out.println("The ThirteenthBill is "+ThirteenthBill.BillisPaid);
		System.out.println("The ThirteenthBill is "+ThirteenthBill.BillAmountWithTax);
		System.out.println("The ThirteenthBill is "+ThirteenthBill.BillDueDate);
		System.out.println("The ThirteenthBill is "+ThirteenthBill.BillId);
		
		Bill FourteenthBill = new Bill();
		FourteenthBill.planType = "Reatil Billing";
		FourteenthBill.BillisPaid = true;
		FourteenthBill.BillAmountWithTax = 840.00;
		FourteenthBill.BillDueDate = "02-03-2025";
        FourteenthBill.BillId = 14;
		
		System.out.println("The FourteenthBill is "+FourteenthBill.planType);
		System.out.println("The FourteenthBill is "+FourteenthBill.BillisPaid);
		System.out.println("The FourteenthBill is "+FourteenthBill.BillAmountWithTax);
		System.out.println("The FourteenthBill is "+FourteenthBill.BillDueDate);
		System.out.println("The FourteenthBill is "+FourteenthBill.BillId);
		
		Bill FifteenthBill = new Bill();
		FifteenthBill.planType = "Design Billing";
		FifteenthBill.BillisPaid = false;
		FifteenthBill.BillAmountWithTax = 655.25;
		FifteenthBill.BillDueDate = "11-06-2025";
        FifteenthBill.BillId = 13;
		
		System.out.println("The FifteenthBill is "+FifteenthBill.planType);
		System.out.println("The FifteenthBill is "+FifteenthBill.BillisPaid);
		System.out.println("The FifteenthBill is "+FifteenthBill.BillAmountWithTax);
		System.out.println("The FifteenthBill is "+FifteenthBill.BillDueDate);
		System.out.println("The FifteenthBill is "+FifteenthBill.BillId);
		
		Bill SixteenthBill = new Bill();
		SixteenthBill.planType = "Design Billing";
		SixteenthBill.BillisPaid = true;
		SixteenthBill.BillAmountWithTax = 450.15;
		SixteenthBill.BillDueDate = "16-07-2025";
        SixteenthBill.BillId = 16;
		
		System.out.println("The SixteenthBill is "+SixteenthBill.planType);
		System.out.println("The SixteenthBill is "+SixteenthBill.BillisPaid);
		System.out.println("The SixteenthBill is "+SixteenthBill.BillAmountWithTax);
		System.out.println("The SixteenthBill is "+SixteenthBill.BillDueDate);
		System.out.println("The SixteenthBill is "+SixteenthBill.BillId);
		
		Bill SeventeenthBill = new Bill();
		SeventeenthBill.planType = "Design Billing";
		SeventeenthBill.BillisPaid = true;
		SeventeenthBill.BillAmountWithTax = 450.15;
		SeventeenthBill.BillDueDate = "16-07-2025";
        SeventeenthBill.BillId = 17;
		
		System.out.println("The SeventeenthBill is "+SeventeenthBill.planType);
		System.out.println("The SeventeenthBill is "+SeventeenthBill.BillisPaid);
		System.out.println("The SeventeenthBill is "+SeventeenthBill.BillAmountWithTax);
		System.out.println("The SeventeenthBill is "+SeventeenthBill.BillDueDate);
		System.out.println("The SeventeenthBill is "+SeventeenthBill.BillId);
		
		Bill EighteenthBill = new Bill();
		EighteenthBill.planType = "mart Billing";
		EighteenthBill.BillisPaid = true;
		EighteenthBill.BillAmountWithTax = 360.15;
		EighteenthBill.BillDueDate = "08-02-2025";
        EighteenthBill.BillId = 18;
		
		System.out.println("The EighteenthBill is "+EighteenthBill.planType);
		System.out.println("The EighteenthBill is "+EighteenthBill.BillisPaid);
		System.out.println("The EighteenthBill is "+EighteenthBill.BillAmountWithTax);
		System.out.println("The EighteenthBill is "+EighteenthBill.BillDueDate);
		System.out.println("The EighteenthBill is "+EighteenthBill.BillId);
		
		Bill NineteenthBill = new Bill();
		NineteenthBill.planType = "macro Billing";
		NineteenthBill.BillisPaid = true;
		NineteenthBill.BillAmountWithTax = 640.15;
		NineteenthBill.BillDueDate = "20-06-2025";
        NineteenthBill.BillId = 19;
		
		System.out.println("The NineteenthBill is "+NineteenthBill.planType);
		System.out.println("The NineteenthBill is "+NineteenthBill.BillisPaid);
		System.out.println("The NineteenthBill is "+NineteenthBill.BillAmountWithTax);
		System.out.println("The NineteenthBill is "+NineteenthBill.BillDueDate);
		System.out.println("The NineteenthBill is "+NineteenthBill.BillId);
		
		Bill TwentyteethBill = new Bill();
		TwentyteethBill.planType = "sacro Billing";
		TwentyteethBill.BillisPaid = false;
		TwentyteethBill.BillAmountWithTax = 440.25;
		TwentyteethBill.BillDueDate = "28-05-2025";
        TwentyteethBill.BillId = 20;
		
		System.out.println("The TwentyteethBill is "+TwentyteethBill.planType);
		System.out.println("The TwentyteethBill is "+TwentyteethBill.BillisPaid);
		System.out.println("The TwentyteethBill is "+TwentyteethBill.BillAmountWithTax);
		System.out.println("The TwentyteethBill is "+TwentyteethBill.BillDueDate);
		System.out.println("The TwentyteethBill is "+TwentyteethBill.BillId);

		System.out.println("The Main is Ended");
	}
}


