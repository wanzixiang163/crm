package com.crm.service;

import com.crm.domain.CrmStaff;

import java.util.List;

public interface CrmStaffService {
    CrmStaff login(CrmStaff staff);

    List<CrmStaff> findAllStaff();
}
