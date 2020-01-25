package service;

import bean.FourEnglish;

import java.util.List;

public interface FourService {
    List<FourEnglish> getAll();
    FourEnglish getById(int id);
}
