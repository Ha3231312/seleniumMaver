
package com.anhtester.Common;

import java.util.Random;

public class CreateValueDynamic {

    public static String generateCompanyName() {
        Random random = new Random();
        int randomNum = random.nextInt(1000); // ví dụ tạo số từ 0 đến 999
        return "VNPT IT Ha Noi " + randomNum;
    }
}