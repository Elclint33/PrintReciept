package Receipt_RetailShop;

import java.util.Scanner;

public class Receeipt {

    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        /*accept simple retail receipt
        input variables*/
        double priceOfAShirt, priceOfAPant, priceOfADress;
        int numberOfShirts, numberOfPants, numberOfDresses;
        String customerName, homeNumber;
        double subtotalOfShirts, subtotalOfPants, subtotalOfDresses;
        short orderDay,orderMonth,orderYear;
        final double discountRate = 0.15;

    //input CustomerDetails
        System.out.println("WELCOME TO ELCLINT RETAIL SHOP");
        System.out.println("================================");
        System.out.println("Enter Customer Name: ");
        customerName=scan.nextLine();
        System.out.println("Enter customer phone number: ");
        homeNumber= scan.nextLine();

    //input items purchased
        System.out.println("Enter number of shoes purchased: ");
        numberOfShirts= scan.nextInt();
        System.out.println("Enter number of pants purchased: ");
        numberOfPants= scan.nextInt();
        System.out.println("Enter number of dresses purchased: ");
        numberOfDresses= scan.nextInt();

        //input prices of items
        System.out.println("Enter prize of a shirt: ");
        priceOfAShirt= scan.nextDouble();
        System.out.println("Enter prize of a pant: ");
        priceOfAPant= scan.nextDouble();
        System.out.println("Enter prize of a dress: ");
        priceOfADress= scan.nextDouble();

        //input Date details
        System.out.println("Enter order day: ");
        orderDay=scan.nextShort();
        System.out.println("Enter order month: ");
        orderMonth= scan.nextShort();
        System.out.println("Enter order year: ");
        orderYear= scan.nextShort();

        //perform some calculations
        double totalOrder, AmountToPay, orderDiscount;
        int totalNumberOfItems;

        totalNumberOfItems=numberOfShirts+numberOfPants+numberOfDresses;

        subtotalOfShirts=priceOfAShirt*numberOfShirts;
        subtotalOfPants=priceOfAPant*numberOfPants;
        subtotalOfDresses=priceOfADress*numberOfDresses;
        totalOrder=subtotalOfShirts+subtotalOfPants+subtotalOfDresses;
        orderDiscount=discountRate*totalOrder;
        AmountToPay=totalOrder-orderDiscount;

        //print receipt
        System.out.println("\t/\tWELCOME TO ELCLINT RETAIL CENTER\t/\t");
        System.out.println("============================================");
        System.out.println("#RECEIPT");
        System.out.println("Customer name: "+customerName);
        System.out.println("Customer phone number: "+homeNumber);
        System.out.println("Order date: "+orderDay+"/"+orderMonth+"/"+orderYear);
        System.out.println("---------------------------------------------");

        System.out.println("Items\t\t Qty\t\tSub-Total");
        System.out.println("**********************************************");
        System.out.println("SHOE\t\t"+numberOfShirts+"\t\t"+subtotalOfShirts);
        System.out.println("PANTS\t\t"+numberOfPants+"\t\t"+subtotalOfPants);
        System.out.println("DRESSES\t\t"+numberOfDresses+"\t\t"+subtotalOfDresses);
        System.out.println("----------------------------------------------");
        System.out.println();

        System.out.println("Total  number of items Purchased: "+totalNumberOfItems);
        System.out.println("Total order: "+totalOrder);
        System.out.println("Order discount: "+orderDiscount);
        System.out.println("Amount to pay: "+AmountToPay);
        System.out.println("***********************************************");
        System.out.println();
        System.out.println("Created  by Elclint");
        System.out.println("***********************************************");




    }
}
