package com.kylesmit.ayoconverterweb.enums;

import com.kylesmit.ayoconverterweb.exception.ConverterTypeException;

/**
 * @author kylesmit
 * Date: 2020/11/09
 */
public class UnitConverterTypeFactory {

  public static UnitConverterType getUnitConverterType(ConverterType type, String unitConverterType) throws ConverterTypeException {

    try {

      switch (type) {
        case LENGTH:
          return LengthConversionType.valueOf(unitConverterType);
        case TEMPERATURE:
          return TemperatureConversionType.valueOf(unitConverterType);
        case WEIGHT:
          return WeightConversionType.valueOf(unitConverterType);
        default:
          throw new ConverterTypeException("Converter (" + type + ") does not exist");
      }
    } catch (IllegalArgumentException iae) {
      throw new ConverterTypeException("Conversion values (" + unitConverterType + ") under converter (" + type + ") has no implementation");
    }
  }
}
