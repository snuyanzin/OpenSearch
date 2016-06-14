/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.xpack.watcher.trigger.schedule.engine;

import org.apache.lucene.util.LuceneTestCase.BadApple;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.xpack.support.clock.SystemClock;
import org.elasticsearch.xpack.watcher.trigger.TriggerEngine;
import org.elasticsearch.xpack.watcher.trigger.schedule.ScheduleRegistry;

import static org.mockito.Mockito.mock;

//test is just too slow, please fix it to not be sleep-based
@BadApple(bugUrl = "https://github.com/elastic/x-plugins/issues/1007")
public class SchedulerScheduleEngineTests extends BaseTriggerEngineTestCase {

    protected TriggerEngine createEngine() {
        return new SchedulerScheduleTriggerEngine(Settings.EMPTY, mock(ScheduleRegistry.class), SystemClock.INSTANCE);
    }

}
