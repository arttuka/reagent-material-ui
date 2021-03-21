(ns reagent-material-ui.core.accordion-details
  "Imports @material-ui/core/AccordionDetails as a Reagent component.
   Original documentation is at https://material-ui.com/api/accordion-details/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/AccordionDetails" :as MuiAccordionDetails]))

(def accordion-details (adapt-react-class (.-default MuiAccordionDetails) "mui-accordion-details"))
