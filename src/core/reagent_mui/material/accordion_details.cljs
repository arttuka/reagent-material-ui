(ns reagent-mui.material.accordion-details
  "Imports @mui/material/AccordionDetails as a Reagent component.
   Original documentation is at https://mui.com/api/accordion-details/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/AccordionDetails" :as MuiAccordionDetails]))

(def accordion-details (adapt-react-class (.-default MuiAccordionDetails) "mui-accordion-details"))
