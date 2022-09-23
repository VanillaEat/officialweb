package cn.pccpa.officialweb.mapper;

import cn.pccpa.officialweb.bean.FirstPage;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2022年09月21日 15:43
 */
@Component(value = "FirstPageMapper")
public interface FirstPageMapper {
    List<FirstPage> getAll();
}

