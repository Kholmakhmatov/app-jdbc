package Service;

import java.util.Scanner;

public class Currency_CRUD {
    public static void Currency_crud() {
        int select = -1;
        do {
            System.out.println("1. Show currency");
            System.out.println("2. Add currency");
            System.out.println("3. Update currency");
            System.out.println("4. Delete currency");
            System.out.println("0. BACK");
            System.out.print("Select: ");
            select = new Scanner(System.in).nextInt();
            switch (select) {
                case 1: {

                }
                break;
                case 2: {

                }
                break;
                case 3: {

                }
                break;
                case 4: {

                }
                break;
            }

        } while (select != 0);
    }
}
