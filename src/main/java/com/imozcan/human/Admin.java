package com.imozcan.human;

import com.karandev.util.console.Console;

import static com.imozcan.msg.MsgUser_TR.*;

public class Admin extends User {

    public static void create()
    {
        Admin adminUser = new Admin();

        Console.writeLine(USER_START_MSG);

        adminUser.setName(Console.readLine(USER_NAME_MSG));
        adminUser.setSurname(Console.readLine(USER_SURNAME_MSG));
        adminUser.setUserName(Console.readLine(USER_USERNAME_MSG));
        adminUser.setPassword(Console.readLine(USER_PASSWD_MSG));
    }



}
