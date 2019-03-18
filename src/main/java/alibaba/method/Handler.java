package alibaba.method;

import alibaba.factory.AllocationSupplyResult;

import java.util.ArrayList;

public class Handler {
    /**
     * @param allocationSupplyResults 要处理的数据
     */
    public static void allocate(ArrayList<AllocationSupplyResult> allocationSupplyResults, int pay) {
        //检测输入数据是否有误，支付前和支付后的数据应该是相等的
        for(AllocationSupplyResult temp:allocationSupplyResults){
            if(temp.getPreAllocationShotfalls()!=temp.getAfterAllocationShotfalls())
                try {
                    throw new Exception("需要处理的数据有误，支付前和支付后的数值应该相等！");
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }
        int size = allocationSupplyResults.size();
        int i = size;
        //按资金池的支出前金额大小，从小到大排序
        allocationSupplyResults.sort((o1, o2) -> Integer.compare(o1.getPreAllocationShotfalls(), o2.getPreAllocationShotfalls()));
        while (pay != 0) {
            //游标
            i = size - 1;
            int count = 1;
            //找出余额相等的行（从末尾开始，末尾余额只可能是大于等于前面余额）
            while (i > 0 && allocationSupplyResults.get(i).getAfterAllocationShotfalls() == allocationSupplyResults.get(i - 1).getAfterAllocationShotfalls()) {
                i--;
                count++;
            }
            //i!=0表示支付后不是所有余额都相等
            if (i > 0) {
                int diff = allocationSupplyResults.get(i).getAfterAllocationShotfalls() - allocationSupplyResults.get(i - 1).getAfterAllocationShotfalls();
                if (pay - count * diff > 0) {
                    for (int j = size - 1; j >= i; j--) {
                        int cur = allocationSupplyResults.get(j).getAfterAllocationShotfalls();
                        int cur1 = allocationSupplyResults.get(j).getAllocationShotfalls();
                        allocationSupplyResults.get(j).setAllocationShotfalls(cur1 + diff);
                        allocationSupplyResults.get(j).setAfterAllocationShotfalls(cur - diff);
                        pay -= diff;
                    }
                } else {
                    int n = pay / count;
                    int mod = pay - n * count;

                    if (n != 0) {
                        for (int j = size - 1; j >= i; j--) {
                            int cur = allocationSupplyResults.get(j).getAfterAllocationShotfalls();
                            int cur1 = allocationSupplyResults.get(j).getAllocationShotfalls();
                            allocationSupplyResults.get(j).setAllocationShotfalls(n + cur1);
                            allocationSupplyResults.get(j).setAfterAllocationShotfalls(cur - n);
                            pay -= n;
                        }
                    }
                    if (mod != 0) {
                        while (pay != 0) {
                            int cur = allocationSupplyResults.get(i).getAfterAllocationShotfalls();
                            int cur1 = allocationSupplyResults.get(i).getAllocationShotfalls();
                            allocationSupplyResults.get(i).setAllocationShotfalls(cur1 + 1);
                            allocationSupplyResults.get(i).setAfterAllocationShotfalls(cur - 1);
                            i++;
                            pay -= 1;
                        }
                    }
                }
            } else {  //表示支付后余额都相等
                int n = pay / size;
                int mod = pay - n * size;
                if (n != 0) {
                    for (int j = size - 1; j >= 0; j--) {
                        int cur = allocationSupplyResults.get(j).getAfterAllocationShotfalls();
                        int cur1 = allocationSupplyResults.get(j).getAllocationShotfalls();
                        allocationSupplyResults.get(j).setAllocationShotfalls(n + cur1);
                        allocationSupplyResults.get(j).setAfterAllocationShotfalls(cur - n);
                        pay -= n;
                    }
                }
                if (mod != 0) {
                    while (pay != 0) {
                        int cur = allocationSupplyResults.get(i).getAfterAllocationShotfalls();
                        int cur1 = allocationSupplyResults.get(i).getAllocationShotfalls();
                        allocationSupplyResults.get(i).setAllocationShotfalls(cur1 + 1);
                        allocationSupplyResults.get(i).setAfterAllocationShotfalls(cur - 1);
                        i++;
                        pay -= 1;
                    }
                }
            }
        }
        allocationSupplyResults.sort((o1, o2) -> Integer.compare(o1.getFundPoolId(), o2.getFundPoolId()));
    }


}