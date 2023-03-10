import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BoxscoreComponent } from './boxscore.component';

describe('BoxscoreComponent', () => {
  let component: BoxscoreComponent;
  let fixture: ComponentFixture<BoxscoreComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BoxscoreComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BoxscoreComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
