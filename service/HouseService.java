package houserent.service;

import houserent.domain.House;

/**
 * 业务层
 */
public class HouseService {
    private House[] houses;
    private int num = 1;//有多少个房屋信息
    private int idCounter = 1;//记录id

    public HouseService(int size) {
        houses = new House[size];
        houses[0] = new House(1,"Jack","112","台江区",2000,"未出租");
    }

    public House[] list(){
        return houses;
    }

    public boolean add(House newHouse){
        if (num == houses.length){
            System.out.println("数组已满");
            return false;
        }
        houses[num++] = newHouse;
        newHouse.setId(++idCounter);
        return true;
    }

    public boolean del(int delId){
        int index = -1;
        for (int i = 0; i < num; i++) {
            if (delId == houses[i].getId()){
                index = i;
            }
        }
        if (index == -1){
            return false;
        }
        for (int i = index; i < num - 1; i++) {
            houses[i] = houses[i+1];
        }
        houses[num-1] = null;
        num--;
        return true;
    }

    public House findById(int findId){
        for (int i = 0; i < num; i++) {
            if (findId == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }

}
