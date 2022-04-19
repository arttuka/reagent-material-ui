(ns reagent-mui.material.accordion-summary
  "Imports @mui/material/AccordionSummary as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/accordion-summary/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/AccordionSummary" :as MuiAccordionSummary]))

(def accordion-summary (adapt-react-class (.-default MuiAccordionSummary) "mui-accordion-summary"))
