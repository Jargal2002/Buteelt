package bugd;

import java.util.Scanner;

public class laboratory2 {
    public static void main(String[] args) {
        lab2<Character> queue = new lab2<Character>(1000); 
        Scanner sc = new Scanner(System.in);

        System.out.print("huden element oruulah be: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline character

        for (int i = 1; i <= n; i++) {
            System.out.print("Element " + i + ": ");
            char b = sc.nextLine().charAt(0);
            queue.enqueue(b);
        }

        boolean swtch = true;
        while (swtch) {
            System.out.println("\n1) Daraallaas elementiig hasah()\n"
                               + "2) Daraalald element nemeh()\n"
                               + "3) Urd taliin element()\n"
                               + "4) Hoid taliin element()\n"
                               + "5) Daraalal dahi elementiin too()\n"
                               + "6) Uldsen daraalliin too()\n"
                               + "Enter your choice: ");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("\n" + queue.dequeue() + " Daraallaas hasagdsn element\n");
                    break;
                case 2:
                    System.out.print("Enter element to enqueue: ");
                    queue.enqueue(sc.next().charAt(0));
                    System.out.println("\n" + queue.rear() + " Daraalald nemegdsn element\n");
                    break;
                case 3:
                    System.out.println("Urd taliin element: " + queue.front());
                    break;
                case 4:
                    System.out.println("Hoid taliin element: " + queue.rear());
                    break;
                case 5:
                    System.out.println("Daraalal dahi elementiin too: " + queue.size);
                    break;
                case 6:
                    System.out.println("Uldsen daraalliin too: " + queue.uldsenTaraalliinToo());
                    break;
                default:
                    swtch = false;
                    break;
            }
        }
        sc.close();
    }
}
