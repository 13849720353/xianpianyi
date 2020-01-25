package service;

import bean.QQ;

import java.util.List;

public interface QqService {
    public List<QQ> getAll();
    public QQ findById(int id);
}
