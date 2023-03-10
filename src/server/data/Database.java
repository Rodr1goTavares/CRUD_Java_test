package server.data;

import java.util.Arrays;

public class Database {
    public static void accounts(String[] account){
        String[][] accountMatriz = new String[1][];
        accountMatriz[0] = new String[] {account[0], account[1]};

        for (String[] strings : accountMatriz) {
            System.out.println("DataBase receive: " + Arrays.toString(strings));
        }

    }
}
