package web;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller("areaAction")
@Scope("prototype")
public class AreaAction extends ActionSupport {
    public String area() throws Exception {
        return "area";
    }
}
