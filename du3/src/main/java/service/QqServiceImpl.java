package service;

import bean.QQ;
import dao.QqDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("qqService")
public class QqServiceImpl implements QqService {

    @Resource
    private QqDao qqDao;
    @Override
    public List<QQ> getAll() {
        return qqDao.findAll();
    }

    @Override
    public QQ findById(int id) {
        return qqDao.findById(id);
    }
}
