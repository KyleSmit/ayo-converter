package com.kylesmit.ayoconverterserver.units;

import com.kylesmit.ayoconverterserver.enums.UnitConverterType;

/**
 * @author kylesmit
 * Date: 2020/11/09
 */
public interface Converter {

  double convertUnits(double unitAmount, UnitConverterType unitConverterType);
}
