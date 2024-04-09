package com.imozcan.human;

public class User {
    private String m_name;
    private String m_surname;
    private int m_birthDate;
    private long m_nationalNumber;
    private String m_userName;
    private String m_password;

    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        m_name = name;
    }

    public String getSurname()
    {
        return m_surname;
    }

    public void setSurname(String surname)
    {
        m_surname = surname;
    }

    public int getBirthDate()
    {
        return m_birthDate;
    }

    public void setBirthDate(int birthDate)
    {
        m_birthDate = birthDate;
    }

    public long getNationalNumber()
    {
        return m_nationalNumber;
    }

    public void setNationalNumber(long ationalNumber)
    {
        m_nationalNumber = ationalNumber;
    }

    public String getUserName()
    {
        return m_userName;
    }

    public void setUserName(String userName)
    {
        m_userName = userName;
    }

    public String getPassword()
    {
        return m_password;
    }

    public void setPassword(String password)
    {
        m_password = password;
    }
}
