package com.dxh.retail.mapper;

import com.dxh.retail.entity.TempSalePay;

public interface TempSalePayMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tempsalepay
     *
     * @mbggenerated Wed Aug 12 14:27:33 GMT+08:00 2020
     */
    int insert(TempSalePay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tempsalepay
     *
     * @mbggenerated Wed Aug 12 14:27:33 GMT+08:00 2020
     */
    int insertSelective(TempSalePay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tempsalepay
     *
     * @mbggenerated Wed Aug 12 14:27:33 GMT+08:00 2020
     */
    TempSalePay selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tempsalepay
     *
     * @mbggenerated Wed Aug 12 14:27:33 GMT+08:00 2020
     */
    int updateByPrimaryKeySelective(TempSalePay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tempsalepay
     *
     * @mbggenerated Wed Aug 12 14:27:33 GMT+08:00 2020
     */
    int updateByPrimaryKey(TempSalePay record);
}