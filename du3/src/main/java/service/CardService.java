package service;

import bean.Card;

import java.util.List;

public interface CardService {
    public List<Card> getAll();
    public Card findById(int id);
}
