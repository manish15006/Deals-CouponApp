package com.userservice.user;

import com.userservice.user.Coupon;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

@Document(collection = "User")
public class User {
    @Id
    private String id;
    private String userName;
    private String password;
    private Set<Coupon> coupons = new HashSet<Coupon>();

    public User(String id, String userName, String password, Set<Coupon> coupons) {
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Coupon> getCoupons() {
        return coupons;
    }
    public void setCoupons(Set<Coupon> coupons) {
        this.coupons = coupons;
    }
}
