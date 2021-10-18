package com.userservice.user;

import org.springframework.data.annotation.Id;

import java.util.HashSet;
import java.util.Set;

public class UserDetail {
    @Id
    private String id;
    private User userName;
    private User password;
    private Set<Coupon> coupons = new HashSet<Coupon>();

    public UserDetail(String id, User userName, User password, Set<Coupon> coupons) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.coupons = coupons;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUserName() {
        return userName;
    }

    public void setUserName(User userName) {
        this.userName = userName;
    }

    public User getPassword() {
        return password;
    }

    public void setPassword(User password) {
        this.password = password;
    }

    public Set<Coupon> getCoupons() {
        return coupons;
    }

    public void setCoupons(Set<Coupon> coupons) {
        this.coupons = coupons;
    }

    @Override
    public String toString() {
        return "UserDetail{" +
                "id='" + id + '\'' +
                ", userName=" + userName +
                ", password=" + password +
                ", coupons=" + coupons +
                '}';
    }
}
