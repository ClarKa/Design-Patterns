/*
* @Author: kaifu
* @Date:   2017-10-30 20:52:12
* @Last Modified by:   kaifu
* @Last Modified time: 2017-11-06 00:03:17
*/
public class MyClass {
    public static void main(String[] args) {
        /* ----------------------------- Conclusion ----------------------------
        When adding a new product(make of car), only need to add corresponding
        product class and concrete factory class.
        Comparing with simple factory pattern in which need to change logic in
        facotory class, factory method pattern obeys open-closed principle.

        Problems:
        1. When adding a new product(make of car), need to add both product
        class and concrete factory class. Complexity of application increases.
        2. Still need to modify which concrete factory to instantiate when
        changing product.
        3. One concrete factory can only create one concrete product.
        --------------------------------------------------------------------- */


        CarFactory benzFactory = new BenzFactory();
        CarFactory bmwFactory = new BmwFactory();

        Car car1 = benzFactory.createCar();
        Car car2 = bmwFactory.createCar();
        Car car3 = bmwFactory.createCar();

        System.out.println(car1.getName());
        car1.drive("Kaifu");

        System.out.println(car2.getName());
        car2.drive("Wang");

        System.out.println(car3.getName());
        car3.drive("Kevin");
    }
}