package com.kylesmit.ayoconverterserver.interceptor;

import com.kylesmit.ayoconverterserver.domain.RestResponse;
import org.springframework.core.MethodParameter;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @author kylesmit
 * Date: 2020/11/09
 */
@ControllerAdvice
public class RestResponseHandler implements ResponseBodyAdvice<Object> {

  @Override
  public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
    return (AnnotationUtils.findAnnotation(returnType.getContainingClass(), ResponseBody.class) != null ||
      returnType.getMethodAnnotation(ResponseBody.class) != null);
  }

  @Override
  public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
                                Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
    RestResponse restResponse = new RestResponse();
    restResponse.setSuccess(true);
    restResponse.setData(body);
    return restResponse;
  }
}
