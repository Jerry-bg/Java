package com.kons.dao;

import com.kons.bean.InnerEmploye;
import com.kons.bean.OuterEmploye;
import com.kons.bean.Person;

public interface IEmployeDao {
    OuterEmploye findOuterEmployees(String code);
    InnerEmploye findInnerEmployees(String code);
    Person findPersonByCode(String code);
}
