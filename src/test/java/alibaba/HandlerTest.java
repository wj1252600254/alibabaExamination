package alibaba;

import alibaba.factory.AllocationSupplyResult;
import alibaba.factory.Generator;
import alibaba.method.Handler;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class HandlerTest {
    Generator generator = new Generator();

    /**
     * 测试邮箱所给案例1
     * 邮箱给的案例数据有误
     */
    @Test
    public void testExample1() {
        ArrayList<AllocationSupplyResult> allocationSupplyResults = generator.example1();
        Handler.allocate(allocationSupplyResults, 5000);
        System.out.println(allocationSupplyResults);
    }

    /**
     * 测试邮箱所给案例2
     */
    @Test
    public void testExample2() {
        ArrayList<AllocationSupplyResult> allocationSupplyResults = generator.example2();
        ArrayList<AllocationSupplyResult> result = generator.result2();
        Handler.allocate(allocationSupplyResults, 15);
        for (int i = 0; i < allocationSupplyResults.size(); i++) {
            Assert.assertEquals(allocationSupplyResults.get(i), result.get(i));
        }
    }

    /**
     * 测试
     */
    @Test
    public void test() {
        ArrayList<AllocationSupplyResult> allocationSupplyResults = new ArrayList<>();
        allocationSupplyResults.add(new AllocationSupplyResult(0, 1, 0, 1));
        allocationSupplyResults.add(new AllocationSupplyResult(1, 3, 0, 3));
        allocationSupplyResults.add(new AllocationSupplyResult(2, 3, 0, 3));
        ArrayList<AllocationSupplyResult> result = new ArrayList<>();
        result.add(new AllocationSupplyResult(0, 1, 0, 1));
        result.add(new AllocationSupplyResult(1, 3, 1, 2));
        result.add(new AllocationSupplyResult(2, 3, 0, 3));
        Handler.allocate(allocationSupplyResults, 1);
        for (int i = 0; i < allocationSupplyResults.size(); i++) {
            Assert.assertEquals(allocationSupplyResults.get(i), result.get(i));
        }
    }

    /**
     *
     */
    @Test
    public void test1() {
        ArrayList<AllocationSupplyResult> allocationSupplyResults = new ArrayList<>();
        allocationSupplyResults.add(new AllocationSupplyResult(0, 1, 0, 1));
        allocationSupplyResults.add(new AllocationSupplyResult(1, 3, 0, 3));
        allocationSupplyResults.add(new AllocationSupplyResult(2, 3, 0, 3));
        ArrayList<AllocationSupplyResult> result = new ArrayList<>();
        result.add(new AllocationSupplyResult(0, 1, 0, 1));
        result.add(new AllocationSupplyResult(1, 3, 2, 1));
        result.add(new AllocationSupplyResult(2, 3, 1, 2));
        Handler.allocate(allocationSupplyResults, 3);
        for (int i = 0; i < allocationSupplyResults.size(); i++) {
            Assert.assertEquals(allocationSupplyResults.get(i), result.get(i));
        }
    }

    /**
     * 测试判断输入数据是否正确
     */
    @Test
    public void test4() {
        ArrayList<AllocationSupplyResult> allocationSupplyResults = new ArrayList<>();
        allocationSupplyResults.add(new AllocationSupplyResult(0, 1, 0, 2));
        try {
            Handler.allocate(allocationSupplyResults, 3);
        } catch (Exception e) {
            System.out.println("判断成功");
            e.printStackTrace();
        }
    }

}
