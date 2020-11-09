package com.kylesmit.ayoconverterweb.units;

import com.kylesmit.ayoconverterweb.enums.UnitConverterType;

/**
 * @author kylesmit
 * Date: 2020/11/09
 */
public class Weight implements Converter {

  @Override
  public double convertUnits(double unitAmount, UnitConverterType type) {
    return Math.round((unitAmount * type.getBaseAmount()) * 100D) / 100D;
  }
}
