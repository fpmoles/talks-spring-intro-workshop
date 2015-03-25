package com.frankmoley.example.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

/**
 * @author Frank Moley
 */
@RestController("/rest")
public class ServiceController {

    private  DataSource dataSource;

    @Autowired
    public ServiceController(){
        super();
    }

    @RequestMapping(method = RequestMethod.GET)
    public String hello(){
        return "Hello World";
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
