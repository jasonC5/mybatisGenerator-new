package com.dxh.mem.dao.mapper;

import com.dxh.mem.domain.entity.MemMessage;

public interface MemMessageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memmessage
     *
     * @mbggenerated Wed Sep 18 16:20:58 GMT+08:00 2019
     */
    int insert(MemMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memmessage
     *
     * @mbggenerated Wed Sep 18 16:20:58 GMT+08:00 2019
     */
    int insertSelective(MemMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memmessage
     *
     * @mbggenerated Wed Sep 18 16:20:58 GMT+08:00 2019
     */
    MemMessage selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memmessage
     *
     * @mbggenerated Wed Sep 18 16:20:58 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(MemMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memmessage
     *
     * @mbggenerated Wed Sep 18 16:20:58 GMT+08:00 2019
     */
    int updateByPrimaryKey(MemMessage record);
}