package application;

import model.entities.Address;
import model.entities.Department;
import model.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    /*
        Programa DESAFIO: Empregados OO desenvolvido por Marcos Ferreira Shirafuchi
        Data: 16/03/2024
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do departamento: ");
        String departmentName = sc.nextLine();
        System.out.print("Dia do pagamento: ");
        int departmentPayDay = sc.nextInt();
        sc.nextLine();
        System.out.print("Email: ");
        String addressEmail = sc.nextLine();
        System.out.print("Telefone: ");
        String addressPhone = sc.nextLine();
        Address address = new Address(addressEmail,addressPhone);
        Department dept = new Department(departmentName,departmentPayDay,address);
        System.out.print("Quantos funcionários tem o departamento? ");
        int n = sc.nextInt();
        for (int i = 1; i <=n;i++){
            System.out.printf("Dados do funcionário %d:\n",i);
            sc.nextLine();
            System.out.print("Nome: ");
            String employeeName = sc.nextLine();
            System.out.print("Salário: ");
            double employeeSalary = sc.nextDouble();
            Employee employee = new Employee(employeeName,employeeSalary);
            dept.addEmployee(employee);
        }
        showReport(dept);
        sc.close();
    }

    private static void showReport(Department dept) {
        System.out.println();
        System.out.println("FOLHA DE PAGAMENTO:");
        System.out.printf("Departamento %s = R$ %.2f\n",dept.getName(),dept.payroll());
        System.out.printf("Pagamento realizado no dia %d\n",dept.getPayDay());
        System.out.println("Funcionários: ");
        for (Employee employee: dept.getEmployee()){
            System.out.println(employee.getName());
        }
        System.out.printf("Para dúvidas favor entrar em contato: %s\n",dept.getAddress().getEmail());
    }
}
