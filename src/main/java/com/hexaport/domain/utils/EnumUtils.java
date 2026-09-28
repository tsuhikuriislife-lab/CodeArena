package com.hexaport.domain.utils;

public class EnumUtils {

    public static <E extends Enum<E>> boolean isInvalidEnum(Class<E> enumClass, String value){
        if (value == null || value.isBlank()){
            return false;
        }

        try {
            Enum.valueOf(enumClass, value.trim().toUpperCase());
            return true;
        } catch (IllegalArgumentException e ) {
            return true;
        }
    }
}
