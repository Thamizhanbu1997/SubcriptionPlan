package com.example.subcription;
import java.util.HashMap; 
import java.util.Map; 
 
import com.goaira.domain.ErrorResponse; 

 
import org.apache.logging.log4j.LogManager; 
import org.apache.logging.log4j.Logger; 
import org.springframework.http.HttpStatus; 
import org.springframework.http.ResponseEntity; 
import org.springframework.http.converter.HttpMessageNotReadableException; 
import org.springframework.validation.FieldError; 
import org.springframework.web.bind.annotation.ControllerAdvice; 
import org.springframework.web.bind.annotation.ExceptionHandler; 
import org.springframework.web.context.request.WebRequest; 
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException; 
 
@ControllerAdvice
public class GlobalExceptionHandler {
	 private static final Logger logger = LogManager.getLogger(GlobalExceptionHandler.class); 
     @ExceptionHandler(ResourceNotFoundException.class) 
     public ResponseEntity<?>resourceNotFoundException(ResourceNotFoundException ex, WebRequest request) { 
             logger.error("{}", ex.getMessage()); 
              ErrorResponse errorDetails = new ErrorResponse(ex.getMessage());  
             return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);  
     } 

     @ExceptionHandler(org.springframework.validation.BindException.class) 
     public ResponseEntity<Object> handleBindException(org.springframework.validation.BindException ex, WebRequest request) { 
              Map<String, String> errors = new HashMap<>(); 
              ex.getBindingResult().getAllErrors().forEach((error) -> { 
                 String fieldName = ((FieldError) error).getField(); 
                 String errorMessage = error.getDefaultMessage(); 
                     System.out.println("TValidation"); 
                 errors.put(fieldName, errorMessage); 
         }); 
             logger.error("{}", ex.getMessage()); 
              // ErrorResponse errorDetails = new ErrorResponse(HttpStatus.BAD_REQUEST.value(),HttpStatus.BAD_REQUEST.name(), ex.getMessage());  
             return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);  
     } 


      @ExceptionHandler(BadRequestException.class)  
      public ResponseEntity<?> badRequestException(BadRequestException ex, WebRequest request) { 
             logger.error("{}", ex.getMessage()); 
              ErrorResponse errorDetails = new ErrorResponse(ex.getMessage());  
             return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);  
     } 
      
     @ExceptionHandler(HttpMessageNotReadableException.class)  
      public ResponseEntity<?> messageNotReadable(HttpMessageNotReadableException ex, WebRequest request) { 
             logger.error("{}", ex.getMessage()); 
              ErrorResponse errorDetails = new ErrorResponse("BODY_IS_EMPTY");  
             return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);  
     } 

     @ExceptionHandler(MethodArgumentTypeMismatchException.class)  
      public ResponseEntity<?> argumentMismatch(MethodArgumentTypeMismatchException ex, WebRequest request) { 
             logger.error("{}", ex.getMessage()); 
             System.out.println("Method ARgument"); 
             System.out.println(ex.getParameter()); 
             System.out.println(ex.getParameter().getParameterName()); 
              ErrorResponse errorDetails = new ErrorResponse(ex.getParameter().getParameterName().toUpperCase()+"_INVALID");  
             return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);  
     } 


     @ExceptionHandler(Exception.class) 
     public ResponseEntity<Object> handleCommonException(Exception ex, WebRequest request) { 
             logger.error("TestMEssage {}",ex.getClass().getName()); 
             logger.error("Too.. {} ",ex); 
             logger.error("{}", ex.getMessage()); 
             ErrorResponse errorDetails = new ErrorResponse("INTERNAL_SERVER_ERROR"); 
             return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR); 
     } 
}
}
