package com.dxh.order.dao.mapper;

import com.dxh.order.domain.entity.GxsReconciliationInfo;

public interface GxsReconciliationInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gxsreconciliationinfo
     *
     * @mbggenerated Thu Jan 31 15:56:03 GMT+08:00 2019
     */
    int insert(GxsReconciliationInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gxsreconciliationinfo
     *
     * @mbggenerated Thu Jan 31 15:56:03 GMT+08:00 2019
     */
    int insertSelective(GxsReconciliationInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gxsreconciliationinfo
     *
     * @mbggenerated Thu Jan 31 15:56:03 GMT+08:00 2019
     */
    GxsReconciliationInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gxsreconciliationinfo
     *
     * @mbggenerated Thu Jan 31 15:56:03 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(GxsReconciliationInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gxsreconciliationinfo
     *
     * @mbggenerated Thu Jan 31 15:56:03 GMT+08:00 2019
     */
    int updateByPrimaryKeyWithBLOBs(GxsReconciliationInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gxsreconciliationinfo
     *
     * @mbggenerated Thu Jan 31 15:56:03 GMT+08:00 2019
     */
    int updateByPrimaryKey(GxsReconciliationInfo record);
}