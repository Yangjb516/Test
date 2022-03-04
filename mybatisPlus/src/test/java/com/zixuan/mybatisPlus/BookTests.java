package com.zixuan.mybatisPlus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zixuan.mybatisPlus.entity.PubBooks;
import com.zixuan.mybatisPlus.mapper.PubBooksMapper;
import com.zixuan.mybatisPlus.service.PubBooksService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class BookTests {
    @Resource
    private PubBooksService pubBooksService;
    @Resource
    private PubBooksMapper pubBooksMapper;

    @Test
    public void testServiceSelect() {
        List<PubBooks> pubBooks = pubBooksService.list();
        for (PubBooks pubBook:pubBooks) {
            System.out.println(pubBook.toString());
        }
    }
    @Test
    public void testMapperSelect() {
        QueryWrapper<PubBooks> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",1);
        Page<PubBooks> page = pubBooksMapper.selectPage(new Page(1,2),queryWrapper);
        List<PubBooks> pubBooks = page.getRecords();
        for (PubBooks pubBook:pubBooks) {
            System.out.println(pubBook.toString());
        }
        long total = page.getTotal();
        System.out.println(total);
    }
}
