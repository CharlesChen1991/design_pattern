package self.builder.kfc;

import java.math.BigDecimal;

/**
 * @author lingliang 2018年08月2018/8/5日 下午8:54
 */
public abstract class BaseFood {

    /**
     * 顾客对食品的标注
     */
    private String remark;

    /**
     * 食物打包方式
     */
    private PackagingWay packagingWay;

    /**
     * 食品温度
     */
    private Integer degree;

    /**
     * 价格
     */
    private BigDecimal price;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public PackagingWay getPackagingWay() {
        return packagingWay;
    }

    public void setPackagingWay(PackagingWay packagingWay) {
        this.packagingWay = packagingWay;
    }

    public Integer getDegree() {
        return degree;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取产品信息
     * @return
     */
    public abstract String getProductInfo();

    @Override
    public String toString() {
        return "BaseFood{" +
               "remark='" + remark + '\'' +
               ", packagingWay=" + packagingWay +
               ", degree=" + degree +
               ", price=" + price +
               '}';
    }
}
