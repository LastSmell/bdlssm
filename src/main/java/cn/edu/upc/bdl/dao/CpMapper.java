package cn.edu.upc.bdl.dao;

import cn.edu.upc.bdl.model.Cp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CpMapper {

    List<Cp> selectAll();
    List<Cp> selectById(Integer id);
    List<Cp> selectById1(Integer id);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cp
     *
     * @mbg.generated Sat Jul 11 11:19:45 CST 2020
     */
    int deleteByPrimaryKey(Integer cpno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cp
     *
     * @mbg.generated Sat Jul 11 11:19:45 CST 2020
     */
    int insert(Cp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cp
     *
     * @mbg.generated Sat Jul 11 11:19:45 CST 2020
     */
    int insertSelective(Cp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cp
     *
     * @mbg.generated Sat Jul 11 11:19:45 CST 2020
     */
    Cp selectByPrimaryKey(Integer cpno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cp
     *
     * @mbg.generated Sat Jul 11 11:19:45 CST 2020
     */
    int updateByPrimaryKeySelective(Cp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cp
     *
     * @mbg.generated Sat Jul 11 11:19:45 CST 2020
     */
    int updateByPrimaryKey(Cp record);
}