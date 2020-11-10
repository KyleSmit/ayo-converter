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

  sendGetRequest(endPoint: string): Observable<any> {
    const url = this.getApiUrl() + endPoint;
    return this.http.get(url) as Observable<any>;
  }

  private getApiUrl(): string {
    return environment.apiUrl;
  }
}
