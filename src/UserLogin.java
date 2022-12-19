import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String userName, password, resetPassword, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Input your username: ");
        userName = input.nextLine();

        System.out.print("Input your password: ");
        password = input.nextLine();

        if(userName.equals("java") && password.equals("script")) {
            System.out.println("You are logged in!");

        } else if(userName.equals("java") && !password.equals("script")){
            System.out.println("Your password is wrong. Do you want to reset your password? yes/no");
            resetPassword = input.nextLine();

            if(resetPassword.equals("yes")){
                System.out.println("Create new password");
                newPassword = input.nextLine();

                if(newPassword.equals("script")){
                    System.out.println("Your password cannot be the same old password!");
                }
                else{
                    password = newPassword;
                    System.out.println("Your password has been changed successfully!");
                };
            }
        }
        else{
            System.out.println("Wrong username or password!");
        };
    }
}
