(ns reagent-mui.material.accordion
  "Imports @mui/material/Accordion as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/accordion/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Accordion" :as MuiAccordion]))

(def accordion (r/adapt-react-class (.-default MuiAccordion)))
