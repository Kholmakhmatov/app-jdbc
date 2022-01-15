package Service;

import java.util.Scanner;

public class Client_CRUD {
    public static void Client_crud(){
        int select = -1;
        do {
            System.out.println("1. Show client");
            System.out.println("2. Add client");
            System.out.println("3. Update client");
            System.out.println("4. Delete client");
            System.out.println("0. BACK");
            System.out.print("Select: ");
            select = new Scanner(System.in).nextInt();
            switch (select){
                case 1 :{

                }break;
                case 2 :{

                }break;
                case 3 :{

                }break;
                case 4 :{

                }break;
            }

        } while(select!=0);
    }
}
