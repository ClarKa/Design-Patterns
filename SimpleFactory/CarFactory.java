/*
* @Author: kaifu
* @Date:   2017-10-30 20:37:18
* @Last Modified by:   kaifu
* @Last Modified time: 2017-10-30 20:57:34
*/
public class CarFactory {
    public static Car getCarByName(String carName) {
        Car car;
        String name = carName.toLowerCase();

        switch (name) {
            case "benz":
                car = new Benz();
                break;
            case "bmw":
                car = new Bmw();
                break;
            default:
                car = null;
                break;
        }

        return car;
    }
}