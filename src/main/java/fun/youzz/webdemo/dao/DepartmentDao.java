package fun.youzz.webdemo.dao;

import fun.youzz.webdemo.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : kaisayi
 * @Project: webdemo
 * @date Date : 2020年04月04日 23:38
 */
@Repository
public class DepartmentDao {

    // 模拟数据库中的数据
    private static Map<Integer, Department> departmentMap = null;

    static {
        departmentMap = new HashMap<>();
        departmentMap.put(101, new Department(101, "教育部", "张老板"));
        departmentMap.put(102, new Department(102, "市场部", "王老板"));
        departmentMap.put(103, new Department(103, "校验部", "陈老板"));
        departmentMap.put(104, new Department(104, "测试部", "李老板"));
        departmentMap.put(105, new Department(105, "开发部", "留老板"));
    }

    public Collection<Department> getDepartments() {
        return departmentMap.values();
    }

    public Department getDepartmentById(Integer id) {
        return departmentMap.get(id);
    }

}
