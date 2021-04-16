package com.hackathon.sales.dao;

import com.hackathon.sales.dataobject.ItemDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Wed Apr 14 23:18:11 GMT+08:00 2021
     */
    List<ItemDO> listItem();

    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Wed Apr 14 23:18:11 GMT+08:00 2021
     */
    int insert(ItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Wed Apr 14 23:18:11 GMT+08:00 2021
     */
    int insertSelective(ItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Wed Apr 14 23:18:11 GMT+08:00 2021
     */
    ItemDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Wed Apr 14 23:18:11 GMT+08:00 2021
     */
    int updateByPrimaryKeySelective(ItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Wed Apr 14 23:18:11 GMT+08:00 2021
     */
    int updateByPrimaryKey(ItemDO record);

    int increaseSales(@Param("id")Integer id, @Param("amount")Integer amount);
}