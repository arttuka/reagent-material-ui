(ns reagent-material-ui.core.accordion
  "Imports @material-ui/core/Accordion as a Reagent component.
   Original documentation is at https://material-ui.com/api/accordion/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Accordion" :as MuiAccordion]))

(def accordion (adapt-react-class (or (.-default MuiAccordion) (.-Accordion MuiAccordion)) "mui-accordion"))
