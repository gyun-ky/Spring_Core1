package hello.advanced.trace.threadlocal.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FieldService {

    private String nameStore;

    public String logic(String name) {
        log.info("์ ์ฅ name={} --> nameStore={}", name, nameStore);
        nameStore = name;
        sleep(1000);
        log.info("์กฐํ nameStore={}", nameStore);
        return nameStore;
    }

    private void sleep(int milllis) {
        try {
            Thread.sleep(milllis);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
