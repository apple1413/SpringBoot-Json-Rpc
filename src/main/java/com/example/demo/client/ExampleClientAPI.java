package com.example.demo.client;

import com.googlecode.jsonrpc4j.JsonRpcParam;

public interface ExampleClientAPI {
	int multiplier(@JsonRpcParam(value = "a") int a, @JsonRpcParam(value = "b") int b);

	// int multiplier(int a, int b);
}
