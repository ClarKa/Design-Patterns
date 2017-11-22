/*
* @Author: kaifu
* @Date:   2017-11-21 21:45:14
* @Last Modified by:   kaifu
* @Last Modified time: 2017-11-21 21:58:44
*/

public class PrototypeTest {
    /* ----------------------------- Conclusion ----------------------------
    Suppose we have an Object that loads data from databases. Now we need to
    create several copies of this Object and to make modifications based on
    the original data, it's not a good idea to simple use `new` keyword to
    create new instances since every creation of a new instance will load all
    data from the database again.

    Protoype Pattern is a better approach which simple clone the existing
    object (deep/shallow copy based on different scenarios) into a new object
    without unnecessary database calls.
    --------------------------------------------------------------------- */


    public static void main(String[] args) throws CloneNotSupportedException {
        Employees originalCopy = new Employees();

        Employees clone1 = (Employees) originalCopy.clone();
        clone1.getEmployees().add("Alice");

        Employees clone2 = (Employees) originalCopy.clone();
        clone2.getEmployees().remove(0);
        clone2.getEmployees().add("Alan");

        System.out.println("original Copy: " + originalCopy.getEmployees());
        System.out.println("Clone 1: " + clone1.getEmployees());
        System.out.println("Clone 2: " + clone2.getEmployees());
    }
}