package com.inocybe.api.docs.pipeline;

import javax.xml.transform.Source;
import java.util.List;

public interface Pipeline {

   List<Source> getResultPort(String name);

   void run(List<PipelineInput<?>> inputs) throws PipelineException;

   void run(PipelineInput<?>... inputs);

   void reset();
}
