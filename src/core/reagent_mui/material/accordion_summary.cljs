(ns reagent-mui.material.accordion-summary
  "Imports @mui/material/AccordionSummary as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/accordion-summary/ ."
  (:require [reagent.core :as r]
            ["@mui/material/AccordionSummary" :as MuiAccordionSummary]))

(def accordion-summary (r/adapt-react-class (.-default MuiAccordionSummary)))
