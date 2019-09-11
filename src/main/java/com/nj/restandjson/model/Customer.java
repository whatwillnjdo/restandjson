package com.nj.restandjson.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Customer {


    @Id
    private Integer cid;
    private String cname;
    private String caddress;
}
