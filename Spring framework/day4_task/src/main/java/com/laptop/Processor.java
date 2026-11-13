package com.laptop;

public class Processor
{
  private int processorId;
  private String processorName;
  private String generation;
  
  public Processor()
  {}

  public int getProcessorId() {
	return processorId;
  }

  public void setProcessorId(int processorId) {
	this.processorId = processorId;
  }

  public String getProcessorName() {
	return processorName;
  }

  public void setProcessorName(String processorName) {
	this.processorName = processorName;
  }

  public String getGeneration() {
	return generation;
  }

  public void setGeneration(String generation) {
	this.generation = generation;
  }

  @Override
  public String toString() {
	return "Processor [processorId=" + processorId + ", processorName=" + processorName + ", generation=" + generation
			+ "]";
  }

}
