/*
* @Author: kaifu
* @Date:   2017-11-21 21:38:41
* @Last Modified by:   kaifu
* @Last Modified time: 2017-11-21 21:50:36
*/

import java.util.List;
import java.util.ArrayList;

public class Employees implements Cloneable {
    private List<String> employees;

    public Employees() {
        employees = new ArrayList<>();
        loadDataFromDatabase();
    }

    public Employees(List<String> employees) {
        this.employees = employees;
    }

    private void loadDataFromDatabase() {
        employees.add("Kaifu Wang");
        employees.add("Kevin Wang");
        employees.add("Meng Zhang");

        System.out.println("Data loaded.");
    }

    public List<String> getEmployees() {
        return employees;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        // Deep copy original list.
        List<String> newList = new ArrayList<>(employees);

        return new Employees(newList);
    }
}