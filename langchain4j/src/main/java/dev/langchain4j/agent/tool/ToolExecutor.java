package dev.langchain4j.agent.tool;

import java.util.Collections;
import java.util.Map;

public interface ToolExecutor {

    default String execute(ToolExecutionRequest toolExecutionRequest, Object memoryId) {
        return execute(toolExecutionRequest, memoryId, Collections.emptyMap());
    }

    String execute(ToolExecutionRequest toolExecutionRequest, Object memoryId, Map<?, ?> userData);
}
