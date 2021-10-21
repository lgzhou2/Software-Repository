package com.bootdo.importdata.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Data
@TableName("project_item")
@Service
public class ProjectItem implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键uuid
     */
    private Integer id;
    /**
     * 项目序号
     */
    private String orderNumber;
    /**
     * 项目名称
     */
    private String name;
    /**
     * 项目内容
     */
    private String content;
    /**
     * 费用类型（直接费等）
     */
    private Integer type;
    /**
     * 单位
     */
    private String unit;
    /**
     * 单价
     */
    private String price;
    /**
     * 数量
     */
    private String count;
    /**
     * 是否已删除[0-否、1-是]
     */
    private String isDeleted;

}
