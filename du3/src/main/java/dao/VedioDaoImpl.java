package dao;

import bean.Vedio;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Transactional
@Repository("VedioDao")
public class VedioDaoImpl implements VedioDao{
    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.SUPPORTS,readOnly = true)
    @Override
    public List<Vedio> findAll() {
        List<Vedio> list=sessionFactory.getCurrentSession().createQuery("from Vedio").list();
        return list;
    }
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.SUPPORTS,readOnly = true)
    @Override
    public Vedio findById(int id) {
        Vedio vedio= (Vedio) sessionFactory.getCurrentSession().createQuery("from Vedio where v_id=:v_id").setParameter("v_id",id).list().get(0);
        return vedio;
    }
}
