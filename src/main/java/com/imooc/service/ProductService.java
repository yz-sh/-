package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import com.imooc.dto.CarDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by keke
 * 2021/10/5 14:11
 */
public interface ProductService {
    ProductInfo findOne(String productId);

    /**
     * 查询所有在架的商品
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);//分页

    ProductInfo save(ProductInfo productInfo);

    //加库存
    void increaseStock(List<CarDTO> carDTOList);

    //减库存
    void decreaseStock(List<CarDTO> carDTOList);
}
