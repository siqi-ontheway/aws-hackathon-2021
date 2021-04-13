package com.hackathon.sales;

import com.hackathon.sales.dao.UserDOMapper;
import com.hackathon.sales.dataobject.UserDO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"com.hackathon.sales"})
@RestController
@MapperScan("com.hackathon.sales.dao")
public class SalesApplication {

    @Autowired
    private UserDOMapper userDOMapper;

    @RequestMapping("/")
    public String home() {
        UserDO userDO = userDOMapper.selectByPrimaryKey(1);
        if(userDO == null) {
            return "User doesn't Exist";
        } else {
            return userDO.getName();
        }
    }
    public static void main(String[] args) {

        SpringApplication.run(SalesApplication.class, args);
    }

}
