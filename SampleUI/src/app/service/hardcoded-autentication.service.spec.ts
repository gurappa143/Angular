import { TestBed } from '@angular/core/testing';

import { HardcodedAutenticationService } from './hardcoded-autentication.service';

describe('HardcodedAutenticationService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: HardcodedAutenticationService = TestBed.get(HardcodedAutenticationService);
    expect(service).toBeTruthy();
  });
});
