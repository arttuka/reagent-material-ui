(ns reagent-material-ui.lab.loading-button
  "Imports @material-ui/lab/LoadingButton as a Reagent component.
   Original documentation is at https://material-ui.com/api/loading-button/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/LoadingButton" :as MuiLoadingButton]))

(def loading-button (adapt-react-class (.-default MuiLoadingButton) "mui-loading-button"))
