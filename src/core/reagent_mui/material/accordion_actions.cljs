(ns reagent-mui.material.accordion-actions
  "Imports @mui/material/AccordionActions as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/accordion-actions/ ."
  (:require [reagent.core :as r]
            ["@mui/material/AccordionActions" :as MuiAccordionActions]))

(def accordion-actions (r/adapt-react-class (.-default MuiAccordionActions)))
