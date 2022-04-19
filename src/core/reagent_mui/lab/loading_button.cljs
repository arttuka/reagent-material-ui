(ns reagent-mui.lab.loading-button
  "Imports @mui/lab/LoadingButton as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/loading-button/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/LoadingButton" :as MuiLoadingButton]))

(def loading-button (adapt-react-class (.-default MuiLoadingButton) "mui-loading-button"))
