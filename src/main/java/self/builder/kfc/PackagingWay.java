package self.builder.kfc;

/**
 *
 * @author lingliang 2018年08月2018/8/5日 下午9:01
 */
public enum PackagingWay {

    EASY_PACKAGING("简单包装"),
    COMPLEX_PACKAGING("复杂包装");

    String way;

    PackagingWay(String way) {
        this.way = way;
    }

    public String getWay() {
        return way;
    }

    public static PackagingWay getByCode(String packagingWay){
        if(packagingWay == null){
            return null;
        }
        for(PackagingWay way:PackagingWay.values()){
            if(packagingWay.equals(way.getWay())){
                return way;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "PackagingWay{" +
               "way='" + way + '\'' +
               '}';
    }
}
