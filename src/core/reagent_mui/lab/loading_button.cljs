(ns reagent-mui.lab.loading-button
  "Imports @mui/lab/LoadingButton as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/loading-button/ ."
  (:require [reagent.core :as r]
            ["@mui/lab/LoadingButton" :as MuiLoadingButton]))

(def loading-button (r/adapt-react-class (.-default MuiLoadingButton)))
