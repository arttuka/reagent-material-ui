(ns reagent-material-ui.core.alert
  "Imports @material-ui/core/Alert as a Reagent component.
   Original documentation is at https://material-ui.com/api/alert/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Alert" :as MuiAlert]))

(def alert (adapt-react-class (or (.-default MuiAlert) (.-Alert MuiAlert)) "mui-alert"))
