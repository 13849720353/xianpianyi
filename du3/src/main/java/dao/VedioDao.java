package dao;

import bean.Vedio;

import java.util.List;

public interface VedioDao {
    public List<Vedio> findAll();
    public Vedio findById(int id);
}
