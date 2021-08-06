package com.lovecoding.mapper;

import com.lovecoding.pojo.BaseDict;
import com.lovecoding.pojo.BaseDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseDictMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_dict
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    long countByExample(BaseDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_dict
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    int deleteByExample(BaseDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_dict
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    int deleteByPrimaryKey(String dictId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_dict
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    int insert(BaseDict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_dict
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    int insertSelective(BaseDict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_dict
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    List<BaseDict> selectByExample(BaseDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_dict
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    BaseDict selectByPrimaryKey(String dictId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_dict
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    int updateByExampleSelective(@Param("record") BaseDict record, @Param("example") BaseDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_dict
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    int updateByExample(@Param("record") BaseDict record, @Param("example") BaseDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_dict
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    int updateByPrimaryKeySelective(BaseDict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_dict
     *
     * @mbg.generated Fri Aug 06 16:28:02 CST 2021
     */
    int updateByPrimaryKey(BaseDict record);
}