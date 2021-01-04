package com.shangma.cn.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author JAVASM
 */
@Data
public class BaseEntity<ID> {

    private ID id;

    private Date addTime;

    private Long creatorId;

    private Date updateTime;

    private Long updateId;
}
