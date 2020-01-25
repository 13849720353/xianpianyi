package web;

import bean.Card;
import bean.Vedio;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import service.VedioService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller("vedioAction")
@Scope("prototype")
public class VedioAction extends ActionSupport {
    @Resource
    private VedioService vedioService;

    private Vedio vedio;

    public Vedio getVedio() {
        return vedio;
    }

    public void setVedio(Vedio vedio) {
        this.vedio = vedio;
    }

    public String list() throws Exception {
        ActionContext request = ActionContext.getContext();
        List<Vedio> list1=vedioService.getAll();
        List list=new ArrayList();
        Random r=new Random();
        List list2=new ArrayList();
        for(int i=0;i<list1.size();i++)
        {
            int radom=r.nextInt(list1.size())+1;
            if(list2.contains(radom))//判断集合是否有该元素
            {
                du(list2,list1.size());
            }
            else
            {
                list2.add(radom);
            }
        }
        for(int k=0;k<list2.size();k++)
        {
            list.add(vedioService.findById(Integer.parseInt(list2.get(k).toString())));
        }
        request.put("list", list);
        return "list";
    }

    void du(List list2,int b)
    {
        Random r=new Random();
        int radom=r.nextInt(b)+1;
            if(list2.contains(radom))
            {
                du(list2,b);
            }
            else
            {
                list2.add(radom);
            }
    }

    public String findById() throws Exception {
        /*ActionContext request = ActionContext.getContext();
        List<FourEnglish> list=fourService.getAll();
        request.put("list", list);*/
        vedio=vedioService.findById(vedio.getV_id());
        return "findById";
    }

    public String findById1() throws Exception {
        /*ActionContext request = ActionContext.getContext();
        List<FourEnglish> list=fourService.getAll();
        request.put("list", list);*/
        vedio=vedioService.findById(vedio.getV_id());
        return "findById1";
    }

}
