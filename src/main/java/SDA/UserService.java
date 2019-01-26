package SDA;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private List<User> userList = new ArrayList<User>();

    public void add(User user){
        userList.add(user);
    }

    public void getUsers(){
        for (User u : userList){
            System.out.println(u);
        }
    }

    public void deleteUserByMail(String email){
        for(User u : userList){
            if(u.getLogin().equals(email)) {
                userList.remove(u);
                break;
            }
        }
    }

    public void modyfyUser( String email, String name, String lastName, String password){
        for(User u : userList){
            if(u.getLogin().equals(email)) {
                u.setName(name);
                u.setLastName(name);
                u.setPassword(password);
                break;
            }
        }
    }

    public boolean isLog(String name, String password){

        for(User u : userList){
            if(u.getLogin().equals(name)){
                if(u.getPassword().equals(password)){
                    return true;
                }
            } return false;
        }
        return false;
    }
}
