package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("Иван", "Иванов", (byte) 18);
        userService.saveUser("Олег", "Олегов", (byte) 19);
        userService.saveUser("Саша", "Александров", (byte) 20);
        userService.saveUser("Вадим", "Вадимов", (byte) 21);

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}

