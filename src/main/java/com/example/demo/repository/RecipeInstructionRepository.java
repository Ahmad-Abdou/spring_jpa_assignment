package com.example.demo.repository;

import com.example.demo.entity.RecipeInstruction;
import org.springframework.data.repository.CrudRepository;

public interface RecipeInstructionRepository extends CrudRepository<RecipeInstruction,String> {

}
