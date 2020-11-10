package com.kylesmit.ayoconverterserver.enums;

/**
 * @author kylesmit
 * Date: 2020/11/09
 */
public enum TemperatureConversionType implements UnitConverterType {
  KELVIN_TO_CELSIUS(-273.15),
  CELSIUS_TO_KELVIN(273.15);

  private double baseAmount;

  TemperatureConversionType(double baseAmount) {
    this.baseAmount = baseAmount;
  }

  @Override
  public double getBaseAmount() {
    return baseAmount;
  }
}
