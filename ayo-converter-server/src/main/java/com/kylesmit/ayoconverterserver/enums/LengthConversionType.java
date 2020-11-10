package com.kylesmit.ayoconverterserver.enums;

/**
 * @author kylesmit
 * Date: 2020/11/09
 */
public enum LengthConversionType implements UnitConverterType {
  MILE_TO_KILOMETER(1.609344),
  KILOMETER_TO_MILE(0.62137119);

  private double baseAmount;

  LengthConversionType(double baseAmount) {
    this.baseAmount = baseAmount;
  }

  public double getBaseAmount() {
    return baseAmount;
  }
}
