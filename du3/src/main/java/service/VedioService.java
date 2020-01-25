package service;

import bean.Vedio;

import java.util.List;

public interface VedioService {
    public List<Vedio> getAll();
    public Vedio findById(int id);
}
