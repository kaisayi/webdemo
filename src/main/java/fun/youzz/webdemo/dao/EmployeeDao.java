package fun.youzz.webdemo.dao;

import fun.youzz.webdemo.entity.Department;
import fun.youzz.webdemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * @author : kaisayi
 * @Project: webdemo
 * @date Date : 2020年04月04日 23:42
 */
@Repository
public class EmployeeDao {

    private static Map<Integer, Employee> employeeMap = null;

    @Autowired
    private DepartmentDao departmentDao;

    static {
        employeeMap = new HashMap<>();
        employeeMap.put(1001, new Employee(1001, "小王", "12090432@qq.com", 1, new Department(102), new Date()));
        employeeMap.put(1002, new Employee(1002, "小张", "12040432@qq.com", 0, new Department(101), new Date()));
        employeeMap.put(1003, new Employee(1003, "小李", "120230432@qq.com", 1, new Department(101), new Date()));
        employeeMap.put(1004, new Employee(1004, "小刘", "12054432@qq.com", 0, new Department(104), new Date()));
        employeeMap.put(1005, new Employee(1005, "小邓", "0903432@qq.com", 1, new Department(104), new Date()));
    }

    // 主键自增
    private static Integer initId = 1006;

    public void save(Employee employee) {
        if (Objects.isNull(employee.getId())) {
            employee.setId(initId++);
        }
        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
        employeeMap.put(employee.getId(), employee);
    }

    public Collection<Employee> getAll() {
        return employeeMap.values();
    }

    public Employee getEmployeeById(Integer id) {
        return employeeMap.get(id);
    }

    public void deleteById(Integer id) {
        employeeMap.remove(id);
    }







}
