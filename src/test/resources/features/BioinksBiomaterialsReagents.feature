Feature:BioinksBiomaterialsReagents
@BioinksBiomaterialsReagents
Scenario:Verify that user should be able to navigate HAMA Lyophilizate under the BioinksBiomaterialsReagents

Given User should be able to access to Web Site
When User should be able to navigate Product module - Bioinks Biomaterials Reagents - Materials for bioink development - Concentrated Components - HAMA Lyophilizate
Then User should be able to click HAMA Lyophilizate product

@ResultMessage
  Scenario:Verify that user should be able to see Search message

  Given User should be able to access to Web Site
    And User should be able to access to Product module - Bioinks, Biomaterials & Reagents - WhatisABionk?
    When User should be able to click WhatisABionk? - Bionk Selection Guide
    Then User should be able to click Organoids - Liver
    And  User should be able to see "message"