(ns reagent-material-ui.core.grow
  "Imports @material-ui/core/Grow as a Reagent component.
   Original documentation is at https://material-ui.com/api/grow/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Grow" :as MuiGrow]))

(def grow (adapt-react-class (.-default MuiGrow) "mui-grow"))
