package kiemtra;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// Lớp trừu tượng Staff
abstract class Staff {
    protected String employeeID;
    public String cardID;
    public String name;
    public String skill;

    public Staff(String employeeID, String cardID, String name, String skill) {
        this.employeeID = employeeID;
        this.cardID = cardID;
        this.name = name;
        this.skill = skill;
    }

    public abstract String getLevel();

    interface KPI {
        double kpi();
    }
}

// Lớp Fresher kế thừa từ Staff và implement interface KPI
class Fresher extends Staff implements Staff.KPI {
    private double quality;
    private boolean deadline;

    public Fresher(String employeeID, String cardID, String name, String skill, double quality, boolean deadline) {
        super(employeeID, cardID, name, skill);
        this.quality = quality;
        this.deadline = deadline;
    }

    @Override
    public String getLevel() {
        return "Fresher";
    }

    @Override
    public double kpi() {
        double baseKPI = quality * 60;
        if (deadline) {
            baseKPI += 20;
        }
        return baseKPI;
    }
}

class Junior_Senior extends Fresher{
    private int exp_year;
    double quality;
    boolean deadline;

    public Junior_Senior(String employeeID, String cardID, String name, String skill, double quality, boolean deadline, int exp_year) {
        super(employeeID, cardID, name, skill, quality, deadline);
        this.exp_year = exp_year;
    }

    @Override
    public String getLevel() {
        return "Junior/Senior";
    }

    @Override
    public double kpi() {
        double baseKPI = quality * 90;
        if (deadline) {
            baseKPI += 15;
        } else {
            baseKPI -= 10;
        }
        return baseKPI;
    }
}

// Lớp Leader kế thừa từ Junior_Senior
class Leader extends Junior_Senior {
    static int countLeader = 0;
    private double project;

    public Leader(String employeeID, String cardID, String name, String skill, double quality, boolean deadline, int exp_year, double project) {
        super(employeeID, cardID, name, skill, quality, deadline, exp_year);
        this.project = project;
        countLeader++;
    }

    @Override
    public String getLevel() {
        return "Leader";
    }

    @Override
    public double kpi() {
        double baseKPI = quality * 60;
        if (deadline) {
            baseKPI += 20;
        } else {
            baseKPI -= 30;
        }
        baseKPI += project;
        return baseKPI;
    }
}

public class Main {
    public static void main(String[] args) {
        Fresher fresher = new Fresher("22IT1", "220047", "Bew", "Java", 0.8, true);
        Junior_Senior juniorSenior = new Junior_Senior("22IT1", "220050", "Alice", "Python", 0.9, false, 2);
        Leader leader = new Leader("22IT2", "220049", "Bob", "C++", 0.85, true, 5, 8.5);

        System.out.println("Fresher Level: " + fresher.getLevel());
        System.out.println("Fresher KPI: " + fresher.kpi());

        System.out.println("Junior/Senior Level: " + juniorSenior.getLevel());
        System.out.println("Junior/Senior KPI: " + juniorSenior.kpi());

        System.out.println("Leader Level: " + leader.getLevel());
        System.out.println("Leader KPI: " + leader.kpi());

        System.out.println("Total Leaders: " + Leader.countLeader);
        ArrayList<Staff> staffList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        // Hàm nhập danh sách đối tượng
        while (true) {
            try {
                inputStaffList(scanner, staffList);
            } catch (InputMismatchException e) {
                System.out.println("Lỗi nhập dữ liệu: " + e.getMessage());
            }

            System.out.print("Nhập thêm đối tượng? (y/n): ");
            String input = scanner.next().toLowerCase();
            if (!input.equals("y")) {
                break;
            }
        }

        // Hiển thị danh sách đối tượng có kỹ năng "JavaCore"
        displayJavaCoreSkills(staffList);

        // Đếm số lượng Leader
        int leaderCount = countLeaders(staffList);
        System.out.println("Số lượng Leader: " + leaderCount);

        scanner.close();
    }

    // Hàm nhập danh sách đối tượng
    private static void inputStaffList(Scanner scanner, ArrayList<Staff> staffList) throws InputMismatchException {
        System.out.println("Nhập loại đối tượng (fi - Fresher, js - Junior_Senior, le - Leader, # - Kết thúc): ");
        String type = scanner.next().toLowerCase();
        if (type.equals("#")) {
            return;
        }

        System.out.print("Nhập Employee ID: ");
        String employeeID = scanner.next();

        System.out.print("Nhập Card ID: ");
        String cardID = scanner.next();

        System.out.print("Nhập tên: ");
        String name = scanner.next();
        if (name.matches(".*\\d+.*")) {
            throw new InputMismatchException("Tên không được chứa số.");
        }

        System.out.print("Nhập kỹ năng: ");
        String skill = scanner.next();

        if (type.equals("fi")) {
            System.out.print("Nhập quality (0.0 - 1.0): ");
            double quality = scanner.nextDouble();

            System.out.print("Nhập deadline (true/false): ");
            boolean deadline = scanner.nextBoolean();

            staffList.add(new Fresher(employeeID, cardID, name, skill, quality, deadline));
        } else if (type.equals("js")) {
            System.out.print("Nhập quality (0.0 - 1.0): ");
            double quality = scanner.nextDouble();

            System.out.print("Nhập deadline (true/false): ");
            boolean deadline = scanner.nextBoolean();

            System.out.print("Nhập số năm kinh nghiệm: ");
            int expYear = scanner.nextInt();

            staffList.add(new Junior_Senior(employeeID, cardID, name, skill, quality, deadline, expYear));
        } else if (type.equals("le")) {
            System.out.print("Nhập quality (0.0 - 1.0): ");
            double quality = scanner.nextDouble();

            System.out.print("Nhập deadline (true/false): ");
            boolean deadline = scanner.nextBoolean();

            System.out.print("Nhập số năm kinh nghiệm: ");
            int expYear = scanner.nextInt();

            System.out.print("Nhập điểm quản lý dự án (1.0 - 10.0): ");
            double project = scanner.nextDouble();

            staffList.add(new Leader(employeeID, cardID, name, skill, quality, deadline, expYear, project));
        } else {
            throw new InputMismatchException("Loại đối tượng không hợp lệ.");
        }
    }

    // Hàm hiển thị danh sách đối tượng có kỹ năng "JavaCore"
    private static void displayJavaCoreSkills(ArrayList<Staff> staffList) {
        System.out.println("Danh sách đối tượng có kỹ năng JavaCore:");
        for (Staff staff : staffList) {
            if (staff.skill.equalsIgnoreCase("JavaCore")) {
                System.out.println(staff.toString());
            }
        }
    }

    // Đếm số lượng đối tượng Leader
    private static int countLeaders(ArrayList<Staff> staffList) {
        int leaderCount = 0;
        for (Staff staff : staffList) {
            if (staff instanceof Leader) {
                leaderCount++;
            }
        }
        return leaderCount;
    }
}