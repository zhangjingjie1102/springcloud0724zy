package com.zjj.jpa.entity;

import lombok.Data;
import org.springframework.data.domain.PageImpl;

import java.util.List;

@Data
public class MyPageImpl<T> {

    private  long lotalElements=0;
    private  List<T> content=null;
    private  int totalPages=0;
    private  int number=0;
    private int size = 3;

    public MyPageImpl(PageImpl<T> pil) {
        lotalElements = pil.getTotalElements();
        content =pil.getContent();
        totalPages =pil.getTotalPages();
        number =pil.getNumber();
        size = pil.getSize();
    }

    public MyPageImpl() {

    }



}
