package com.imozcan.app;
import com.imozcan.action.BookCase;
import com.karandev.util.console.Console;

public class Application {
    public static void run()
    {
       int option = Console.readInt("Uygun değeri giriniz");

        switch (option) {
            case 1 -> BookCase.search();
            case 2 -> BookCase.add();
            case 3 -> BookCase.delete();
            case 4 -> BookCase.edit();
            default -> Application.run();
        }
    }
}
