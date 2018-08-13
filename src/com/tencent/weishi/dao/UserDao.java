package com.tencent.weishi.dao;

import java.util.List;

import com.tencent.weishi.domain.UserDomain;

public interface UserDao {
	List<UserDomain> findAll();
}
