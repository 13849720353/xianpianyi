package service;

import bean.Card;
import dao.CardDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("cardService")
public class CardServiceImpl implements CardService {
    @Resource
    private CardDao cardDao;
    @Override
    public List<Card> getAll() {
        return cardDao.findAll();
    }

    @Override
    public Card findById(int id) {
        System.out.println("杜金明2");
        return cardDao.findById(id);
    }
}
