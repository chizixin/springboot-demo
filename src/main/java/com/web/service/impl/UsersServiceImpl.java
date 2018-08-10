package com.web.service.impl;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.web.service.IUsersService;
import com.web.mapper.IUsersMapper;
/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zx
 * @since 2018-08-10
 */
@Service
public class UsersServiceImpl implements IUsersService{

	@Resource
	private IUsersMapper usersMapper;
	
}
