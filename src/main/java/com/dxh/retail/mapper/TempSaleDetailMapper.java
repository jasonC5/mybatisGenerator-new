package com.dxh.retail.mapper;

import com.dxh.retail.entity.TempSaleDetail;

public interface TempSaleDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tempsaledetail
     *
     * @mbggenerated Wed Aug 12 14:27:33 GMT+08:00 2020
     */
    int insert(TempSaleDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tempsaledetail
     *
     * @mbggenerated Wed Aug 12 14:27:33 GMT+08:00 2020
     */
    int insertSelective(TempSaleDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tempsaledetail
     *
     * @mbggenerated Wed Aug 12 14:27:33 GMT+08:00 2020
     */
    TempSaleDetail selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tempsaledetail
     *
     * @mbggenerated Wed Aug 12 14:27:33 GMT+08:00 2020
     */
    int updateByPrimaryKeySelective(TempSaleDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tempsaledetail
     *
     * @mbggenerated Wed Aug 12 14:27:33 GMT+08:00 2020
     */
    int updateByPrimaryKey(TempSaleDetail record);
}