package cn.ok.smp.scheduled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Kyou on 2017/11/5 17:42.
 * PACKAGE_NAME: cn.ok.smp.scheduled
 * PROJECT_NAME: smp
 */
@Component
public class ScheduledTasks {
    private static final Logger _log = LoggerFactory.getLogger(ScheduledTasks.class);

    @Scheduled(fixedRate = 1000)
    public void task1() {
        _log.debug("task1");
    }
}
