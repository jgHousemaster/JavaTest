// 时间与日期相关的工具
package tools;

import java.time.LocalDateTime;

public class Dates {
    public static int weekCalculator(){
        // 此函数计算今天是本年度的第几周并返回数字，跨年需修改firstDay参数

        // 这一年的第一天是周几（不用减一）
        // 2023年此值为7
        int firstDay = 6;

        LocalDateTime currentTime = LocalDateTime.now();
        int day = currentTime.getDayOfYear();
        int result = (day + firstDay - 2) / 7 + 1;
        return result;
    }

    public static int weekCalculator(int day){
        // 这一年的第一天是周几（不用减一）
        int firstDay = 6;

        int result = (day + firstDay - 2) / 7 + 1;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("现在是2022年的第" + weekCalculator() + "/" + weekCalculator(365) + "周。");
    }
}
