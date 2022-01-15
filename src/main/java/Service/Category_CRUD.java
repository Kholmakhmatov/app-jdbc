package Service;

import entity.Category;
import repository.CategoryRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class Category_CRUD {
    public static void Category_crud(){
        int select = -1;
        do {
            System.out.println("1. Show category");
            System.out.println("2. Add category");
            System.out.println("3. Update category");
            System.out.println("4. Delete category");
            System.out.println("0. BACK");
            System.out.print("Select: ");
            select = new Scanner(System.in).nextInt();
            switch (select){
                case 1 :{
                    try {
                        for (Category category : CategoryRepository.getCategories()) {
                            System.out.println(category);

                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }break;
                case 2 :{
                    System.out.print("Enter a new Category: ");
                    String newName = new Scanner(System.in).nextLine();
                    try {
                        CategoryRepository.addCategory(newName);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                }break;
                case 3 :{
                    System.out.print("Enter a old Category ");
                    String old_name = new Scanner(System.in).nextLine();
                    System.out.print("Enter a is Active? ");
                    boolean isActive = new Scanner(System.in).nextBoolean();
                    System.out.print("Enter a new Category ");
                    String newName = new Scanner(System.in).nextLine();
                    try {
                        CategoryRepository.updateCategory(old_name, isActive,newName);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }break;
                case 4 :{
                    System.out.print("Enter a old Category: ");
                    String oldName = new Scanner(System.in).nextLine();
                    try {
                        CategoryRepository.deleteCategory(oldName);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                }break;
            }

        } while(select!=0);
    }
}
