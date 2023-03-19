import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        start();
    }

    public static void start(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the CRUD app. try: \n \"L\" to login. \n \"R\" to register.");
        String userChose = scanner.next();

        if(userChose.equals("L") || userChose.equals("l")){
            loginPage();
        } else if(userChose.equals("R") || userChose.equals("r")){
            registerPage();
        }
    }

    private static void loginPage(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("<< Login >> \n Username:");
        String username = scanner.next();

        System.out.println("Your password: ");
        String password = scanner.next();
    }

    private static void registerPage(){

    }
}
