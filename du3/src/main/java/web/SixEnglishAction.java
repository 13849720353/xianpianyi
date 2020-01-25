package web;

import bean.FourEnglish;
import bean.SixEnglish;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import service.SixService;

import javax.annotation.Resource;
import java.util.List;

@Controller("sixEnglishAction")
@Scope("prototype")
public class SixEnglishAction extends ActionSupport {
    @Resource
    private SixService sixService;

    private SixEnglish sixEnglish;

    public SixEnglish getSixEnglish() {
        return sixEnglish;
    }

    public void setSixEnglish(SixEnglish sixEnglish) {
        this.sixEnglish = sixEnglish;
    }


    public String list() throws Exception {
        ActionContext request = ActionContext.getContext();
        List<SixEnglish> list=sixService.getAll();
        request.put("list", list);
        return "list";
    }

    public String findById() throws Exception {
        /*ActionContext request = ActionContext.getContext();
        List<FourEnglish> list=fourService.getAll();
        request.put("list", list);*/
        int id=sixEnglish.getS_id();
        sixEnglish=sixService.getById(id);
        return "findById";
    }
    public String findById1() throws Exception {
        /*ActionContext request = ActionContext.getContext();
        List<FourEnglish> list=fourService.getAll();
        request.put("list", list);*/
        int id=sixEnglish.getS_id();
        sixEnglish=sixService.getById(id);
        return "findById1";
    }
}
