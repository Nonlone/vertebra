package per.nonlone.vertebra;

import cn.hutool.core.util.RandomUtil;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {

    @Autowired
    private TestMapper testMapper;

    @GetMapping("/test/HelloWorld")
    public Object helloWorld(){
        return "Hello world";
    }


    @GetMapping("/test/getTestList")
    public Object getTestList(){
        return testMapper.selectList(Wrappers.emptyWrapper());
    }

    @GetMapping("/test/insertEntity")
    public Object insertEntity(){
        Test test = new Test(){{
            this.setKey(RandomUtil.randomString(10));
            this.setValue(RandomUtil.randomString(20));
        }};
        testMapper.insert(test);
        return test;
    }

}
