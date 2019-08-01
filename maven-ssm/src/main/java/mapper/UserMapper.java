package mapper;

import org.mybatis.spring.annotation.MapperScan;

import pojo.User;
@MapperScan
public interface UserMapper {
	int insUser(User user);
	
}
