package com.crm.dao;

import com.crm.domain.CrmStaff;

import java.util.List;

public interface CrmStaffDao {

    /**
     * 通过用户名和密码查询
     * @param loginName
     * @param loginPwd
     * @return
     */
    CrmStaff find(String loginName,String loginPwd);

    /**
     * 查询所有员工
     * @return
     */
    List<CrmStaff> findAll();
}
