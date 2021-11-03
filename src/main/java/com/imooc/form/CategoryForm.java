package com.imooc.form;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by keke
 * 2021/10/29 22:34
 */
@Data
public class CategoryForm {
    /**类目id */
    private Integer categoryId;

    /**
     * 类目名字
     */
    private String categoryName;

    /**
     * 类目编号
     */
    private Integer categoryType;
}
