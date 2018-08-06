package self.builder.kfc.impl;

import self.builder.kfc.BaseFood;
import self.builder.kfc.PackagingWay;
import self.util.StringUtil;

/**
 * @author lingliang 2018年08月2018/8/5日 下午9:19
 */
public class Cola extends BaseFood {

    @Override
    public String getProductInfo() {
        StringBuilder productInfo = new StringBuilder();
        productInfo.append("可口可乐：【");

        if (PackagingWay.EASY_PACKAGING == this.getPackagingWay()) {
            productInfo.append("纸杯不带盖\n");
        } else if (PackagingWay.COMPLEX_PACKAGING == this.getPackagingWay()) {
            productInfo.append("纸杯带盖\n");
        }

        if (this.getDegree() > 50) {
            productInfo.append("非冰\n");
        } else if (this.getDegree() > 0) {
            productInfo.append("少冰\n");
        } else if (this.getDegree() > -50) {
            productInfo.append("正常冰\n");
        } else {
            productInfo.append("多冰\n");
        }

        if (!StringUtil.isBlank(this.getRemark())) {
            productInfo.append("备注：").append(this.getRemark());
        }
        productInfo.append("】");

        return productInfo.toString();
    }
}
