package com.kylesmit.ayoconverterserver.units;

import com.kylesmit.ayoconverterserver.enums.UnitConverterType;

/**
 * @author kylesmit
 * Date: 2020/11/09
 */
public class Temperature implements Converter {

  @Override
  public double convertUnits(double unitAmount, UnitConverterType type) {
    return Math.round((unitAmount + type.getBaseAmount()) * 100D) / 100D;
  }
}
