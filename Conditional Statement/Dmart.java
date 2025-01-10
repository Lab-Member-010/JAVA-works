import java.util.Scanner;
public class Dmart {
    public static void main(String[] args) {
        //Scanner Object
        Scanner scn=new Scanner(System.in);

        //Customer's Name and Gender Input
        System.out.print("Enter Customer Name: ");
        String name=scn.next();

        System.out.print("Enter Customer Gender: ");
        char gender=scn.next().charAt(0);

        //Item-1Entries
        System.out.print("ITEM-1 Name: ");
        String item1=scn.next();
        System.out.print("ITEM-1 Quantity: ");
        double quantity1 = scn.nextDouble();
        System.out.print("ITEM-1 Price: ");
        double price1=scn.nextDouble();

        //Item-2 Entries
        System.out.print("ITEM-2 Name: ");
        String item2=scn.next();
        System.out.print("ITEM-2 Quantity: ");
        double quantity2 = scn.nextDouble();
        System.out.print("ITEM-2 Price: ");
        double price2=scn.nextDouble();

        //Item-3 Entries
        System.out.print("ITEM-3 Name: ");
        String item3=scn.next();
        System.out.print("ITEM-3 Quantity: ");
        double quantity3 = scn.nextDouble();
        System.out.print("ITEM-3 Price: ");
        double price3=scn.nextDouble();

        //Item-4 Entries
        System.out.print("ITEM-4 Name: ");
        String item4=scn.next();
        System.out.print("ITEM-4 Quantity: ");
        double quantity4 = scn.nextDouble();
        System.out.print("ITEM-4 Price: ");
        double price4=scn.nextDouble();

        //Item-5 Entries
        System.out.print("ITEM-5 Name: ");
        String item5=scn.next();
        System.out.print("ITEM-5 Quantity: ");
        double quantity5 = scn.nextDouble();
        System.out.print("ITEM-5 Price: ");
        double price5=scn.nextDouble();

        //Item-6 Entries
        System.out.print("ITEM-6 Name: ");
        String item6=scn.next();
        System.out.print("ITEM-6 Quantity: ");
        double quantity6 = scn.nextDouble();
        System.out.print("ITEM-6 Price: ");
        double price6=scn.nextDouble();

        //Item-7 Entries
        System.out.print("ITEM-7 Name: ");
        String item7=scn.next();
        System.out.print("ITEM-7 Quantity: ");
        double quantity7 = scn.nextDouble();
        System.out.print("ITEM-7 Price: ");
        double price7=scn.nextDouble();

        //Item-8 Entries
        System.out.print("ITEM-8 Name: ");
        String item8=scn.next();
        System.out.print("ITEM-8 Quantity: ");
        double quantity8 = scn.nextDouble();
        System.out.print("ITEM-8 Price: ");
        double price8=scn.nextDouble();

        //Item-9 Entries
        System.out.print("ITEM-9 Name: ");
        String item9=scn.next();
        System.out.print("ITEM-9 Quantity: ");
        double quantity9 = scn.nextDouble();
        System.out.print("ITEM-9 Price: ");
        double price9=scn.nextDouble();

        //Item-10 Entries
        System.out.print("ITEM-10 Name: ");
        String item10=scn.next();
        System.out.print("ITEM-10 Quantity: ");
        double quantity10 = scn.nextDouble();
        System.out.print("ITEM-10 Price: ");
        double price10=scn.nextDouble();

        //Carry Bag
        System.out.print("Do you need Carry Bag?  :  Y/N  :");
        char carry=scn.next().charAt(0);

        //Total Price Calculation for item-1
        double total1=quantity1*price1;
        double discount1;
        if(quantity1>4){
            discount1=total1-((total1*5)/100);
        }else{
            discount1=total1;
        }
        
        //Total Price Calculation for item-2
        double total2=quantity2*price2;
        double discount2=total2;

        //Total Price Calculation for item-3
        double total3=quantity3*price3;
        double discount3=total3;        
        
        //Total Price Calculation for item-4
        double total4=quantity4*price4;
        double discount4=total4;

        //Total Price Calculation for item-5
        double total5=quantity5*price5;
        double discount5=total5-((total5*10)/100);


        //Total Price Calculation for item-6
        double total6=quantity6*price6;
        double discount6=total6;

        //Total Price Calculation for item-7
        double total7=quantity7*price7;
        double discount7=total7;

        //Total Price Calculation for item-8
        double total8=quantity8*price8;
        double discount8=total8;

        //Total Price Calculation for item-9
        double total9=quantity9*price9;
        double discount9=total9;

        //Total Price Calculation for item-10
        double total10=quantity10*price10;
        double discount10=total10-((total10*15)/100);
        
        //Grand Total
        double total=total1+total2+total3+total4+total5+total6+total7+total8+total9+total10;
        double discount_total=discount1+discount2+discount3+discount4+discount5+discount6+discount7+discount8+discount9+discount10;
        
        //let's start printing bill
        System.out.print("\t \t \tDmart\n");
        System.out.print("Name:  "+name+"\t \t \t \tDate: 22/5/2024\n");
        System.out.print("---------------------------------------------------------------\n");
        System.out.print("Item\t\tQuantity\tPrice\tTotal\tAfter Discount\n");
        System.out.print("---------------------------------------------------------------\n");
        System.out.print(item1+"\t\t"+quantity1+"\t  \t"+price1+"\t"+total1+"\t"+discount1+"\n");
        System.out.print(item2+"\t\t"+quantity2+"\t  \t"+price2+"\t"+total2+"\t"+discount2+"\n");
        System.out.print(item3+"\t\t"+quantity3+"\t  \t"+price3+"\t"+total3+"\t"+discount3+"\n");
        System.out.print(item4+"\t\t"+quantity4+"\t  \t"+price4+"\t"+total4+"\t"+discount4+"\n");
        System.out.print(item5+"\t\t"+quantity5+"\t  \t"+price5+"\t"+total5+"\t"+discount5+"\n");
        System.out.print(item6+"\t\t"+quantity6+"\t  \t"+price6+"\t"+total6+"\t"+discount6+"\n");
        System.out.print(item7+"\t\t"+quantity7+"\t  \t"+price7+"\t"+total7+"\t"+discount7+"\n");
        System.out.print(item8+"\t\t"+quantity8+"\t  \t"+price8+"\t"+total8+"\t"+discount8+"\n");
        System.out.print(item9+"\t\t"+quantity9+"\t  \t"+price9+"\t"+total9+"\t"+discount9+"\n");
        System.out.print(item10+"\t\t"+quantity10+"\t  \t"+price10+"\t"+total10+"\t"+discount10+"\n");
        System.out.print("---------------------------------------------------------------\n");
        System.out.print("\t\t\t\t\tA.P.\tD.P.\n");
        System.out.print("Total\t\t\t\t\t"+total+"\t"+discount_total+"\n");
        
        
        //Gender Gift print
        if(gender=='m' || gender=='M'){
        	System.out.print("Gift:- Wallet\t\t\t\t0.0\t0.0\n");
        }else if(gender=='f' || gender=='F'){
        	System.out.print("Gift:- Cadbury\t\t\t\t0.0\t0.0\n");
        }else{
        	System.out.print("Gift:- No Gift\t\t\tPlease Enter gender in M/F\n");
        }	

	//Carry bag price calculate and print
	double grand_total=total;
	double grand_discount_total=discount_total;
	if(carry=='y' || carry=='Y'){
		grand_total=total+10;
		grand_discount_total=discount_total+10;
		System.out.print("Carry Bag: Yes\t\t\t\t10.0\t10.0\n");
	}else if(carry=='n' || carry=='N'){
		grand_total=total;
		grand_discount_total=discount_total;
		System.out.print("Carry Bag: No\t\t\t\t\t\t0.0\t0.0 \n");
	}else{
		//grand_total=total;
		//grand_discount=discount_total;		
        	System.out.print("Carry Bag:\t\t\tEnter choice in Y/N\n");
        }
        System.out.print("---------------------------------------------------------------\n");
        
        //GST calculate and print
        	double gst=(total*10)/100;
        	
        	grand_total=grand_total+gst;
        	grand_discount_total=grand_discount_total+gst;
        	System.out.print("\t\t\t\t\t"+grand_total+"\t"+grand_discount_total+"\n");    
        	
        System.out.print("---------------------------------------------------------------\n");
        System.out.print("\t\t\t\tThank You\n");
        System.out.print("\t\t\t\tTo Visit\n");
        System.out.print("\t\t\t\tD-mart\n");
        System.out.print("---------------------------------------------------------------\n");
    }   
}
