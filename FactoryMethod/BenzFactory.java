/*
* @Author: kaifu
* @Date:   2017-10-31 00:14:49
* @Last Modified by:   kaifu
* @Last Modified time: 2017-10-31 00:20:12
*/
public class BenzFactory extends CarFactory {
    public Car createCar() {
        return new Benz();
    }
}