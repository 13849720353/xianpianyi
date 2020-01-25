package dao;

import bean.FourEnglish;

import java.util.List;

public interface FourEnglishDao {
    public List<FourEnglish> findAll();
    public FourEnglish findById(int id);
}
