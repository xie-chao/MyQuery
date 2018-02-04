package com.calix.myquery.vo;

import com.calix.myquery.annotation.Column;
import com.calix.myquery.annotation.Id;
import com.calix.myquery.annotation.Table;
import com.calix.myquery.constant.GenerationType;

import java.util.Date;

@Table("USER_INFO")
public class UserInfo {

    @Id(strategy = GenerationType.SEQUENCE, sequenceName = "SEQ_USER_INFO")
    @Column("USER_ID")
    private Long userId;
    @Column("USER_NAME")
    private String userName;
    @Column("USER_AGE")
    private Integer userAge;
    @Column("UPDATE_TIME")
    private Date updateTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }
}
