/**
 * Copyright 2012-2013 LMAX Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.lmax.ant.paralleljunit.util.process;

import com.lmax.ant.paralleljunit.ParallelJUnitTaskConfig;

import org.apache.tools.ant.taskdefs.ExecuteWatchdog;

public class ExecuteWatchdogFactory
{
    public ExecuteWatchdog create(final ParallelJUnitTaskConfig config)
    {
        final long timeout = config.getTimeout();
        return timeout > 0 ? new ExecuteWatchdog(timeout) : NoOpExecuteWatchdog.INSTANCE;
    }
}
