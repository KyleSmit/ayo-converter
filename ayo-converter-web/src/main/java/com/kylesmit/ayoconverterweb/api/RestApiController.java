package com.kylesmit.ayoconverterweb.api;

import com.kylesmit.ayoconverterweb.enums.ConverterType;
import com.kylesmit.ayoconverterweb.exception.ConverterTypeException;
import com.kylesmit.ayoconverterweb.service.ConverterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kylesmit
 * Date: 2020/11/09
 */
@RequestMapping("/api/converter")
@RestController
@ResponseBody
public class RestApiController {

  private final ConverterService converterService;

  public RestApiController(ConverterService converterService) {
    this.converterService = converterService;
  }

  @GetMapping("/length/{conversion-type}/{units}")
  public double convertLength(@PathVariable("conversion-type") String conversionType, @PathVariable double units) throws ConverterTypeException {
    return converterService.convertUnits(ConverterType.LENGTH, conversionType, units);
  }

  @GetMapping("/temperature/{conversion-type}/{units}")
  public double convertTemperature(@PathVariable("conversion-type") String conversionType, @PathVariable double units) throws ConverterTypeException {
    return converterService.convertUnits(ConverterType.TEMPERATURE, conversionType, units);
  }

  @GetMapping("/weight/{conversion-type}/{units}")
  public double convertWeight(@PathVariable("conversion-type") String conversionType, @PathVariable double units) throws ConverterTypeException {
    return converterService.convertUnits(ConverterType.WEIGHT, conversionType, units);
  }
}
