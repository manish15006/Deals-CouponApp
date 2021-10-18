package com.userservice.user;

import java.util.Set;

public class UserDetailImpl extends UserDetail {

    public UserDetailImpl(String id, User userName, User password, Set<Coupon> coupons) {
        super(id, userName, password, coupons);
    }
}
