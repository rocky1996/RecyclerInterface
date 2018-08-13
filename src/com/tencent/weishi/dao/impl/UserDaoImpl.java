package com.tencent.weishi.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.acat.util.DbcpUtil;
import com.tencent.weishi.dao.UserDao;
import com.tencent.weishi.domain.UserDomain;

public class UserDaoImpl implements UserDao{
	private QueryRunner qr = new QueryRunner(DbcpUtil.getDataSource());
	@Override
	public List<UserDomain> findAll() {
		try{
			return qr.query("select * from user",new BeanListHandler<UserDomain>(UserDomain.class));
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}

}
