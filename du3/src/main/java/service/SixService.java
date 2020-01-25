package service;

import bean.SixEnglish;

import java.util.List;

public interface SixService {
    public List<SixEnglish> getAll();
    public SixEnglish getById(int id);
}
