package org.aly.sxs.biz;

import org.aly.sxs.dao.UserinfoDao;
import org.aly.sxs.dao.UserinfoDaoImpl;
import org.aly.sxs.pojo.Userinfo;

import java.util.List;

/**
 * @ClassName: UserinfoBizImpl
 * @Description: TODO
 * @Author: SXS
 * @date: 2020/12/3 14:55
 * @Version: V1.0
 */
public class UserinfoBizImpl implements UserinfoBiz {
    //底层对象
    private UserinfoDao dao = new UserinfoDaoImpl();
    @Override
    public Userinfo isLogin(Userinfo userInfo) throws Exception {
        return dao.isLogin(userInfo);
    }

    @Override
    public int add(Userinfo userInfo) throws Exception {
        return dao.add(userInfo);
    }

    @Override
    public int del(String userId) throws Exception {
        return 0;
    }

    @Override
    public int update(Userinfo userInfo) throws Exception {
        return 0;
    }

    @Override
    public Userinfo findById(String id) throws Exception {
        return null;
    }

    @Override
    public List<Userinfo> all(Object... param) throws Exception {
        return dao.all(param);
    }
}

