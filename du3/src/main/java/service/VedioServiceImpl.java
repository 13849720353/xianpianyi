package service;

import bean.Vedio;
import dao.VedioDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("vedioService")
public class VedioServiceImpl implements VedioService {
    @Resource
    private VedioDao vedioDao;


    @Override
    public List<Vedio> getAll() {
        return vedioDao.findAll();
    }

    @Override
    public Vedio findById(int id) {
        return vedioDao.findById(id);
    }
}
