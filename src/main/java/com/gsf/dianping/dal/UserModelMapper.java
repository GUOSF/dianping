package com.gsf.dianping.dal;

import com.gsf.dianping.model.UserModel;
import org.apache.ibatis.annotations.Param;

public interface UserModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserModel record);

    int insertSelective(UserModel record);

    UserModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserModel record);

    int updateByPrimaryKey(UserModel record);

    UserModel selectByTelphoneAndPassword(@Param("telphone") String telphone, @Param("password")String password);
    
    Integer countAllUser();

}