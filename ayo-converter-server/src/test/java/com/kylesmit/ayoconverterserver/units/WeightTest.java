package com.kylesmit.ayoconverterserver.units;

import com.kylesmit.ayoconverterserver.enums.WeightConversionType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author kylesmit
 * Date: 2020/11/09
 */
class WeightTest {

  @Test
  void convertKilogramsToPounds() {
    double kilograms = 65;
    WeightConversionType type = WeightConversionType.KILOGRAM_TO_POUND;

    Weight weight = new Weight();
    double pounds = weight.convertUnits(kilograms, type);
    assertEquals(143.30, pounds);

    //  Zero Testing
    weight = new Weight();
    double ZeroPounds = weight.convertUnits(0, type);
    assertEquals(0, ZeroPounds);
  }

  @Test
  void convertPoundsToKilograms() {
    double pounds = 180;
    WeightConversionType type = WeightConversionType.POUND_TO_KILOGRAM;

    Weight weight = new Weight();
    double kilograms = weight.convertUnits(pounds, type);
    assertEquals(81.65, kilograms);

    //Zero Testing
    weight = new Weight();
    double ZeroKilograms = weight.convertUnits(0, type);
    assertEquals(0, ZeroKilograms);
  }
}
