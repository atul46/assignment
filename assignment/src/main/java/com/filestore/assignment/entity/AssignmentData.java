package com.filestore.assignment.entity;

import java.time.LocalDateTime;
import java.util.HashMap;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * The Class AssignmentData.
 * 
 * @author Srinivasan
 */
@Document(collection = "data", language = "eng")
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class AssignmentData {

	/** The id. */
	@Id
	private String id;

	@Indexed(name = "key", unique = true)
	@Size(min = 1, max = 32, message = "key cannot be greater than 32 or less than 1")
	@NotBlank
	private String key;


	/** The value. */
	@NotBlank
	private Object value;

	private transient LocalDateTime createdAt;

}
