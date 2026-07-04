class NoMoneyException extends RuntimeException {
    public NoMoneyException(String message) {
        super(message);
    }
}

public class Exceptions {
    public static void main(String[] args) {
        // try catch
        try {
            int i = 3 / 0;
            System.out.println(i);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        throw new NoMoneyException("You're broke");
    } 
}
