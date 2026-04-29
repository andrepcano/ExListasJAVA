package entitiesEx01;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainEx01lst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Informations> employees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        // --- cadastro ---
        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee #" + (i + 1));
            System.out.print("Id: ");
            int id = sc.nextInt();

            boolean idExists = false;
            for (Informations emp : employees) {
                if (emp.getId() == id) {
                    idExists = true;
                    break;
                }
            }

            if (idExists) {
                System.out.println("This ID already exists! Try again.");
                i--;
                continue;
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employees.add(new Informations(id, name, salary));
        }
        // --- fim do cadastro ---

        // --- busca ---
        System.out.print("\nEnter the employee ID for salary increase: ");
        int searchId = sc.nextInt();

        Informations found = null;
        for (Informations emp : employees) {
            if (emp.getId() == searchId) {
                found = emp;
                break;
            }
        }
        // --- fim da busca ---

        if (found == null) {
            System.out.println("ID not found!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            found.IncreaseSalary(percentage);
        }

        // --- print final ---
        System.out.println("\n--- Employees ---");
        for (Informations emp : employees) {
            System.out.println("| Id: "       + emp.getId()
                    + " \n| Name: "  + emp.getName()
                    + " \n| Salary: "+ emp.getSalary());
        }

        sc.close();
    }
}