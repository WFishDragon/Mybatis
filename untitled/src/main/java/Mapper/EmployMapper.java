package Mapper;

import pojo.Employ;

import java.util.List;

public interface EmployMapper {
    List<Employ> findByName();
    int add(Employ employ);
    int delete(int id);
    int update();
}
