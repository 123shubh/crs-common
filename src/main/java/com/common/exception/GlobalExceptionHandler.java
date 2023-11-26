package com.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ResponseBody
	@ExceptionHandler(InvalidDate.class)
	public ResponseEntity<String> invalidDate(InvalidDate invalidDate) {
		return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(invalidDate.getLocalizedMessage());
	}

	@ResponseBody
	@ExceptionHandler(RoomNotConfiguredException.class)
	public ResponseEntity<String> roomNotConfiguredException(RoomNotConfiguredException roomNotConfiguredException) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(roomNotConfiguredException.getLocalizedMessage());
	}

	@ResponseBody
	@ExceptionHandler(InventoryNotAvailableException.class)
	public ResponseEntity<String> inventoryNotAvailableException(
			InventoryNotAvailableException inventoryNotAvailableException) {
		return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE)
				.body(inventoryNotAvailableException.getLocalizedMessage());
	}

	@ResponseBody
	@ExceptionHandler(RequiredTagsNotPresentException.class)
	public ResponseEntity<String> requiredTagsNotPresentException(
			RequiredTagsNotPresentException requiredTagsNotPresentException) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(requiredTagsNotPresentException.getLocalizedMessage());
	}

	@ResponseBody
	@ExceptionHandler(AlreadyExistException.class)
	public ResponseEntity<String> alreadyExistException(AlreadyExistException alreadyExistException) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(alreadyExistException.getLocalizedMessage());
	}

	@ResponseBody
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<String> notFoundException(NotFoundException notFoundException) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(notFoundException.getLocalizedMessage());
	}

}
