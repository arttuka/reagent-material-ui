(ns reagent-mui.material.accordion
  "Imports @mui/material/Accordion as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/accordion/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Accordion" :as MuiAccordion]))

(def accordion (adapt-react-class (.-default MuiAccordion) "mui-accordion"))
