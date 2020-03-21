package cn.yelriv.services;

import cn.yelriv.dao.TestDao;

/**
 * @Description TODO
 * @Date 2020/1/11 11:16
 * @Created by YR
 */
public class TestService {

    private TestDao testDao;

    public TestDao getTestDao() {
        return testDao;
    }

    public void setTestDao(TestDao testDao) {
        this.testDao = testDao;
    }

    public TestService() {
    }
    public void echo() {
        testDao.echo();
    }
}
