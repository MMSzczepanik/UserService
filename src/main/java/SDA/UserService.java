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
}
