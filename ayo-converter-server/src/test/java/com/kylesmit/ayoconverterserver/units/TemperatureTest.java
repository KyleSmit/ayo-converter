package com.kylesmit.ayoconverterserver.units;

import com.kylesmit.ayoconverterserver.enums.TemperatureConversionType;
import com.kylesmit.ayoconverterserver.enums.UnitConverterType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author kylesmit
 * Date: 2020/11/09
 */
class TemperatureTest {

  @Test
  void convertKelvinToCelsius() {
    double kelvin = 358;
    UnitConverterType type = TemperatureConversionType.KELVIN_TO_CELSIUS;

    Temperature temperature = new Temperature();
    double celsius = temperature.convertUnits(kelvin, type);
    assertEquals(84.85, celsius);
  }

  @Test
  void convertCelsiusToKelvin() {
    double celsius = 36;
    UnitConverterType type = TemperatureConversionType.CELSIUS_TO_KELVIN;

    Temperature temperature = new Temperature();
    double kelvin = temperature.convertUnits(celsius, type);
    assertEquals(309.15, kelvin);
  }
}
