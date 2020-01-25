package dao;

import bean.Card;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Transactional
@Repository("cardDao")
public class CardDaoImpl implements CardDao {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.SUPPORTS,readOnly = true)
    @Override
    public List<Card> findAll() {
        List<Card> list=sessionFactory.getCurrentSession().createQuery("from Card").list();
        return list;
    }
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.SUPPORTS,readOnly = true)
    @Override
    public Card findById(int id) {
        Card card= (Card) sessionFactory.getCurrentSession().createQuery("from Card where c_id=:c_id").setParameter("c_id",id).list().get(0);
        return card;
    }
}
