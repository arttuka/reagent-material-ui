(ns reagent-mui.material.accordion-details
  "Imports @mui/material/AccordionDetails as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/accordion-details/ ."
  (:require [reagent.core :as r]
            ["@mui/material/AccordionDetails" :as MuiAccordionDetails]))

(def accordion-details (r/adapt-react-class (.-default MuiAccordionDetails)))
