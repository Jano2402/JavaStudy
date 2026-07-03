public class Conditionals {
    public static void main(String[] args) {
        int number = 0;

        if (number == 0) {
            System.out.println("Infinite void");
        }

        if (number == 1) {
            System.out.println("Domain expansion");
        } else if (number == 2) {
            System.out.println("Domain contraction");
        }

        switch (number) {
            case 3:
                System.out.println("Sukuna"); 
                break;
            case 4:
                System.out.println("Itadori");
            default:
                break;
        }
    }
}
