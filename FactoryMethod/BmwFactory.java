/*
* @Author: kaifu
* @Date:   2017-10-31 00:16:26
* @Last Modified by:   kaifu
* @Last Modified time: 2017-10-31 00:17:42
*/
public class BmwFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new Bmw();
    }
}