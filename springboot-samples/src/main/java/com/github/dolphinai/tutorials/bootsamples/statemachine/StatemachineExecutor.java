package com.github.dolphinai.tutorials.bootsamples.statemachine;

import com.github.dolphinai.tutorials.bootsamples.common.ResultMap;

public interface StatemachineExecutor {

	ResultMap start(String processId, String actor);

	ResultMap execute(ProcessContext context, String command, String comment);

}
