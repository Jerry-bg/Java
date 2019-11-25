package wow.kons.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wow.kons.bean.Menu;
import wow.kons.dao.MenuDao;
import wow.kons.model.MenuJsonModel;

import java.util.ArrayList;
import java.util.List;

@Service
public class SysConfigService {
    @Autowired
    private MenuDao menuDao;

    public List<Menu> obtainMenuData(String code){
        List<Menu> menus=menuDao.obtainMenus(code);
        return menus;
    }
}
