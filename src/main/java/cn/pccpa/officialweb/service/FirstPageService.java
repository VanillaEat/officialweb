package cn.pccpa.officialweb.service;

import cn.pccpa.officialweb.bean.FirstPage;
import cn.pccpa.officialweb.mapper.FirstPageMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2022年09月21日 15:42
 */
public class FirstPageService {
    @Autowired
    private FirstPageMapper firstPageMapper;


    public List<FirstPage> getAll() {

        List<FirstPage> all = firstPageMapper.getAll();

        return all;
    }
}
