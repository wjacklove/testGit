package demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import demo.bean.User;

@Mapper
public interface UserMapper {
	public List<User> findUser();
}
