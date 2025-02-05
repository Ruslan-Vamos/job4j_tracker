package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rst = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                rst = users[i];
                break;
            }
        }
        if (rst == null) {
            throw new UserNotFoundException("User with such login doesn't exists");
        }
        return rst;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("User is not valid");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Ruslan Popov", true)
        };
        try {
            User user = findUser(users, "Ruslan Popov");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException uie) {
            uie.printStackTrace();
        } catch (UserNotFoundException unfe) {
            unfe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
