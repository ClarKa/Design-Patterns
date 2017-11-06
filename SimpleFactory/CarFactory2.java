/*
* @Author: kaifu
* @Date:   2017-10-30 21:07:44
* @Last Modified by:   kaifu
* @Last Modified time: 2017-11-06 00:05:47
*/
public class CarFactory2 {
    public static Car getCarByName(String name) {
        Car car = null;
        try {
            car = (Car) Class.forName(name).newInstance();
        } catch (Exception e) {
            System.out.println("No such car found in factory.");
        }
        return car;
    }
}