package org.gosky.mapping;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

    @Update("update set interfaceName  #{interfaceName} where id =#{id}")
    void update(String name, int id);

    @Select("select * from user where id =#{id}")
    List<Long> selectAll(int id);

    @Select("select * from user")
    Map<String, String> selectMap();

    List<String> selectMap(String name);

    @Update("update set interfaceName")
    Integer update();

}
