import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PerfilPesquisadoComponent } from './perfil-pesquisado.component';

describe('PerfilPesquisadoComponent', () => {
  let component: PerfilPesquisadoComponent;
  let fixture: ComponentFixture<PerfilPesquisadoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PerfilPesquisadoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PerfilPesquisadoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
