import {Injectable} from '@angular/core';
import {Observable} from 'rxjs';
import {HttpClient} from '@angular/common/http';
import {environment} from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class HttpService {

  constructor(private http: HttpClient) {
  }

  sendGetRequest(path: string): Observable<any> {

  }

  private getApiUrl() {
    return environment.apiUrl;
  }
}
