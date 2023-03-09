package code;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Calculator {

    public int add(int left, int right) {
        log.debug("debug message");
        log.info("info message");
        log.warn("warn message");
        log.error("error message");
        return left + right;
    }
    public int subtract(int left, int right) {
        return left - right;
    }


}
