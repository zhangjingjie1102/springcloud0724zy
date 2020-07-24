package com.zjj.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "hg_driver")
public class DriverCard {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Integer id;

    String cardtype;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date expiredate;
}
