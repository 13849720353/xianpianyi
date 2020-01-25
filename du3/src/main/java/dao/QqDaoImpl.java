package dao;

import bean.QQ;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Transactional
@Repository("QqDao")
public class QqDaoImpl implements QqDao {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.SUPPORTS,readOnly = true)
    @Override
    public List<QQ> findAll() {
        List<QQ> list=sessionFactory.getCurrentSession().createQuery("from QQ").list();
        return list;
    }
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.SUPPORTS,readOnly = true)
    @Override
    public QQ findById(int id) {
        QQ qQ= (QQ) sessionFactory.getCurrentSession().createQuery("from QQ where q_id=:q_id").setParameter("q_id",id).list().get(0);
        return qQ;
    }
}
