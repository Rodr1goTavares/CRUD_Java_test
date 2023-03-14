import server.Controller;

public class Main {
    public static void main(String[] args) {

        listenArgs(args);
    }

    private static void listenArgs(String[] prompt){
        String[] commandList = {"login", "register"};
        String selectedCommand = "";

        for (String s : commandList) {
            if (prompt[0].equals(s)){
                selectedCommand = prompt[0];
            } else {
                System.out.println("List of commands: " + commandList);
            }
        }

        switch (selectedCommand) {
            case "login":
                if(prompt.length > 2){
                    Controller.verifyLogin(prompt[1], prompt[2]);
                } else {
                    System.out.print("Try: login 'username' 'password'");
                }
                break;

            case "register":
                if(prompt.length > 3){
                    Controller.verifyRegister(prompt[1], prompt[2], prompt[3]);
                } else {
                    System.out.print("Try: (register 'username' 'password' 'confirm password') ");
                }
                break;
        }
    }


}