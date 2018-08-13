package com.tencent.weishi.service;

import java.util.List;

import com.tencent.weishi.domain.UserDomain;

public interface UserService {
	List<UserDomain> findAll();
}
