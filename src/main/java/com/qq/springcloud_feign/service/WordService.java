package com.qq.springcloud_feign.service;

import com.qq.springcloud_feign.pojo.Word;
import com.qq.springcloud_feign.vo.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "provider1803")
public interface WordService {
    @RequestMapping(value = "wordsave.do",method = RequestMethod.POST)
    public R save(Word word);
    @RequestMapping(value = "/wordlist.do",method = RequestMethod.GET)
    public List<Word> list(int flag);
}
