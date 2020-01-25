package dao;

import bean.SixEnglish;
import com.opensymphony.xwork2.ActionSupport;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Transactional
@Repository("sixEnglishDao")
public class SixEnglishDaoImpl implements  SixEnglishDao{
    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.SUPPORTS,readOnly = true)
    @Override
    public List<SixEnglish> findAll() {
        List<SixEnglish> list=sessionFactory.getCurrentSession().createQuery("from SixEnglish").list();
        return list;
    }
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.SUPPORTS,readOnly = true)
    @Override
    public SixEnglish findById(int id) {
        SixEnglish sixEnglish= (SixEnglish) sessionFactory.getCurrentSession().createQuery("from SixEnglish where s_id=:s_id").setParameter("s_id",id).list().get(0);
        return sixEnglish;
    }
}
