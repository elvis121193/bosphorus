package org.bosphorus.api.builder.stream.source;

public interface ISourceStreamCollection<TType> {
	IListSourceStream<TType> getStream(Integer index);
	IListSourceStream<TType> getStream(String name);
}
