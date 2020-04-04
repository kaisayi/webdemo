package fun.youzz.webdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author : kaisayi
 * @Project: webdemo
 * @date Date : 2020年04月04日 23:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private Integer id;
    private String name;
    private String email;
    private Integer gender; // 性别
    private Department department;
    private Date birth;
}
