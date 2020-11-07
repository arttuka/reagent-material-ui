(ns reagent-material-ui.pickers.use-utils
  "Imports @material-ui/pickers/useUtils as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/useUtils/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def use-utils (adapt-react-class (.-useUtils pickers) "mui-use-utils"))
