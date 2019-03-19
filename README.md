#项目结构
src
-main
--java
---alibaba
----factory   
-----AllocationSupplyResult  
-----Factory   
-----Generator  有生成随机测试案例的方法，有返回邮箱测试案例的方法
----method    
-----Handler  类中有处理数据的方法
test
-java
--alibaba
---HandlerTest  方法测试

#功能实现
Handler.allocate(ArrayList<AllocationSupplyResult> allocationSupplyResults, int pay) 
输入:N个资金池，以及需要支出的金额
输出:支出后资金差额最小
函数加了数据正确性的判断，如果输入资金池的支出前和支付后的数值不一样(初始数据，支付为0)，会报错。
