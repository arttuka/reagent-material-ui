(ns reagent-mui.base.use-snackbar
  "Imports @mui/base/SnackbarUnstyled/useSnackbar as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://mui.com/base/api/use-snackbar/ ."
  (:require [reagent-mui.util :refer [wrap-js-function]]
            ["@mui/base/SnackbarUnstyled" :as MuiSnackbarUnstyled]))

(def use-snackbar (wrap-js-function MuiSnackbarUnstyled/useSnackbar))
