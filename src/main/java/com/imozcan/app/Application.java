package com.imozcan.app;
import com.imozcan.action.BookManager;
import com.karandev.util.console.Console;
import static java.lang.System.exit;

public class Application {
    public static void run()
    {
        while(true) {
            switch (Console.readInt("Uygun değeri giriniz [ÇIKIŞ:0 EKLE:1  ARAMA:2  SİLME:3 DÜZENLE:4]  :")) {
                case 0 -> exit(0);
                case 1 -> BookManager.add();
                case 2 -> BookManager.search();
                case 3 -> BookManager.delete();
                case 4 -> BookManager.edit();
                default -> Application.run();
            }
        }
    }

}



