package com.REST;

import java.sql.*;
import java.util.Locale;

/**
 * Created by varuchin on 24.11.2015.
 */
public class Solution {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);

        String user = "system";//Логин пользователя
        String password = "oblivion";//Пароль пользователя
        String url = "jdbc:oracle:thin:@n103934.merann.ru:1521/XE";//URL адрес
        String driver = "oracle.jdbc.driver.OracleDriver";//Имя драйвера




        try {
            Class.forName(driver);//Регистрируем драйвер
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Connection c = null;//Соединение с БД}

        try {
            c = DriverManager.getConnection(url, user, password);//Установка соединения с БД
            System.out.println("Connected.");
            Statement st = c.createStatement();//Готовим запрос
            ResultSet rs = st.executeQuery("select * from LIBRARY");//Выполняем запрос к БД, результат в переменной rs

            while (rs.next()) {
                System.out.println(rs.getString("AUTHOR"));//Последовательно для каждой строки выводим значение из колонки ColumnName
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //Обязательно необходимо закрыть соединение
            try {
                if (c != null) {
                    c.close();
                    System.out.println("Closed.");
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}
