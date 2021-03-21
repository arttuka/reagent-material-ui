(ns reagent-material-ui.core.global-styles
  "Imports @material-ui/core/GlobalStyles as a Reagent component.
   Original documentation is at https://material-ui.com/api/global-styles/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/GlobalStyles" :as MuiGlobalStyles]))

(def global-styles (adapt-react-class (.-default MuiGlobalStyles) "mui-global-styles"))
