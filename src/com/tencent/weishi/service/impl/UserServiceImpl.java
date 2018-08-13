package com.tencent.weishi.service.impl;

import java.util.List;

import com.tencent.weishi.dao.UserDao;
import com.tencent.weishi.dao.impl.UserDaoImpl;
import com.tencent.weishi.domain.UserDomain;
import com.tencent.weishi.service.UserService;

public class UserServiceImpl implements UserService{
	private UserDao dao = new UserDaoImpl();
	@Override
	public List<UserDomain> findAll() {
		return dao.findAll();
	}

}
