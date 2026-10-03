import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GymMemberDAO dao = new GymMemberDAO();

        while (true) {

            System.out.println("\n===== GYM MEMBERSHIP MANAGEMENT =====");
            System.out.println("1. Add Member");
            System.out.println("2. View Members");
            System.out.println("3. Update Member");
            System.out.println("4. Delete Member");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter plan: ");
                    String plan = sc.nextLine();

                    System.out.print("Enter duration (months): ");
                    int duration = sc.nextInt();
                    sc.nextLine();

                    GymMember member =
                            new GymMember(name, age, phone, plan, duration);

                    dao.addMember(member);
                    break;

                case 2:
                    List<GymMember> members = dao.getAllMembers();

                    System.out.println("\n===== ALL MEMBERS =====");

                    if (members.isEmpty()) {
                        System.out.println("No members found.");
                    } else {

                        for (GymMember m : members) {

                            System.out.println(
                                "ID: " + m.getId()
                                + " | Name: " + m.getName()
                                + " | Age: " + m.getAge()
                                + " | Phone: " + m.getPhone()
                                + " | Plan: " + m.getPlan()
                                + " | Duration: " + m.getDuration() + " months"
                            );
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter member ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter new age: ");
                    int newAge = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new phone: ");
                    String newPhone = sc.nextLine();

                    System.out.print("Enter new plan: ");
                    String newPlan = sc.nextLine();

                    System.out.print("Enter new duration: ");
                    int newDuration = sc.nextInt();
                    sc.nextLine();

                    GymMember updatedMember =
                            new GymMember(
                                updateId,
                                newName,
                                newAge,
                                newPhone,
                                newPlan,
                                newDuration
                            );

                    dao.updateMember(updatedMember);
                    break;

                case 4:
                    System.out.print("Enter member ID to delete: ");
                    int deleteId = sc.nextInt();
                    sc.nextLine();

                    dao.deleteMember(deleteId);
                    break;

                case 5:
                    System.out.println("Thank you for using Gym Membership Management!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}