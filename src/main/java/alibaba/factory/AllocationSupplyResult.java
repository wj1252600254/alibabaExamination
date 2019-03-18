package alibaba.factory;

import java.util.Objects;

public class AllocationSupplyResult {
    //资金池标示
    private int fundPoolId;
    //支出前
    private int preAllocationShotfalls;
    //支出数量
    private int allocationShotfalls;
    //支出后
    private int afterAllocationShotfalls;

    public AllocationSupplyResult(int fundPoolId, int preAllocationShotfalls, int allocationShotfalls, int afterAllocationShotfalls) {
        this.fundPoolId = fundPoolId;
        this.preAllocationShotfalls = preAllocationShotfalls;
        this.allocationShotfalls = allocationShotfalls;
        this.afterAllocationShotfalls = afterAllocationShotfalls;
    }

    public AllocationSupplyResult() {
    }

    public int getFundPoolId() {
        return fundPoolId;
    }

    public void setFundPoolId(int fundPoolId) {
        this.fundPoolId = fundPoolId;
    }

    public int getPreAllocationShotfalls() {
        return preAllocationShotfalls;
    }

    public void setPreAllocationShotfalls(int preAllocationShotfalls) {
        this.preAllocationShotfalls = preAllocationShotfalls;
    }

    public int getAllocationShotfalls() {
        return allocationShotfalls;
    }

    public void setAllocationShotfalls(int allocationShotfalls) {
        this.allocationShotfalls = allocationShotfalls;
    }

    public int getAfterAllocationShotfalls() {
        return afterAllocationShotfalls;
    }

    public void setAfterAllocationShotfalls(int afterAllocationShotfalls) {
        this.afterAllocationShotfalls = afterAllocationShotfalls;
    }

    @Override
    public String toString() {
        return "AllocationSupplyResult{" +
                "fundPoolId=" + fundPoolId +
                ", preAllocationShotfalls=" + preAllocationShotfalls +
                ", allocationShotfalls=" + allocationShotfalls +
                ", afterAllocationShotfalls=" + afterAllocationShotfalls +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AllocationSupplyResult that = (AllocationSupplyResult) o;
        return fundPoolId == that.fundPoolId &&
                preAllocationShotfalls == that.preAllocationShotfalls &&
                allocationShotfalls == that.allocationShotfalls &&
                afterAllocationShotfalls == that.afterAllocationShotfalls;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fundPoolId, preAllocationShotfalls, allocationShotfalls, afterAllocationShotfalls);
    }
}
