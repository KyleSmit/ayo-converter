package com.kylesmit.ayoconverterweb.enums;

/**
 * @author kylesmit
 * Date: 2020/11/09
 */
public enum WeightConversionType implements UnitConverterType{

  POUND_TO_KILOGRAM(0.453592),
  KILOGRAM_TO_POUND(2.20462);

  private double baseAmount;

  WeightConversionType(double baseAmount) {
    this.baseAmount = baseAmount;
  }

  @Override
  public double getBaseAmount() {
    return baseAmount;
  }
}
