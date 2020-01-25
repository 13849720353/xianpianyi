package service;

import bean.SixEnglish;
import dao.SixEnglishDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Transactional
@Service("SixService")
public class SixServiceImpl implements SixService{


    @Resource
    private SixEnglishDao sixEnglishDao;

    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.SUPPORTS,readOnly = true)
    @Override
    public List<SixEnglish> getAll() {
        return sixEnglishDao.findAll();
    }
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.SUPPORTS,readOnly = true)
    @Override
    public SixEnglish getById(int id) {
        return sixEnglishDao.findById(id);
    }
}
