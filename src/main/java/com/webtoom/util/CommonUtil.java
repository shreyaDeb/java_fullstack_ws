package com.webtoom.util;

public final class CommonUtil
{
    private CommonUtil()
    {
        public static String MaskAccountNumber(String accNumber)
        {
            return "******" + accNumber.substring(accNumber.length()-4);
        }
    }

}
