/** My Name : Deema Mohammed AL-Maqadma
 * ID : 2023200766
 *   --->>> GO A HERO !!!
 * روابط شرح اليوتيوب
 *  الجزء الأول
 * https://youtu.be/Z19JvWoeabg?si=R2MEhD-piRjeHWl2
 * الجزء الثاني
 * https://youtu.be/nvNDHzqCr7I?si=cUuGbSwz7lmqrZk3
 * الجزء الثالث
 * https://youtu.be/KZ6yz87FeG0?si=2XK-w5Ra35CBqMd8
 *
 */
package MedicalClinicManagementSystem;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ClinicManagement {

    private Manager manager;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;
    private ArrayList<Booking> bookings;
    private Scanner scanner;

    public ClinicManagement() {
        this.manager = new Manager();
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
        this.bookings = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() throws IOException, FileNotFoundException, ClassNotFoundException {
        while (true) {
            System.out.println("\n--->>>  Clinic Management System  <<<---");
            System.out.println("1- Add Employee");
            System.out.println("2- Add Patient");
            System.out.println("3- Add Booking");
            System.out.println("4- Show Doctor");
            System.out.println("5- Show Bookings for a Specific Patient");
            System.out.println("6- Show Employees? Salaries");
            System.out.println("7- Delete Booking");
            System.out.println("8- Count of Booking to any Patient");
            System.out.println("9- Save Data to Binary File");
            System.out.println("10- Exit");
            System.out.print("Enter your choice (1-10): ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    addPatient();
                    break;
                case 3:
                    addBooking();
                    break;
                case 4:
                    showDoctor();
                    break;
                case 5:
                    showBookingsForPatient();
                    break;
                case 6:
                    showEmployeesSalaries();
                    break;
                case 7:
                    deleteBooking();
                    break;
                case 8:
                    countBookingsForPatient();
                    break;
                case 9:
                    saveDataToFile();
                    break;
                case 10:
                    System.out.println("Exiting...\nThx ^-^ \n   Good Job");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

    }

    private void addEmployee() {
        System.out.println("1- Add Manager");
        System.out.println("2- Add Doctor");
        System.out.println("3- Back To the main Menu");
        System.out.print("Enter your choice : ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                addManager();
                break;
            case 2:
                addDoctor();
                break;
            case 3:
                return;
            default:
                System.out.println("Invalid Choice !");
        }

    }

    private void addManager() {
        if (manager.getName() != null) {
            System.out.println("A Manager already exists. You can't add another Manager.");
            return;
        }
        System.out.print("Enter Manager Name: ");
        String name = scanner.next();
        System.out.print("Enter Manager ID: ");
        String id = scanner.next();
        System.out.print("Enter Manager Address: ");
        String address = scanner.next();
        System.out.print("Enter Manager Phone Number: ");
        String phone = scanner.next();
        System.out.print("Enter Manager Email: ");
        String email = scanner.next();
        System.out.print("Enter Manager Gender: ");
        String gender = scanner.next();
        System.out.print("Enter Basic Salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter Hire Date (yyyy-mm-dd): ");
        String date = scanner.next();
        System.out.print("Enter Manager Bonus: ");
        double bonus = scanner.nextDouble();
        System.out.print("Enter Manager liveExpensive: ");
        double liveExpensive = scanner.nextDouble();
        try {
            manager = new Manager(bonus, salary, liveExpensive, java.sql.Date.valueOf(date), name, id, address, phone, email, gender);
            System.out.println("Manager added successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println("Manager added successfully.");
            scanner.nextLine();
        }
    }

    private void addDoctor() {
        while (true) {
            boolean continueInput = true;
            do {

                System.out.print("Enter Doctor Name: ");
                String name = scanner.next();
                System.out.print("Enter Doctor ID: ");
                String id = scanner.next();
                System.out.print("Enter Doctor Address: ");
                String address = scanner.next();
                System.out.print("Enter Doctor Phone Number: ");
                String phone = scanner.next();
                System.out.print("Enter Doctor Email: ");
                String email = scanner.next();
                System.out.print("Enter Doctor Gender: ");
                String gender = scanner.next();
                System.out.print("Enter Basic Salary: ");
                double salary = scanner.nextDouble();
                System.out.print("Enter Hire Date (yyyy-mm-dd): ");
                String date = scanner.next();
                System.out.print("Enter Number of Completed Bookings: ");
                int bookings = scanner.nextInt();
                System.out.print("Enter Department (1- General, 2- Pediatrician, 3- Psychiatrist): ");
                int department = scanner.nextInt();
                System.out.print("Enter Doctor liveExpensive: ");
                double liveExpensive = scanner.nextDouble();

                try {
                    Doctor doctor = new Doctor(bookings, department, salary, liveExpensive, java.sql.Date.valueOf(date), name, id, address, phone, email, gender);
                    doctors.add(doctor);
                    System.out.println("Doctor added successfully.");
                    continueInput = false;
                    break;

                } catch (IllegalArgumentException e) {
                    System.out.println("Try again ...");
                    scanner.nextLine();
                }
            } while (continueInput);

            System.out.print("Do you want to add another Doctor? (y/n): ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
        }
    }

    private void addPatient() {
        while (true) {
            System.out.print("Enter Patient Name: ");
            String name = scanner.next();
            System.out.print("Enter Patient ID: ");
            String id = scanner.next();
            System.out.print("Enter Patient Address: ");
            String address = scanner.next();
            System.out.print("Enter Patient Phone Number: ");
            String phone = scanner.next();
            System.out.print("Enter Patient Email: ");
            String email = scanner.next();
            System.out.print("Enter Patient Gender: ");
            String gender = scanner.next();
            System.out.print("Enter Number of Bookings: ");
            int bookings = scanner.nextInt();

            Patient patient = new Patient(bookings, name, id, address, phone, email, gender);
            patients.add(patient);
            System.out.println("Patient added successfully.");

            System.out.print("Do you want to add another Patient? (y/n): ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("y")) {
                break;

            }
        }

    }

    private void addBooking() {
        while (true) {
            System.out.println("Available Doctors:");
            for (Doctor doctor : doctors) {
                System.out.println("ID: " + doctor.getId() + ", Name: " + doctor.getName());
            }

            System.out.println("Available Patients:");
            for (Patient patient : patients) {
                System.out.println("ID: " + patient.getId() + ", Name: " + patient.getName());
            }

            System.out.print("Enter Doctor ID: ");
            String doctorId = scanner.next();
            System.out.print("Enter Patient ID: ");
            String patientId = scanner.next();

            Doctor selectedDoctor = null;
            Patient selectedPatient = null;

            for (Doctor doctor : doctors) {
                if (doctor.getId().equals(doctorId)) {
                    selectedDoctor = doctor;
                    break;
                }
            }

            for (Patient patient : patients) {
                if (patient.getId().equals(patientId)) {
                    selectedPatient = patient;
                    break;
                }
            }

            if (selectedDoctor == null || selectedPatient == null) {
                System.out.println("Invalid Doctor or Patient ID. Try again.");
                continue;
            }
            boolean continueInput = true;
            do {
                System.out.print("Enter Booking ID: ");
                String bookingId = scanner.next();
                System.out.print("Enter Booking Date (yyyy-mm-dd): ");
                String date = scanner.next();
                System.out.print("Enter Booking Details: ");
                String details = scanner.next();
                try {
                    Booking booking = new Booking(bookingId, details, selectedDoctor.getDepartment(), java.sql.Date.valueOf(date), selectedDoctor, selectedPatient);
                    bookings.add(booking);
                    selectedDoctor.setCompletedBookings(selectedDoctor.getCompletedBookings() + 1);
                    selectedPatient.increaseBooking();

                    System.out.println("Booking added successfully.");
                    continueInput = false;
                } catch (IllegalArgumentException e) {
                    System.out.println("Try again ...");
                    scanner.nextLine();
                }
            } while (continueInput);

            System.out.print("Do you want to add another Booking? (y/n): ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
        }
    }

    private void showDoctor() {
        System.out.println("1- General Doctor Employee");
        System.out.println("2- All Doctors ");
        System.out.println("3- Back To the main Menu");
        System.out.print("Enter your choice : ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("--->> General Doctor Employee : \n");
                for (Doctor doctor : doctors) {
                    if (doctor.getDepartment() == 1) {
                        System.out.println(doctor.toString());
                    }
                }
                break;
            case 2:
                System.out.println("--->> All Available Doctors :\n");
                for (Doctor doctor : doctors) {
                    System.out.println(doctor.toString());
                }

                break;
            case 3:
                return;
            default:
                System.out.println("Invalid Choice !");
        }
    }

    private void showBookingsForPatient() {
        while (true) {
            System.out.println("Available Patients:");
            for (Patient patient : patients) {
                System.out.println("ID: " + patient.getId() + ", Name: " + patient.getName());
            }
            boolean continueInput = true;
            do {
                try {
                    System.out.print("Enter Patient ID from the above : ");
                    String patientId = scanner.next();
                    for (Patient patient : patients) {
                        if (patientId == patient.getId()) {
                            System.out.println("ID: " + patient.getId() + ", Name: " + patient.getName() + "The Number Of Booking : " + patient.getBookingOrder());
                        }
                    }

                    continueInput = false;
                } catch (IllegalArgumentException e) {
                    System.out.println("Try again ...");
                    scanner.nextLine();
                }
            } while (continueInput);

            System.out.print("Do you want to add another Booking? (y/n): ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
        }

    }

    private void showEmployeesSalaries() {
        System.out.println("1- Manager Salary ");
        System.out.println("2- Spacific Doctor salary ");
        System.out.println("3- Back To the main Menu");
        System.out.print("Enter your choice : ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("--->> Manager Salary : \n");
                System.out.println(manager.getSalary());
                break;
            case 2:
                System.out.println("--->> Spacific Doctor salary :\n");
                System.out.print("Enter Doctor ID: ");
                String doctorId = scanner.next();
                for (Doctor doctor : doctors) {
                    if (doctorId == doctor.getId()) {
                        System.out.println("The Doctor salary" + doctor.getSalary());
                    }
                }
                break;
            case 3:
                return;
            default:
                System.out.println("Invalid Choice !");
        }

    }

    private void deleteBooking() {
        while (true) {
            System.out.println("Existing Bookings:");
            for (Booking booking : bookings) {
                System.out.println(booking);
            }

            System.out.print("Enter Booking ID to delete: ");
            String bookingId = scanner.next();

            Booking selectedBooking = null;
            for (Booking booking : bookings) {
                if (booking.getBookingId().equals(bookingId)) {
                    selectedBooking = booking;
                    break;
                }
            }

            if (selectedBooking == null) {
                System.out.println("Invalid Booking ID. Try again.");
                continue;
            }

            bookings.remove(selectedBooking);
            selectedBooking.getDoctor().setCompletedBookings(selectedBooking.getDoctor().getCompletedBookings() - 1);
            selectedBooking.getPatient().decreaseBooking();

            System.out.println("Booking deleted successfully.");

            System.out.print("Do you want to delete another Booking? (y/n): ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
        }
    }

    private void countBookingsForPatient() {
        System.out.println("Available Patients:");
        for (Patient patient : patients) {
            System.out.println("ID: " + patient.getId() + ", Name: " + patient.getName());
        }
        System.out.print("Enter Patient ID from the above : ");
        String patientId = scanner.next();
        for (Patient patient : patients) {
            if (patientId == patient.getId()) {
                System.out.println("ID: " + patient.getId() + ", Name: " + patient.getName() + "The Number Of Booking : " + patient.getBookingOrder());
            }

        }

    }

    private void saveDataToFile() throws FileNotFoundException, IOException, ClassNotFoundException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Person.dat"))) {
            out.writeObject(manager);
            out.writeObject(doctors);
            out.writeObject(patients);
            out.writeObject(bookings);
            System.out.println("Data saved successfully.");
            out.close();

        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Person.dat"))) {
            manager = (Manager) in.readObject();
            doctors = (ArrayList<Doctor>) in.readObject();
            patients = (ArrayList<Patient>) in.readObject();
            bookings = (ArrayList<Booking>) in.readObject();
            System.out.println("Data stored successfully.");
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("No previous data found. Starting with empty system.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }

    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ClinicManagement system = new ClinicManagement();
        system.displayMenu();
    }
}
/**
 * My Name : Deema Mohammed AL-Maqadma ID : 2023200766
 */
