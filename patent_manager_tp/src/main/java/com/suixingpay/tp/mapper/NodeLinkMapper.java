package com.suixingpay.tp.mapper;

import com.suixingpay.patent.entity.NodeLink;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface NodeLinkMapper {

    NodeLink getNextNode(@Param("id") long id, @Param("status") int status);

}
