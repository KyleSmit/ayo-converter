package com.kylesmit.ayoconverterweb.units;

import com.kylesmit.ayoconverterweb.enums.UnitConverterType;

/**
 * @author kylesmit
 * Date: 2020/11/09
 */
public class Length implements Converter {

  @Override
  public double convertUnits(double unitAmount, UnitConverterType unitConverterType) {
    return Math.round((unitAmount * unitConverterType.getBaseAmount()) * 100D) / 100D;
  }
}
