package com.kylesmit.ayoconverterserver.units;

import com.kylesmit.ayoconverterserver.enums.ConverterType;

import java.util.Optional;

/**
 * @author kylesmit
 * Date: 2020/11/09
 */
public class ConverterFactory {

  public static Optional<Converter> getUnitConverter(ConverterType type) {

    switch (type) {
      case LENGTH:
        return Optional.of(new Length());
      case TEMPERATURE:
        return Optional.of(new Temperature());
      case WEIGHT:
        return Optional.of(new Weight());
      default:
        return Optional.empty();
    }
  }
}
