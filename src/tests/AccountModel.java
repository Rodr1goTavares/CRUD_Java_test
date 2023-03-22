package tests;

public class AccountModel {
        private String user;
        private String email;
        private String password;

        public void setUsername(String username){
            this.user = username;
        }

        public String getUsername(){
            return user;
        }

        public void setEmail(String email){
            this.email = email;
        }

        public String getEmail(){
            return email;
        }

        public void setPassword(String password){
            this.password = password;
        }

        public String getPassword(){
            return password;
        }


        public void showAccont(){
            String acc = "User: " + user + "\nEmail: " + email + "\nPassword: " + password;
            System.out.println(acc);
        }
    }
