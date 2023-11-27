package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Никита","Воронов",(byte)23);
        userService.saveUser("Александр","Македонский",(byte)35);
        userService.saveUser("Елена","Полено",(byte)19);
        userService.saveUser("Мария","Васильева",(byte)32);
        System.out.println(userService.getAllUsers().toString());
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
