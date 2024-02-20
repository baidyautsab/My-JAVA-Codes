package myPackage;

import java.util.Scanner;

public class ElectricityBill {
    int price;

    ElectricityBill(int price){
        this.price = price;
    }
    int bill(int unit){
        System.out.println("Your unit is "+unit);
        if(unit>=0 && unit<=100)
            return 0;
        else if(unit>100 && unit<=200){
            unit = unit-100;
            price = unit*5;
            return price;
        } else {
            unit = unit-200;
            price = price + unit*10 + 100*5;
            return price;
        }
    }
    public static void main(String[] args) {
        ElectricityBill e1 = new ElectricityBill(0);
        Scanner sc = new Scanner(System.in);
        System.out.print("Customer name : ");
        String name = sc.nextLine();
        System.out.println("Enter the unit ");
        int unit = sc.nextInt();
        System.out.println("Your electricity bill is "+e1.bill(unit));

        sc.close();
    }
}
