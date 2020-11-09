package com.kylesmit.ayoconverterweb.units;

import com.kylesmit.ayoconverterweb.enums.UnitConverterType;

/**
 * @author kylesmit
 * Date: 2020/11/09
 */
public interface Converter {

  double convertUnits(double unitAmount, UnitConverterType unitConverterType);
}
