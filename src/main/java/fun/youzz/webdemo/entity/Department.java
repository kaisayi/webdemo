package fun.youzz.webdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : kaisayi
 * @Project: webdemo
 * @date Date : 2020年04月04日 23:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    private Integer id;
    private String depName;
    private String owner;

    public Department(Integer id) {
        this.id = id;
    }
}
