(ns reagent-material-ui.core.accordion-summary
  "Imports @material-ui/core/AccordionSummary as a Reagent component.
   Original documentation is at https://material-ui.com/api/accordion-summary/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/AccordionSummary" :as MuiAccordionSummary]))

(def accordion-summary (adapt-react-class (.-default MuiAccordionSummary) "mui-accordion-summary"))
