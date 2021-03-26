@NOZZLESALL
Feature:Online store
@Nozzles @smoke
  Scenario: Verify Nozzle which is Sterile high-precision conical bioprinting nozzles, 50 pieces and price under the online store

    Given User should be able to access to "Product" module - "OnlineStore" submodel
    When User should be able to select a category which name is "Nozzles"
    Then User should be able to see "Sterile high-precision conical bioprinting nozzles, 50 pieces" and "price"

@SortByPopularity
  Scenario: Verify that sorting in the Online Store is working as expected

    Given User should be able to access to "Product" module - "OnlineStore" submodel
    When User should be able to select a sorting which name is "Sort By Popularity"
    Then User should be able to see first result is "Sterile standard conical bioprinting nozzles, 50 pieces" and "price"

  @productSearch

  Scenario: Verify that productSearch in the Online Store is working as expected

    Given User should be able to access to "Product" module - "OnlineStore" submodel
    When User should be able to send "al" under the PRODUCT SEARCH;
    Then User should be  able to see "scRapid 384" product under the Product Search


    @NozzlesProduct @smoke
    Scenario: Verify that user should be able to see 6 Nozzles products

      Given User should be able to access to "Product" module - "OnlineStore" submodel
      When User should be able to select a category which name is "Nozzles"
      Then User should be able to see 6 products

  @NozzlesProduct1 @smoke
  Scenario: Verify that user should be able to see first Nozzles product is "Nozzle kit"

    Given User should be able to access to "Product" module - "OnlineStore" submodel
    When User should be able to select a category which name is "Nozzles"
    Then User should be able to see first Nozzles product is "Nozzle kit"

  @NozzlesProduct2
  Scenario: Verify that user should be able to see second Nozzles product is "Sterile high-precision conical bioprinting nozzles, 50 pieces"

    Given User should be able to access to "Product" module - "OnlineStore" submodel
    When User should be able to select a category which name is "Nozzles"
    Then User should be able to see second Nozzles product is "Sterile high-precision conical bioprinting nozzles, 50 pieces"

  @NozzlesProduct3
  Scenario: Verify that user should be able to see first Nozzles product is "Sterile micron precision conical nozzles"

    Given User should be able to access to "Product" module - "OnlineStore" submodel
    When User should be able to select a category which name is "Nozzles"
    Then User should be able to see third Nozzles product is "Sterile micron precision conical nozzles"


  @NozzlesProduct4
  Scenario: Verify that user should be able to see first Nozzles product is "Sterile precision conical nozzles"

    Given User should be able to access to "Product" module - "OnlineStore" submodel
    When User should be able to select a category which name is "Nozzles"
    Then User should be able to see fourth Nozzles product is "Sterile precision conical nozzles"


  @NozzlesProduct5
  Scenario: Verify that user should be able to see first Nozzles product is "Sterile standard conical bioprinting nozzles, 50 pieces"

    Given User should be able to access to "Product" module - "OnlineStore" submodel
    When User should be able to select a category which name is "Nozzles"
    Then User should be able to see fifth Nozzles product is "Sterile standard conical bioprinting nozzles, 50 pieces"

  @NozzlesProduct6
  Scenario: Verify that user should be able to see first Nozzles product is "Thermoplastic nozzle"

    Given User should be able to access to "Product" module - "OnlineStore" submodel
    When User should be able to select a category which name is "Nozzles"
    Then User should be able to see sixth Nozzles product is "Thermoplastic nozzle"