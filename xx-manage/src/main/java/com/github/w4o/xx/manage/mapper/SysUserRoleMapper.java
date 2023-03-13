package com.github.w4o.xx.manage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.w4o.xx.core.entity.SysUserRoleEntity;
import com.github.w4o.xx.manage.dto.sys.role.UserRoleDTO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 用户角色表 Mapper 接口
 *
 * @author Frank
 */
public interface SysUserRoleMapper extends BaseMapper<SysUserRoleEntity> {

    /**
     * 根据用户id查询角色信息
     *
     * @param userId 用户id
     * @return 角色信息
     */
    @Select("select sys_role.id as role_id, sys_role.name as role_name from sys_role, sys_user_role where sys_user_role.deleted =0 and sys_role.id = sys_user_role.sys_role_id and sys_user_role.sys_user_id = #{userId} ")
    List<UserRoleDTO> findRoleByUserId(@Param("userId") long userId);
}
