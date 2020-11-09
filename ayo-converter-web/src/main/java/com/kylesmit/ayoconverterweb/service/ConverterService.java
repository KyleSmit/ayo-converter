package com.kylesmit.ayoconverterweb.service;

import com.kylesmit.ayoconverterweb.enums.ConverterType;
import com.kylesmit.ayoconverterweb.enums.UnitConverterType;
import com.kylesmit.ayoconverterweb.enums.UnitConverterTypeFactory;
import com.kylesmit.ayoconverterweb.exception.ConverterTypeException;
import com.kylesmit.ayoconverterweb.units.Converter;
import com.kylesmit.ayoconverterweb.units.ConverterFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author kylesmit
 * Date: 2020/11/09
 */
@Service
public class ConverterService {

  public double convertUnits(ConverterType type, String unitConverterType, double units) throws ConverterTypeException {
    Optional<Converter> converterFactory = ConverterFactory.getUnitConverter(type);

    if (converterFactory.isPresent()) {
      Converter converter = converterFactory.get();
      UnitConverterType converterType = UnitConverterTypeFactory.getUnitConverterType(type, unitConverterType);
      return converter.convertUnits(units, converterType);
    } else {
      throw new ConverterTypeException("Converter for " + type + " has no implementation.");
    }
  }
}
