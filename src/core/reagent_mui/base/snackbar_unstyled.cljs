(ns reagent-mui.base.snackbar-unstyled
  "Imports @mui/base/SnackbarUnstyled as a Reagent component.
   Original documentation is at https://mui.com/base/api/snackbar-unstyled/ ."
  (:require [reagent.core :as r]
            ["@mui/base/SnackbarUnstyled" :as MuiSnackbarUnstyled]))

(def snackbar-unstyled (r/adapt-react-class (.-default MuiSnackbarUnstyled)))
