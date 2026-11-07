import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ViewRecords vr = new ViewRecords();
        int choice;

        do {
            System.out.println("\n================================");
            System.out.println(" MEDICAL PHARMACY MANAGEMENT");
            System.out.println("================================");

            System.out.println("1. Patient Registration");
            System.out.println("2. Doctor Registration");
            System.out.println("3. Medicine Registration");
            System.out.println("4. Prescription Registration");
            System.out.println("5. Prescription Details");
            System.out.println("6. Generate Bill");

            System.out.println("7. View Patients");
            System.out.println("8. View Doctors");
            System.out.println("9. View Medicines");
            System.out.println("10. View Prescriptions");
            System.out.println("11. View Bills");

            System.out.println("12. Exit");

            System.out.print("\nEnter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();

                    new Patient(name, age, phone).register();
                    break;

                case 2:
                    System.out.print("Enter Doctor Name: ");
                    String doctor = sc.nextLine();

                    System.out.print("Enter Specialization: ");
                    String spec = sc.nextLine();

                    new Doctor(0, doctor, spec).register();
                    break;

                case 3:
                    System.out.print("Enter Medicine Name: ");
                    String med = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    new Medicine(med, price, qty).register();
                    break;

                case 4:
                    System.out.print("Enter Patient ID: ");
                    int pid = sc.nextInt();

                    System.out.print("Enter Doctor ID: ");
                    int did = sc.nextInt();

                    new Prescription(pid, did).register();
                    break;

                case 5:
                    System.out.print("Enter Prescription ID: ");
                    int prid = sc.nextInt();

                    System.out.print("Enter Medicine ID: ");
                    int mid = sc.nextInt();

                    System.out.print("Enter Quantity: ");
                    int pq = sc.nextInt();

                    new PrescriptionDetails(prid, mid, pq).register();
                    break;

                case 6:
                    System.out.print("Enter Patient ID: ");
                    int billPid = sc.nextInt();

                    System.out.print("Enter Total Amount: ");
                    double amount = sc.nextDouble();

                    new Bill(billPid, amount).generateBill();
                    break;

                case 7:
                    vr.viewPatients();
                    break;

                case 8:
                    vr.viewDoctors();
                    break;

                case 9:
                    vr.viewMedicines();
                    break;

                case 10:
                    vr.viewPrescriptions();
                    break;

                case 11:
                    vr.viewBills();
                    break;

                case 12:
                    System.out.println("Thank you for using Medical Pharmacy System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 12);

        sc.close();
    }
}