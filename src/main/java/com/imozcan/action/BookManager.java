package com.imozcan.action;

import java.io.*;
import com.imozcan.book.Book;
import com.karandev.util.console.Console;


public class BookManager {
    private static int id = 1;
    private static final String FILENAME = "db/kitaplar.txt";
    private static final String NAME_MSG = "Kitap ismini Giriniz";
    private static final String AUTHOR_MSG = "Yazar ismini Giriniz";
    private static final String PAGE_MSG = "Sayfa Sayısını Giriniz";
    private static final String ISBN_MSG = "ISBN Numarasını Giriniz";
    private static final String PUBLISHER_MSG = "Yayınevi Bilgisini giriniz";
    private static final String PUBLISHER_YEAR_MSG = "Baskı Yılını Giriniz";
    private static final String TRANSLATOR_MSG = "Çevirmen Bilgisini Giriniz";
    private static final String TYP_MSG = "Kitap Tür Bilgisini Giriniz";

    public static void search()
    {
        throw new UnsupportedOperationException("TODO:");
    }
    public static void add ()
    {
        Book book = Book.of();
        book.setName(Console.readLine(NAME_MSG));
        book.setAuthor(Console.readLine(AUTHOR_MSG));
        book.setPage(Console.readInt(PAGE_MSG));
        book.setIsbn(Console.readInt(ISBN_MSG));
        book.setPublisher(Console.readLine(PUBLISHER_MSG));
        book.setPublicationYear(Console.readInt(PUBLISHER_YEAR_MSG));
        book.setTranslator(Console.readLine(TRANSLATOR_MSG));
        book.setType(Console.readLine(TYP_MSG));

        if (!controller(book))
            add();

        book.setId(id++); //İD VERİLECEK SONRA ARTTIRILACAK

        if (saveBookInfo(book)) {
            Console.writeLine("Kitap başarıyla eklendi.");
        } else {
            Console.writeLine("Kitap eklenemedi. Lütfen tekrar deneyin.");
            add();

        }
    }


    public static void delete()
    {
        throw new UnsupportedOperationException("TODO:");
    }
    public  static void edit()
    {
        throw new UnsupportedOperationException("TODO:");
    }

    public static boolean controller(Book book) {
        if (book.getName() == null ||
                book.getAuthor() == null ||
                book.getPublisher() == null ||
                book.getType() == null ||
                book.getName().isEmpty() ||
                book.getAuthor().isEmpty() ||
                book.getPublisher().isEmpty() ||
                book.getType().isEmpty() ||
                book.getPage() <= 0 ||
                book.getIsbn() <= 0 ||
                book.getPublicationYear() <= 0) {
            Console.writeLine("Tüm kitap bilgileri doldurulmalıdır.");
            return false;
        }

        Console.writeLine("Kitap başarıyla eklendi: " + book.getName());
        return true;
    }

    public static boolean saveBookInfo(Book book) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME, true))) {
            writer.write(   book.getId() + "," +
                    book.getName() + "," +
                    book.getAuthor() + "," +
                    book.getPage() + "," +
                    book.getIsbn() + "," +
                    book.getPublisher() + "," +
                    book.getPublicationYear() + "," +
                    book.getTranslator() + "," +
                    book.getType());
            writer.newLine();
            Console.writeLine("Kitap bilgileri başarıyla dosyaya kaydedildi.");
            return true;
        } catch (IOException e) {
            Console.Error.writeLine("Dosya yazma hatası: " + e.getMessage());
            return false;

        }
    }

}


