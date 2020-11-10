package com.kylesmit.ayoconverterserver.exception;

import com.kylesmit.ayoconverterserver.domain.RestResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author kylesmit
 * Date: 2020/11/09
 */
@ControllerAdvice
public class AyoConverterExceptionHandler extends ResponseEntityExceptionHandler {

  private static final Logger LOGGER = LoggerFactory.getLogger(AyoConverterExceptionHandler.class);

  @ExceptionHandler(value = {ConverterTypeException.class})
  protected ResponseEntity<Object> handleConverterException(ConverterTypeException cte, WebRequest webRequest) {
    LOGGER.error(cte.getMessage());

    RestResponse response = new RestResponse();
    Error error = new Error();
    error.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
    error.setMessage(cte.getMessage());
    response.setError(error);

    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);

    return handleExceptionInternal(cte, response, headers, HttpStatus.CONFLICT, webRequest);
  }
}
