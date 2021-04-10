(ns reagent-material-ui.core.container
  "Imports @material-ui/core/Container as a Reagent component.
   Original documentation is at https://material-ui.com/api/container/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Container" :as MuiContainer]))

(def container (adapt-react-class (.-default MuiContainer) "mui-container"))
