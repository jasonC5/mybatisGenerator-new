package com.dxh.erp.dao.mapper;

import com.dxh.erp.domain.entity.AdrSortingLog;

public interface AdrSortingLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table adrsortinglog
     *
     * @mbggenerated Tue Oct 22 15:53:02 GMT+08:00 2019
     */
    int insert(AdrSortingLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table adrsortinglog
     *
     * @mbggenerated Tue Oct 22 15:53:02 GMT+08:00 2019
     */
    int insertSelective(AdrSortingLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table adrsortinglog
     *
     * @mbggenerated Tue Oct 22 15:53:02 GMT+08:00 2019
     */
    AdrSortingLog selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table adrsortinglog
     *
     * @mbggenerated Tue Oct 22 15:53:02 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(AdrSortingLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table adrsortinglog
     *
     * @mbggenerated Tue Oct 22 15:53:02 GMT+08:00 2019
     */
    int updateByPrimaryKey(AdrSortingLog record);
}