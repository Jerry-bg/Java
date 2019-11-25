package wow.kons.bean;

import java.util.List;

public class Menu {
    private String m_code;
    private String m_name;
    private String m_parent_code;
    private int m_type;
    private String m_path;
    private List<Menu> menus;

    public String getM_code() {
        return m_code;
    }

    public void setM_code(String m_code) {
        this.m_code = m_code;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public String getM_parent_code() {
        return m_parent_code;
    }

    public void setM_parent_code(String m_parent_code) {
        this.m_parent_code = m_parent_code;
    }

    public int getM_type() {
        return m_type;
    }

    public void setM_type(int m_type) {
        this.m_type = m_type;
    }

    public String getM_path() {
        return m_path;
    }

    public void setM_path(String m_path) {
        this.m_path = m_path;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }
}
