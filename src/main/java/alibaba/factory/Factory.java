package alibaba.factory;

import java.util.ArrayList;

/**
 * 工厂接口
 */
public interface Factory {
    ArrayList<AllocationSupplyResult> generate(int number,int range);
}
