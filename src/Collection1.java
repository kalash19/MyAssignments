import java.util.*;
public class Collection1 {

    public class Main {
        public static void main(String[] args) {
            TreeMap<Long, Contact> contactMap = new TreeMap<>(Collections.reverseOrder());

            Scanner scanner = new Scanner(System.in);

            // Get the number of contacts from the user
            System.out.print("Enter the number of contacts: ");
            int numContacts = scanner.nextInt();

            /* Add contacts to the TreeMap */
            for (int i = 0; i < numContacts; i++) {
                System.out.println("Enter details for contact " + (i + 1) + ":");

                System.out.print("Phone Number: ");
                long phoneNumber = scanner.nextLong();

                System.out.print("Name: ");
                String name = scanner.next();

                System.out.print("Email: ");
                String email = scanner.next();

                System.out.print("Gender (MALE/FEMALE): ");
                String gender = scanner.next();

                Contact contact = new Contact(phoneNumber, name, email, gender);
                contactMap.put(phoneNumber, contact);

                System.out.println();
            }

            scanner.close();

            // Fetch and print keys
            System.out.println("Keys:");
            for (Long key : contactMap.keySet()) {
                System.out.println(key);
            }

            System.out.println();

            // Fetch and print values
            System.out.println("Values:");
            for (Contact contact : contactMap.values()) {
                System.out.println(contact);
            }

            System.out.println();

            // Print key-value pairs
            System.out.println("Key-Value Pairs:");
            for (Map.Entry<Long, Contact> entry : contactMap.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
        }

        static class Contact {
            private long phoneNumber;
            private String name;
            private String email;
            private String gender;

            public Contact(long phoneNumber, String name, String email, String gender) {
                this.phoneNumber = phoneNumber;
                this.name = name;
                this.email = email;
                this.gender = gender;
            }

            // Getters and setters (omitted for brevity)

            @Override
            public String toString() {
                return "Contact{" +
                        "phoneNumber=" + phoneNumber +
                        ", name='" + name + '\'' +
                        ", email='" + email + '\'' +
                        ", gender=" + gender +
                        '}';
            }
        }


    }

}
