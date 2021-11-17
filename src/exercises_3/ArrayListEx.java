package exercises_3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        ArrayList<Employee> employees = new ArrayList<>(5);

        do {
            System.out.println("1. Nhập thông tin nhân viên.");
            System.out.println("2. Hiển thị thông tin nhân viên.");
            System.out.println("3. Xóa nhân viên đầu tiên.");
            System.out.println("0. Thoát chương trình.");
            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 0:
                    System.out.println("Đã thoát chương trình.");
                    break;
                case 1:
                    createEmployee(input, employees);
                    break;
                case 2:
                    showList(employees);
                    break;
                case 3:
                    if (employees.size() > 0) {
                        delete(employees);
                        showList(employees);
                    } else {
                        System.out.println("Danh sách trống...");
                    }
                    break;
                default:
                    System.out.println("Sai cú pháp, vui lòng nhập lại!");
                    break;
            }
        } while (choice != 0);
    }

    private static void delete(ArrayList<Employee> employees) {
        employees.remove(0);
        System.out.println("Đã xóa thành công");
    }

    private static void showList(ArrayList<Employee> employees) {
        if (employees.size() > 0) {
            System.out.printf("%-17s %-18s %-13s %-11s %-16s", "Mã nhân viên",
                    "Tên nhân viên", "Năm sinh", "Đơn vị", "Trình độ");
            System.out.println();

            for (Employee emp : employees) {
                System.out.printf("%-17s %-18s %-13d %-11s %-16s",
                        emp.getMaNhanVien(), emp.getTen(), emp.getNamSinh(),
                        emp.getDonVi(), emp.getTrinhDo());
                System.out.println();
            }
        } else {
            System.out.println("Danh sách trống...");
        }
    }

    private static ArrayList<Employee> createEmployee(Scanner input, ArrayList<Employee> employees) {

        System.out.println("Mã nhân viên: ");
        String idEmp = input.nextLine();
        System.out.println("Tên nhân viên: ");
        String name = input.nextLine();
        System.out.println("Năm sinh: ");
        int birth = Integer.parseInt(input.nextLine());
        System.out.println("Đơn vị: ");
        String donVi = input.nextLine();
        System.out.println("Trình độ: ");
        String trinhDo = input.nextLine();

        Employee employee = new Employee(idEmp, name, birth, donVi, trinhDo);
        employees.add(employee);

        if (idEmp.compareTo("***") != 0 && employees.size() <= 5) {
            createEmployee(input, employees);
            employees.remove(employees.size() - 1);
        }

        return employees;
    }


}