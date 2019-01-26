package SDA;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        UserService userService = new UserService();
        userService.add(new User("Michał", "Szczepanik", "mic@gmail.com", "XXX"));
        userService.add(new User("Michał", "Ziółkowski", "micc@gmail.com", "XXY"));
        userService.getUsers();
    }
}
