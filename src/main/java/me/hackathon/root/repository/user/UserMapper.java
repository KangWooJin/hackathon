package me.hackathon.root.repository.user;

import java.util.Collection;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import me.hackathon.root.model.request.UserLoginRequest;
import me.hackathon.root.model.user.User;

@Mapper
public interface UserMapper {

    void insertUser(User user);

    User selectUserById(@Param("id")long id);

    int updateUserById(User user);

    int deleteUserById(@Param("id")long id);

    int selectUserByEmail(@Param("email") String email);

    List<User> selectUserListByIds(@Param("userIds") Collection<Integer> userIds);

    User login(UserLoginRequest userLoginRequest);
}