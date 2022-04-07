package com.metro.mapper;

import com.metro.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {
    public Admin findOneAdmin(String account, String pwd);
    List<Admin>  findAllAccount();
    int updateAdminPwd(String pwd,String account);
}
