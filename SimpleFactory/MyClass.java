/*
* @Author: kaifu
* @Date:   2017-10-30 20:52:12
* @Last Modified by:   kaifu
* @Last Modified time: 2017-11-06 00:04:37
*/
public class MyClass {
    public static void main(String[] args) {
        Car car1 = CarFactory.getCarByName("Benz");
        Car car2 = CarFactory.getCarByName("Bmw");

        System.out.println(car1.getName());
        car1.drive("Kaifu");

        System.out.println(car2.getName());
        car2.drive("Wang");


        Car car3 = CarFactory2.getCarByName("Benz");
        Car car4 = CarFactory2.getCarByName("Audi");
        System.out.println(car3.getName());
        car3.drive("Kevin");
    }
}