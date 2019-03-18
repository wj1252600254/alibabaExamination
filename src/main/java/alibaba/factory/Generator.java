package alibaba.factory;

import java.util.ArrayList;
import java.util.Random;

/**
 * 实现工厂接口，用于产生测试数据
 */
public class Generator implements Factory {
    /**
     * 用于生成随机的测试案例
     *
     * @param number 资金池数量的大小
     * @param range  余额的范围
     * @return
     */
    @Override
    public ArrayList<AllocationSupplyResult> generate(int number, int range) {
        Random random = new Random();
        int id = 0;
        ArrayList<AllocationSupplyResult> allocationSupplyResults = new ArrayList<>();
        while (number-- > 0) {
            int money = random.nextInt(range + 1);
            allocationSupplyResults.add(new AllocationSupplyResult(id++, money, 0, money));
        }
        return allocationSupplyResults;
    }

    /**
     * 邮箱测试案例1
     *
     * @return
     */
    public ArrayList<AllocationSupplyResult> example1() {
        ArrayList<AllocationSupplyResult> allocationSupplyResults = new ArrayList<>();
        allocationSupplyResults.add(new AllocationSupplyResult(0, 20, 0, 20));
        allocationSupplyResults.add(new AllocationSupplyResult(1, 47, 0, 47));
        allocationSupplyResults.add(new AllocationSupplyResult(2, 21, 0, 21));
        allocationSupplyResults.add(new AllocationSupplyResult(3, 41, 0, 41));
        allocationSupplyResults.add(new AllocationSupplyResult(4, 29, 0, 29));
        allocationSupplyResults.add(new AllocationSupplyResult(5, 9, 0, 9));
        allocationSupplyResults.add(new AllocationSupplyResult(6, 76, 0, 76));
        allocationSupplyResults.add(new AllocationSupplyResult(7, 97, 0, 97));
        allocationSupplyResults.add(new AllocationSupplyResult(8, 29, 0, 29));
        allocationSupplyResults.add(new AllocationSupplyResult(9, 66, 0, 66));
        allocationSupplyResults.add(new AllocationSupplyResult(10, 60, 0, 60));
        allocationSupplyResults.add(new AllocationSupplyResult(11, 92, 0, 92));
        allocationSupplyResults.add(new AllocationSupplyResult(12, 94, 0, 94));
        allocationSupplyResults.add(new AllocationSupplyResult(13, 27, 0, 27));
        allocationSupplyResults.add(new AllocationSupplyResult(14, 43, 0, 43));
        allocationSupplyResults.add(new AllocationSupplyResult(15, 75, 0, 75));
        allocationSupplyResults.add(new AllocationSupplyResult(16, 41, 0, 41));
        allocationSupplyResults.add(new AllocationSupplyResult(17, 74, 0, 74));
        allocationSupplyResults.add(new AllocationSupplyResult(18, 64, 0, 64));
        allocationSupplyResults.add(new AllocationSupplyResult(19, 61, 0, 61));
        return allocationSupplyResults;
    }


    /**
     * 邮箱测试案例2
     *
     * @return
     */
    public ArrayList<AllocationSupplyResult> example2() {
        ArrayList<AllocationSupplyResult> allocationSupplyResults = new ArrayList<>();
        allocationSupplyResults.add(new AllocationSupplyResult(1, 1, 0, 1));
        allocationSupplyResults.add(new AllocationSupplyResult(1, 2, 0, 2));
        allocationSupplyResults.add(new AllocationSupplyResult(1, 3, 0, 3));
        allocationSupplyResults.add(new AllocationSupplyResult(1, 4, 0, 4));
        allocationSupplyResults.add(new AllocationSupplyResult(1, 5, 0, 5));
        allocationSupplyResults.add(new AllocationSupplyResult(1, 6, 0, 6));
        allocationSupplyResults.add(new AllocationSupplyResult(1, 7, 0, 7));
        allocationSupplyResults.add(new AllocationSupplyResult(1, 8, 0, 8));
        allocationSupplyResults.add(new AllocationSupplyResult(1, 9, 0, 9));
        allocationSupplyResults.add(new AllocationSupplyResult(1, 10, 0, 10));
        return allocationSupplyResults;
    }

    /**
     * 邮箱测试案例结果2
     *
     * @return
     */
    public ArrayList<AllocationSupplyResult> result2() {
        ArrayList<AllocationSupplyResult> allocationSupplyResults = new ArrayList<>();
        allocationSupplyResults.add(new AllocationSupplyResult(1, 1, 0, 1));
        allocationSupplyResults.add(new AllocationSupplyResult(1, 2, 0, 2));
        allocationSupplyResults.add(new AllocationSupplyResult(1, 3, 0, 3));
        allocationSupplyResults.add(new AllocationSupplyResult(1, 4, 0, 4));
        allocationSupplyResults.add(new AllocationSupplyResult(1, 5, 0, 5));
        allocationSupplyResults.add(new AllocationSupplyResult(1, 6, 1, 5));
        allocationSupplyResults.add(new AllocationSupplyResult(1, 7, 2, 5));
        allocationSupplyResults.add(new AllocationSupplyResult(1, 8, 3, 5));
        allocationSupplyResults.add(new AllocationSupplyResult(1, 9, 4, 5));
        allocationSupplyResults.add(new AllocationSupplyResult(1, 10, 5, 5));
        return allocationSupplyResults;
    }


}
