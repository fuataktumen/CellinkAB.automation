  Feature: BioPrinting
@BioPrinting
  Scenario:Verify that user should be able to navigate BioPrinting page

    Given User should be able to access to Web Site
    When User should be able to navigate Navigation Bars
    Then User should be able to navigate to BioPrinting Page
@BIOX
    Scenario: Verify that user should be able to navigate BIOX products

      Given User should be able to access to Web Site
      When User should be able to navigate "Product module" - "Bioprinting" submodel "BIOX" product
      Then User should be able to click BIOX product



