import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {HttpService} from '../service/http.service';

@Component({
  selector: 'app-converter',
  templateUrl: './converter.component.html',
  styleUrls: ['./converter.component.css']
})
export class ConverterComponent implements OnInit {

  converterTypes = ['Length', 'Weight', 'Temperature'];
  unitTypes = [];

  lengthTypes = ['Mile', 'Kilometer'];
  weightTypes = ['Pound', 'Kilogram'];
  temperatureTypes = ['Celsius', 'Kelvin'];

  converterFormGroup = new FormGroup({
    converterType: new FormControl('', Validators.required),
    type1: new FormControl('', Validators.required),
    type2: new FormControl('', Validators.required),
    units: new FormControl('', Validators.required)
  });

  result = '';

  constructor(private httpService: HttpService) {
  }

  ngOnInit(): void {
  }

  filterUnitType(): void {

    const converterType = this.converterFormGroup.controls.converterType.value;
    switch (converterType) {
      case 'Length':
        this.unitTypes = this.lengthTypes;
        break;
      case 'Weight':
        this.unitTypes = this.weightTypes;
        break;
      case 'Temperature':
        this.unitTypes = this.temperatureTypes;
        break;
      default:
        this.unitTypes = [];
    }
  }

  convertUnits(): void {

    if (this.converterFormGroup.valid) {

      if (this.fromType === this.toType) {
        this.result = this.units;
      } else {
        const requestPath = this.buildRequestPath();

        this.httpService.sendGetRequest(requestPath)
          .toPromise().then(response => {
          this.result = response.data;
        });
      }
    }
  }

  buildRequestPath(): string {
    const path = this.converterFormGroup.controls.converterType.value.toLowerCase();
    const from = this.fromType;
    const to = this.toType;
    const units = this.units;

    return path + '/' + from + '_TO_' + to + '/' + units;
  }

  get fromType(): string {
    return this.converterFormGroup.controls.type1.value.toUpperCase();
  }

  get toType(): string {
    return this.converterFormGroup.controls.type2.value.toUpperCase();
  }

  get units(): string {
    return this.converterFormGroup.controls.units.value;
  }

}
