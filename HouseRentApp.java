package houserent;

import houserent.view.HouseView;

public class HouseRentApp {
    public static void main(String[] args) {
        //创建HouseView对象，并且显示主菜单,整个程序的入口
        new HouseView().mainMenu();
        System.out.println("已退出");
    }
}
