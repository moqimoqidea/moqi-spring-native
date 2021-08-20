package com.moqi.run;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author moqi
 * On 2021/8/20 11:42
 */
@RestController
public class HelloController {

    private static final Random RANDOM = new Random();

    @GetMapping("/hello")
    String person() {
        return "Spring Native Run Success, you get number:" + RANDOM.nextInt(100);
    }

}
