package com.workintech.tax;

import org.springframework.stereotype.Component;

@Component
public class DeveloperTax implements Taxable {
    public double getSimpleTaxRate() {
        return 0.15;
    }
    public double getMiddleTaxRate() {
        return 0.25;
    }
    public double getUpperTaxRate() {
        return 0.35;
    }
}
