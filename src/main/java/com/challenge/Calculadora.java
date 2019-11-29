package com.challenge;

import java.math.BigDecimal;

import com.challenge.annotation.Somar;
import com.challenge.annotation.Subtrair;


public class Calculadora  {

        @Somar(value="50.00")
        private BigDecimal v1;

        @Subtrair(value="5.00")
        private BigDecimal v2;

        @Somar(value="35.40")
        private BigDecimal v3;

        @Subtrair(value="20.00")
        private BigDecimal v4;


}
