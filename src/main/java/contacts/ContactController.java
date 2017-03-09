package contacts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by xuc on 2017/3/8.
 * 控制器，简单处理GET、POST请求
 */
@Controller
@RequestMapping("/")
public class ContactController {
    private ContactRepository contactRepository;

    @Autowired
    public ContactController(ContactRepository contactRepository){
        this.contactRepository = contactRepository;
    }

    /**
     * 处理GET请求
     * @param model
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String home(Map<String,Object> model){
        Iterator<Contact> i = contactRepository.findAll().iterator();
        List<Contact> contacts = new ArrayList<Contact>();
        while (i.hasNext()){
            contacts.add(i.next());
            System.out.println(1);
        }

        model.put("contacts",contacts);
        return "home";
    }

    /**
     * 处理POST请求
     * @param contact
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public String submit(Contact contact){
        System.out.println(contact);
        contactRepository.save(contact);
        return "redirect:/";
    }
}
