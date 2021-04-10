(ns reagent-material-ui.core.link
  "Imports @material-ui/core/Link as a Reagent component.
   Original documentation is at https://material-ui.com/api/link/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Link" :as MuiLink]))

(def link (adapt-react-class (.-default MuiLink) "mui-link"))
