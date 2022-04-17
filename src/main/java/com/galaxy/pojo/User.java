package com.galaxy.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2022/4/16 22:06
 */
@Data
@TableName("t_user")
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
