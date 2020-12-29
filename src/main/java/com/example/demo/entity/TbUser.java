package com.example.demo.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * tb_user
 * @author 
 */
@Data
public class TbUser implements Serializable {
    private Integer id;

    private String username;

    private String password;

}