package self.builder.kfc.impl;

import self.builder.kfc.BaseFood;
import self.builder.kfc.PackagingWay;
import self.util.StringUtil;

/**
 * @author lingliang 2018年08月2018/8/5日 下午8:58
 */
public class ChickenBerger extends BaseFood {

    @Override
    public String getProductInfo() {
        StringBuilder productInfo = new StringBuilder();
        productInfo.append("鸡肉汉堡：【");

        if (PackagingWay.EASY_PACKAGING == this.getPackagingWay()) {
            productInfo.append("普通汉堡纸包装\n");
        } else if (PackagingWay.COMPLEX_PACKAGING == this.getPackagingWay()) {
            productInfo.append("汉堡纸盒包装\n");
        }

        if (this.getDegree() > 0) {
            productInfo.append("炙烤型汉堡\n");
        } else if (this.getDegree() == 0) {
            productInfo.append("普通熟型汉堡\n");
        } else {
            productInfo.append("稚嫩鸡肉汉堡\n");
        }

        if (!StringUtil.isBlank(this.getRemark())) {
            productInfo.append("备注：").append(this.getRemark()).append("\n");
        }
        productInfo.append("】-- ").append(this.getPrice()).append("元 \n");

        return productInfo.toString();
    }
}
