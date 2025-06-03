package com.workintech.s17d2.tax;

public interface Taxable {
    double getSimpleTaxRate();
    double getMiddleTaxRate();
    double getUpperTaxRate();
}
