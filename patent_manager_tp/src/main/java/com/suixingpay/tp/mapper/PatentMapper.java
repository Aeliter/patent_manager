package com.suixingpay.tp.mapper;

import com.suixingpay.patent.entity.Patent;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description:
 * @author: Aeliter
 * @date: 2019-11-20 13:44
 * @version: V1.0
 */
@Mapper
public interface PatentMapper {

    void insertPatent(Patent patent);

    List<Patent> selectPatentAndProcessById(Integer id);

}
