package com.atguigu.mybatisplus.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

/**
 * Date:2022/2/15
 * Author:ybc
 * Description:
 *
 * 需要进行配置
 * 扫描通用枚举的包
 * type-enums-package: com.atguigu.mybatisplus.enums
 */
@Getter
public enum SexEnum {
    MALE(1, "男"),
    FEMALE(2, "女");


    //在需要的属性的get方法上添加@JsonValue 那么就可以在转化成json获取自己需要的值
    // @JsonValue 更多的是想Map中获取key-value中某一个的操作

    @EnumValue //将注解所标识的属性的值存储到数据库中
    private Integer sex;
    private String sexName;

    SexEnum(Integer sex, String sexName) {
        this.sex = sex;
        this.sexName = sexName;
    }
}
