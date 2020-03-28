(ns reagent-material-ui.core.tooltip
  "Imports @material-ui/core/Tooltip as a Reagent component.
   Original documentation is at https://material-ui.com/api/tooltip/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Tooltip" :as Tooltip]))

(def tooltip (adapt-react-class (or (.-default Tooltip) (.-Tooltip Tooltip)) "mui-tooltip"))
