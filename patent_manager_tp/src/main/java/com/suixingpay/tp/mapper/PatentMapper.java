package com.suixingpay.tp.mapper;

import com.suixingpay.patent.entity.Patent;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PatentMapper {

	boolean insertPatent(Patent patent);

}
