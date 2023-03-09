package code;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RealCalculationService {

    private final int result;

    private static int result() {
        return 0;
    }
}
