package com.imozcan.book;
public class Book {
    private String m_name;
    private String m_author;
    private int m_page;
    private long m_isbn;
    private String m_publisher;
    private int m_publicationYear;
    private String m_translator;
    private int m_id;
    private String m_type;


    public static Book of()
    {
        return new Book();
    }

    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        m_name = name;
    }

    public String getAuthor()
    {
        return m_author;
    }

    public void setAuthor(String author)
    {
        m_author = author;
    }

    public int getPage()
    {
        return m_page;
    }

    public void setPage(int page)
    {
        m_page = page;
    }

    public long getIsbn()
    {
        return m_isbn;
    }

    public void setIsbn(long isbn)
    {
        m_isbn = isbn;
    }

    public String getPublisher()
    {
        return m_publisher;
    }

    public void setPublisher(String publisher)
    {
        m_publisher = publisher;
    }

    public int getPublicationYear()
    {
        return m_publicationYear;
    }

    public void setPublicationYear(int publication_year)
    {
        m_publicationYear = publication_year;
    }

    public String getTranslator()
    {
        return m_translator;
    }

    public void setTranslator(String translator)
    {
        m_translator = translator;
    }

    public long getId()
    {
        return m_id;
    }

    public void setId(int id)
    {
        m_id = id;
    }

    public String getType()
    {
        return m_type;
    }

    public void setType(String type)
    {
        m_type = type;
    }
}
