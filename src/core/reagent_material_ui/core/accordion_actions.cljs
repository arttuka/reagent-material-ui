(ns reagent-material-ui.core.accordion-actions
  "Imports @material-ui/core/AccordionActions as a Reagent component.
   Original documentation is at https://material-ui.com/api/accordion-actions/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/AccordionActions" :as MuiAccordionActions]))

(def accordion-actions (adapt-react-class (.-default MuiAccordionActions) "mui-accordion-actions"))
