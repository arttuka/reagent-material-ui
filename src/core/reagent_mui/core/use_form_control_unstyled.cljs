(ns reagent-mui.core.use-form-control-unstyled
  "Imports @mui/core/FormControlUnstyled/useFormControlUnstyled as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://mui.com/api/use-form-control-unstyled/ ."
  (:require [reagent-mui.util :refer [wrap-js-function]]
            ["@mui/core/FormControlUnstyled" :as MuiFormControlUnstyled]))

(def use-form-control-unstyled (wrap-js-function (.-useFormControlUnstyled MuiFormControlUnstyled)))
