import { LazyAutocompleteComponent } from './lazy-autocomplete/lazy-autocomplete.component';
import { ReactiveFormsModule } from '@angular/forms';
import { SharedUiMaterialModule } from '@qro/shared/ui-material';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MultipleAutocompleteComponent } from './multiple-autocomplete/multiple-autocomplete.component';

@NgModule({
  imports: [CommonModule, SharedUiMaterialModule, ReactiveFormsModule],
  declarations: [MultipleAutocompleteComponent, LazyAutocompleteComponent],
  exports: [MultipleAutocompleteComponent, LazyAutocompleteComponent],
})
export class SharedUiMultipleAutocompleteModule {}
