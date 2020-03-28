(ns reagent-material-ui.core.divider
  "Imports @material-ui/core/Divider as a Reagent component.
   Original documentation is at https://material-ui.com/api/divider/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Divider" :as Divider]))

(def divider (adapt-react-class (or (.-default Divider) (.-Divider Divider)) "mui-divider"))
