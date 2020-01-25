package dao;

import bean.FourEnglish;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Transactional
@Repository("fourEnglishDao")
public class FourEnglishDaoImpl implements FourEnglishDao {
    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.SUPPORTS,readOnly = true)
    @Override
    public List<FourEnglish> findAll() {
        List<FourEnglish> list=sessionFactory.getCurrentSession().createQuery("from FourEnglish").list();
        return list;
    }
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.SUPPORTS,readOnly = true)
    @Override
    public FourEnglish findById(int id) {
        FourEnglish fourEnglish= (FourEnglish) sessionFactory.getCurrentSession().createQuery("from FourEnglish where f_id=:f_id").setParameter("f_id",id).list().get(0);
        return fourEnglish;
    }
}
