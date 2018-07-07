package demo.service;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import demo.dao.GoodsActiveMapper;
import demo.model.GoodsActive;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ActiveGoodsServiceImpl implements ActiveGoodsService {

    @Resource
    private GoodsActiveMapper goodsActiveMapper;

    @Override
    public PageList<GoodsActive> get(int page, int rows) {
        return goodsActiveMapper.getListWithPage(null,new PageBounds(page,rows));
    }
}
