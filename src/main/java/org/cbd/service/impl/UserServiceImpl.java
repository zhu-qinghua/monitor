package org.cbd.service.impl;

import javax.annotation.Resource;

import org.cbd.mapper.UserMapper;
import org.cbd.pojo.User;
import org.cbd.service.IUserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private UserMapper userMapper;

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userMapper.selectByPrimaryKey(userId);
	}
}