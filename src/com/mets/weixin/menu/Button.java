package com.mets.weinxin.menu;
/**
* 类名: Button </br>
* 包名： com.mets.weinxin.menu
* 描述: 菜单项的基类  </br>
* 开发人员： tff  </br>
* 创建时间：  2016-2-19 </br>
* 发布版本：V1.0  </br>
 */
public class Button {
    
    private String name;//所有一级菜单、二级菜单都共有一个相同的属性，那就是name

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
