package dao;

import bean.QQ;

import java.util.List;

public interface QqDao {
    public List<QQ> findAll();
    public QQ findById(int id);
}
