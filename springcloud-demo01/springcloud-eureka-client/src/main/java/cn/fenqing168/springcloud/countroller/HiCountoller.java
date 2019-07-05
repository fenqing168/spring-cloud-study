package cn.fenqing168.springcloud.countroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fenqing
 */
@RestController
public class HiCountoller {

    @GetMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name){
        return "hi" + name;
    }

}
