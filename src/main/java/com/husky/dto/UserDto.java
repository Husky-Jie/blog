package com.husky.dto;

import com.husky.entity.User;
import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * User: 周圣杰
 * Date: 2022/12/29
 * Time: 14:52
 */
@Data
public class UserDto extends User {
    private Integer articleCount;
}
