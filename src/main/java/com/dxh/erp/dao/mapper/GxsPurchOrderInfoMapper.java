package com.dxh.erp.dao.mapper;

import com.dxh.erp.domain.entity.GxsPurchOrderInfo;

public interface GxsPurchOrderInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gxspurchorderinfo
     *
     * @mbggenerated Mon Jul 08 11:17:10 GMT+08:00 2019
     */
    int insert(GxsPurchOrderInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gxspurchorderinfo
     *
     * @mbggenerated Mon Jul 08 11:17:10 GMT+08:00 2019
     */
    int insertSelective(GxsPurchOrderInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gxspurchorderinfo
     *
     * @mbggenerated Mon Jul 08 11:17:10 GMT+08:00 2019
     */
    GxsPurchOrderInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gxspurchorderinfo
     *
     * @mbggenerated Mon Jul 08 11:17:10 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(GxsPurchOrderInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gxspurchorderinfo
     *
     * @mbggenerated Mon Jul 08 11:17:10 GMT+08:00 2019
     */
    int updateByPrimaryKeyWithBLOBs(GxsPurchOrderInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gxspurchorderinfo
     *
     * @mbggenerated Mon Jul 08 11:17:10 GMT+08:00 2019
     */
    int updateByPrimaryKey(GxsPurchOrderInfo record);
}