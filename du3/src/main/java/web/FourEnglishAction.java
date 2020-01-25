package web;

import bean.FourEnglish;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import service.FourService;

import javax.annotation.Resource;
import java.util.List;

@Controller("fourEnglishAction")
@Scope("prototype")
public class FourEnglishAction extends ActionSupport{
    @Resource
    private FourService fourService;


   private FourEnglish fourEnglish;

    public FourEnglish getFourEnglish() {
        return fourEnglish;
    }

    public void setFourEnglish(FourEnglish fourEnglish) {
        this.fourEnglish = fourEnglish;
    }

    public String list() throws Exception {
        ActionContext request = ActionContext.getContext();
        List<FourEnglish> list=fourService.getAll();
        request.put("list", list);
        System.out.println(list);
        return "list";
    }
    public String findById() throws Exception {
        /*ActionContext request = ActionContext.getContext();
        List<FourEnglish> list=fourService.getAll();
        request.put("list", list);*/
        int id=fourEnglish.getF_id();
        fourEnglish=fourService.getById(id);
        return "findById";
    }
    public String findById1() throws Exception {
        /*ActionContext request = ActionContext.getContext();
        List<FourEnglish> list=fourService.getAll();
        request.put("list", list);*/
        int id=fourEnglish.getF_id();
        fourEnglish=fourService.getById(id);
        return "findById1";
    }
}
