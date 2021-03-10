Feature:Online store
@Nozzles
  Scenario: Verify Nozzle which is Sterile high-precision conical bioprinting nozzles, 50 pieces and price under the online store

    Given User should be able to access to "Product" module - "OnlineStore" submodel
    When User should be able to select a category which name is "Nozzles"
    Then User should be able to see "Sterile high-precision conical bioprinting nozzles, 50 pieces" and "price"

@SortByPopularity
  Scenario: Verify that sorting in the Online Store is working as expected

    Given User should be able to access to "Product" module - "OnlineStore" submodel
    When User should be able to select a sorting which name is "Sort By Popularity"
    Then User should be able to see first result is "Sterile standard conical bioprinting nozzles, 50 pieces" and "price"
