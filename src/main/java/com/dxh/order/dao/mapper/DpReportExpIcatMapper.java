package com.dxh.order.dao.mapper;

import com.dxh.order.domain.entity.DpReportExpIcat;

public interface DpReportExpIcatMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dpreportexpicat
     *
     * @mbggenerated Fri Feb 14 12:06:56 GMT+08:00 2020
     */
    int insert(DpReportExpIcat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dpreportexpicat
     *
     * @mbggenerated Fri Feb 14 12:06:56 GMT+08:00 2020
     */
    int insertSelective(DpReportExpIcat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dpreportexpicat
     *
     * @mbggenerated Fri Feb 14 12:06:56 GMT+08:00 2020
     */
    DpReportExpIcat selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dpreportexpicat
     *
     * @mbggenerated Fri Feb 14 12:06:56 GMT+08:00 2020
     */
    int updateByPrimaryKeySelective(DpReportExpIcat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dpreportexpicat
     *
     * @mbggenerated Fri Feb 14 12:06:56 GMT+08:00 2020
     */
    int updateByPrimaryKey(DpReportExpIcat record);
}