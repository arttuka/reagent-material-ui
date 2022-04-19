(ns reagent-mui.material.accordion-actions
  "Imports @mui/material/AccordionActions as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/accordion-actions/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/AccordionActions" :as MuiAccordionActions]))

(def accordion-actions (adapt-react-class (.-default MuiAccordionActions) "mui-accordion-actions"))
