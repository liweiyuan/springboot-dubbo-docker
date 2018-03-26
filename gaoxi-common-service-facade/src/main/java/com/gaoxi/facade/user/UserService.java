package com.gaoxi.facade.user;

import com.gaoxi.entity.user.UserEntity;

/**
 * Created by tingyun on 2018/3/26.
 */
public interface UserService {

    public UserEntity login(LoginReq loginReq);
}
