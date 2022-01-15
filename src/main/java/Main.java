import Service.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int select = -1;
        do {
            System.out.println("1. Category CRUD");
            System.out.println("2. Currency CRUD");
            System.out.println("3. Measurement CRUD");
            System.out.println("4. Product CRUD");
            System.out.println("5. User CRUD");
            System.out.println("6. Client CRUD");
            System.out.println("0. EXIT");
            System.out.print("Select: ");
            select = new Scanner(System.in).nextInt();

            switch (select) {
                case 1: {
                    Category_CRUD.Category_crud();
                }
                break;
                case 2: {
                    Currency_CRUD.Currency_crud();
                }
                break;
                case 3: {
                    Measurement_CRUD.Measurement_crud();
                }
                break;
                case 4: {
                    Product_CRUD.Product_crud();
                }
                break;
                case 5: {
                    User_CRUD.User_crud();
                }
                break;
                case 6: {
                    Client_CRUD.Client_crud();
                }
                break;
            }
        } while (select != 0);

    }
}
