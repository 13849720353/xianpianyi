package web;

import bean.Card;
import bean.FourEnglish;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import service.CardService;

import javax.annotation.Resource;
import java.util.List;

@Controller("cardAction")
@Scope("prototype")
public class CardAction extends ActionSupport {
    @Resource
    private CardService cardService;

    private Card card;

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public String list() throws Exception {
        ActionContext request = ActionContext.getContext();
        List<Card> list=cardService.getAll();
        request.put("list", list);
        return "list";
    }

    public String findById() throws Exception {
        /*ActionContext request = ActionContext.getContext();
        List<FourEnglish> list=fourService.getAll();
        request.put("list", list);*/

        card=cardService.findById(card.getC_id());
        return "findById";
    }

    public String findById1() throws Exception {
        /*ActionContext request = ActionContext.getContext();
        List<FourEnglish> list=fourService.getAll();
        request.put("list", list);*/
        card=cardService.findById(card.getC_id());
        return "findById1";
    }

}
