package com.kylesmit.ayoconverterserver.service;

import com.kylesmit.ayoconverterserver.enums.ConverterType;
import com.kylesmit.ayoconverterserver.enums.LengthConversionType;
import com.kylesmit.ayoconverterserver.enums.TemperatureConversionType;
import com.kylesmit.ayoconverterserver.enums.WeightConversionType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author kylesmit
 * Date: 2020/11/09
 */
class ConverterServiceTest {

  ConverterService converterService;

  @BeforeEach
  public void setup() {
    converterService = new ConverterService();
  }

  @Test
  public void convertLength() throws Exception {
    String conversionType = LengthConversionType.KILOMETER_TO_MILE.toString();
    double kilometers = 75;

    double miles = converterService.convertUnits(ConverterType.LENGTH, conversionType, kilometers);
    assertEquals(46.60, miles);
  }

  @Test
  public void convertTemperature() throws Exception {
    String conversionType = TemperatureConversionType.CELSIUS_TO_KELVIN.toString();
    double celsius = 28;

    double kelvin = converterService.convertUnits(ConverterType.TEMPERATURE, conversionType, celsius);
    assertEquals(301.15, kelvin);
  }

  @Test
  public void convertWeight() throws Exception {
    ConverterType weightConverter = ConverterType.WEIGHT;
    String weightConversionType = WeightConversionType.KILOGRAM_TO_POUND.toString();
    double kilograms = 88;

    double pounds = converterService.convertUnits(weightConverter, weightConversionType, kilograms);
    assertEquals(194.01, pounds);
  }

}
