package org.bosphorus.topology.node;

import java.util.List;

import org.bosphorus.stream.pipe.IPipe;

public interface IWriteNode<TInput> extends IBaseNode {
	
	List<IStreamDefinition> defineInput();

	List<IPipe<TInput>> getInputs();

}
