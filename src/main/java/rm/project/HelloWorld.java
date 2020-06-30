package rm.project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import rm.project.util.RmUtil;

@RestController
public class HelloWorld {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model
    ) {
        model.addAttribute("name", RmUtil.sign());
        return (String) model.getAttribute("name");
    }

}
