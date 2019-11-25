package wow.kons.dao;

import wow.kons.bean.Menu;

import java.util.List;

public interface MenuDao {

    /*
    获取菜单层级信息
     */
    List<Menu> obtainMenus(String code);
}
