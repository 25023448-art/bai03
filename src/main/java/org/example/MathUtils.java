package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {
    private static final Logger logger = LoggerFactory.getLogger(MathUtils.class);

    public double divide(int a, int b) {
        logger.info("Thực hiện phép chia: {} / {}", a, b);
        if (b == 0) {
            logger.error("Lỗi: Chia cho số không!");
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }
}