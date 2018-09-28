package com.qq.springcloud_feign.app;

import com.qq.springcloud_feign.pojo.Word;
import com.qq.springcloud_feign.service.WordService;
import com.qq.springcloud_feign.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WordController {
    @Autowired
    private WordService wordService;
    @PostMapping("/wordadd.do")
    public R save(Word word){
        return wordService.save(word);
    }
    @GetMapping("/wordall.do")
    public List<Word> list(int flag){
        return wordService.list(flag);
    }
}
