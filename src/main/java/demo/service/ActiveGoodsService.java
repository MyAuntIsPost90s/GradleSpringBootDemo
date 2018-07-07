package demo.service;

import com.github.miemiedev.mybatis.paginator.domain.PageList;
import demo.model.GoodsActive;

public interface ActiveGoodsService {

    PageList<GoodsActive> get(int page, int rows);

}
