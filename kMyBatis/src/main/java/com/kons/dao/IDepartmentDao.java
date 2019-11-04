package com.kons.dao;

import com.kons.bean.Department;
import com.kons.bean.Employe;

public interface IDepartmentDao {
    Department findEmployeesByDepart(String code);

    Employe findEmployInfo(String code);
}
