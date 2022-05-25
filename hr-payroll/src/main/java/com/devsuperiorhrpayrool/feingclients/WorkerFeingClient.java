package com.devsuperiorhrpayrool.feingclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.devsuperiorhrpayrool.entities.Worker;


@Component
@FeignClient(name = "hr-worker", path = "/workers")
public interface WorkerFeingClient {
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker>findById(@PathVariable Long id);
	
	
}
