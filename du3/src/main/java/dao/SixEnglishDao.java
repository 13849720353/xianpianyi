package dao;

import bean.SixEnglish;

import java.util.List;

public interface SixEnglishDao {
    public List<SixEnglish> findAll();
    public SixEnglish findById(int id);
}
