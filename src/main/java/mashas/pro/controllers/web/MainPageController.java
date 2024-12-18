/*===================================================================================================*/
/*                                                                    developer: Tretyakova Mariya;  */
/*                                                                    version: 1.0;                  */
/* Description:                                                                                      */
/* Класс веб-контроллер для главной страницы.                                                          */
/*===================================================================================================*/
package mashas.pro.controllers.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainPageController {

    @GetMapping("/index")
    public String index(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/maps")
    public String maps() {
        return "maps";
    }

}