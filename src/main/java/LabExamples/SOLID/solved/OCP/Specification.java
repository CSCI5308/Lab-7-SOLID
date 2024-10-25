package LabExamples.SOLID.solved.OCP;

public interface Specification<T> {

	boolean isSatisfied(T item);
}
