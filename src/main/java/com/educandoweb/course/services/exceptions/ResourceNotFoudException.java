package com.educandoweb.course.services.exceptions;

public class ResourceNotFoudException extends RuntimeException{

	private static final long serialVersionUID = 1L;

		public ResourceNotFoudException(Object id) {
			super("Resource Not Foud. id " + id);
		}
}
