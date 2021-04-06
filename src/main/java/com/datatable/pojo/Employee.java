package com.datatable.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
/**
 * @author tangzhiqian
 * @create 2021-04-05 19:07
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@TableName("employee")
public class Employee {
    @TableId(value = "id",type = IdType.AUTO)
    private int id;

    @TableField("name")
    private String name;

    @TableField("tel")
    private long tel;

    @TableField("address")
    private String address;

    @TableField("money")
    private int money;
}
