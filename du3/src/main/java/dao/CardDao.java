package dao;

import bean.Card;

import java.util.List;

public interface CardDao {
    public List<Card> findAll();
    public Card findById(int id);
}
