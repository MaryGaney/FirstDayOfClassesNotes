public class CashRegisterTester {

    public static void main(String[] args) {

        // create a cash register object
        CashRegister c1 = new CashRegister(9, 78);

        // add three items
        c1.addItem(5.8);
        c1.addItem(59.8);
        c1.addItem(12.887);

        System.out.println("No if items in current sale " + c1.getCount());
        System.out.println("Amount due " + c1.getTotal());

        CashRegister register2 = new CashRegister(10, 500);

        register2.addItem(59.0);

        System.out.println("No of items in register 2 is " + register2.getCount());

        //c1.clear()

        CashRegister c2 = c1;

        c2.clear();

        System.out.println("After c2 is cleared");
        System.out.println("total: " + c1.getTotal() + "count = " + c1.getCount());


        CashRegister c3 = new CashRegister();

        c3.clear();

        if(c1 == c3){
            System.out.println("c1 = c3");
        } else{
            System.out.println("c1 != c3");
        }


    }
}
