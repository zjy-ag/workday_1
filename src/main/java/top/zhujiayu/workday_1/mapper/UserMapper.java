package top.zhujiayu.workday_1.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.zhujiayu.workday_1.model.User;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getAll();

    void insert(User user);
    void delete(Long id);
    User getOne(Long id);
    void update(User user);

}
