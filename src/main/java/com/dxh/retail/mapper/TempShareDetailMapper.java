package com.dxh.retail.mapper;

import com.dxh.retail.entity.TempShareDetail;

public interface TempShareDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tempsharedetail
     *
     * @mbggenerated Wed Aug 12 14:27:33 GMT+08:00 2020
     */
    int insert(TempShareDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tempsharedetail
     *
     * @mbggenerated Wed Aug 12 14:27:33 GMT+08:00 2020
     */
    int insertSelective(TempShareDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tempsharedetail
     *
     * @mbggenerated Wed Aug 12 14:27:33 GMT+08:00 2020
     */
    TempShareDetail selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tempsharedetail
     *
     * @mbggenerated Wed Aug 12 14:27:33 GMT+08:00 2020
     */
    int updateByPrimaryKeySelective(TempShareDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tempsharedetail
     *
     * @mbggenerated Wed Aug 12 14:27:33 GMT+08:00 2020
     */
    int updateByPrimaryKey(TempShareDetail record);
}