package com.dxh.retail.mapper;

import com.dxh.retail.entity.BalanceConsumeBatch;

public interface BalanceConsumeBatchMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balanceconsumebatch
     *
     * @mbggenerated Fri Aug 28 17:30:29 GMT+08:00 2020
     */
    int insert(BalanceConsumeBatch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balanceconsumebatch
     *
     * @mbggenerated Fri Aug 28 17:30:29 GMT+08:00 2020
     */
    int insertSelective(BalanceConsumeBatch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balanceconsumebatch
     *
     * @mbggenerated Fri Aug 28 17:30:29 GMT+08:00 2020
     */
    BalanceConsumeBatch selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balanceconsumebatch
     *
     * @mbggenerated Fri Aug 28 17:30:29 GMT+08:00 2020
     */
    int updateByPrimaryKeySelective(BalanceConsumeBatch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balanceconsumebatch
     *
     * @mbggenerated Fri Aug 28 17:30:29 GMT+08:00 2020
     */
    int updateByPrimaryKey(BalanceConsumeBatch record);
}