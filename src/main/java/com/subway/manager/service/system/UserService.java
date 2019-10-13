package com.subway.manager.service.system;

import com.subway.manager.model.User;
import com.subway.manager.service.AbstractService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: subway_manager
 * @description:
 * @author: lijiwen
 * @create: 2019-09-15 07:34
 **/
@Service
public class UserService extends AbstractService {

    /***
    * @author: Lijiwen
    * Description:
    * @param user
    * @return java.lang.String
    * @createDate
    **/
    public  String add(User user) {
        return "success";
    }

    public String editUser(User user) {
        return "success";
    }

    public List<User> getList() {
      return sqlSession.selectList("user.select",null);
    }
}
