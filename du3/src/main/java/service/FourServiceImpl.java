package service;

import bean.FourEnglish;
import dao.FourEnglishDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("fourService")
public class FourServiceImpl implements FourService {
    @Resource
    private FourEnglishDao fourEnglishDao;


    private FourEnglishDao fourEnglsih;


    @Override
    public List<FourEnglish> getAll() {
        return fourEnglishDao.findAll();
    }

    @Override
    public FourEnglish getById(int id) {
        return fourEnglishDao.findById(id);
    }
}
