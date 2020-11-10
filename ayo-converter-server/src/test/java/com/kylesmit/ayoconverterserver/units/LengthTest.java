package com.kylesmit.ayoconverterserver.units;

import com.kylesmit.ayoconverterserver.enums.LengthConversionType;
import com.kylesmit.ayoconverterserver.enums.UnitConverterType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * @author kylesmit
 * Date: 2020/11/09
 */
class LengthTest {

  @Test
  void convertKilometerToMiles() {
    double kilometers = 45;
    UnitConverterType type = LengthConversionType.KILOMETER_TO_MILE;

    Length length = new Length();
    double miles = length.convertUnits(kilometers, type);
    assertEquals(27.96, miles);

    //Zero Testing
    length = new Length();
    double zeroMiles = length.convertUnits(0, type);
    assertEquals(0, zeroMiles);

  }

  @Test
  void convertMilesToKilometers() {
    double miles = 30;
    UnitConverterType type = LengthConversionType.MILE_TO_KILOMETER;

    Length length = new Length();
    double kilometers = length.convertUnits(miles, type);
    assertEquals(48.28, kilometers);

    //Zero Testing
    length = new Length();
    double zeroKilometers = length.convertUnits(0, type);
    assertEquals(0, zeroKilometers);

  }
}
