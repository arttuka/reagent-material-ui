(ns reagent-mui.base.snackbar-unstyled
  "Imports @mui/base/SnackbarUnstyled as a Reagent component.
   Original documentation is at https://mui.com/base/api/snackbar-unstyled/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/base/SnackbarUnstyled" :as MuiSnackbarUnstyled]))

(def snackbar-unstyled (adapt-react-class (.-default MuiSnackbarUnstyled) "mui-snackbar-unstyled"))
