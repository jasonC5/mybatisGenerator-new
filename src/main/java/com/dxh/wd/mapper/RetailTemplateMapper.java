package com.dxh.wd.mapper;

import com.dxh.wd.entity.RetailTemplate;
import com.dxh.wd.entity.RetailTemplateWithBLOBs;

public interface RetailTemplateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table retailtemplate
     *
     * @mbggenerated Wed Jul 01 18:51:52 GMT+08:00 2020
     */
    int insert(RetailTemplateWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table retailtemplate
     *
     * @mbggenerated Wed Jul 01 18:51:52 GMT+08:00 2020
     */
    int insertSelective(RetailTemplateWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table retailtemplate
     *
     * @mbggenerated Wed Jul 01 18:51:52 GMT+08:00 2020
     */
    RetailTemplateWithBLOBs selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table retailtemplate
     *
     * @mbggenerated Wed Jul 01 18:51:52 GMT+08:00 2020
     */
    int updateByPrimaryKeySelective(RetailTemplateWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table retailtemplate
     *
     * @mbggenerated Wed Jul 01 18:51:52 GMT+08:00 2020
     */
    int updateByPrimaryKeyWithBLOBs(RetailTemplateWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table retailtemplate
     *
     * @mbggenerated Wed Jul 01 18:51:52 GMT+08:00 2020
     */
    int updateByPrimaryKey(RetailTemplate record);
}