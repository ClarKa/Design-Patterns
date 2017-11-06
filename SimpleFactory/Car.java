/*
* @Author: kaifu
* @Date:   2017-10-30 20:28:02
* @Last Modified by:   kaifu
* @Last Modified time: 2017-10-30 21:04:52
*/
abstract class Car {
    public abstract String getName();

    public void drive(String driver) {
        System.out.println(getName() + " is drived by " + driver);
    }
}