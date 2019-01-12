package com.example.springclounddemo.entity;


import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "USER")
public class User {
    private String user;
    private String sex;
    private Date birthday;
}
