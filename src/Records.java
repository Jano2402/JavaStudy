public class Records {
    public static void main(String[] args) {
        record Persona(String name, String lastname) {};
        Persona juan = new Persona("Juan", "Castro");
        System.out.println(juan.name());
        System.out.println(juan.lastname());
                
    } 
}
