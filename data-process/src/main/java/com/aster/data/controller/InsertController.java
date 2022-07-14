package com.aster.data.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 直接用原始jdbc操作向数据库插入源数据
 */
@Controller
public class InsertController {

    @Value("${spring.datasource.url}")
    private String DB_URL;

    @Value("${spring.datasource.username}")
    private String USER;

    @Value("${spring.datasource.password}")
    private String PASS;

    @RequestMapping("/update")
    public void update(@RequestParam String ratetime, @RequestParam String ratevalue) throws ClassNotFoundException, SQLException {

        System.out.println("Inserting............");

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();
        String sql = "INSERT INTO `test` VALUES ('" + ratetime + "', '" + ratevalue + "');";
        stmt.execute(sql);

        stmt.close();
        conn.close();
    }

}
