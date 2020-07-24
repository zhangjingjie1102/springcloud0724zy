package com.zjj.jpa.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name= "hg_user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer uid;
    private  String username;
    private  String password;
    private  String name;
    private  String email;
    private  String telephone;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private  Integer sex;
    private  Integer state;
    private  String code;

    @OneToOne(targetEntity = DriverCard.class,cascade = CascadeType.ALL,fetch =FetchType.EAGER )
    @JoinColumn(name = "card_id",referencedColumnName = "id",insertable = true,updatable = false,nullable =false )
    private DriverCard driverCard;

}