package com.ruoyi.common.core.text;

import com.p6spy.engine.spy.appender.MessageFormattingStrategy;
import com.ruoyi.common.utils.StringUtils;

/**
 * @Classname P6spyLogFormat
 * @Description TODO
 * @Date 2022/4/1 22:57
 * @Created by 1
 */
public class P6spyLogFormat implements MessageFormattingStrategy {

    @Override
    public String formatMessage(int connectionId, String now, long elapsed, String category, String prepared, String sql, String url) {
        return !StringUtils.isEmpty(sql) ? "Execute SQL：" + sql.replaceAll("[\\s]+", " ") : null;
    }
}
